-- Создаем базу данных 
CREATE DATABASE phones_magazine ENCODING 'UTF-8';

-- Создаем таблицу ролей
CREATE TABLE IF NOT EXISTS roles (
    id   SERIAL PRIMARY KEY,
    role VARCHAR(5) NOT NULL  
);

-- Заполняем таблицу ролей
INSERT INTO roles (id, role) VALUES (DEFAULT, 'admin');
INSERT INTO roles (id, role) VALUES (DEFAULT, 'user');

-- Создаем таблицу пользователей
CREATE TABLE IF NOT EXISTS users (
    id       SERIAL PRIMARY KEY,
    login    VARCHAR(10) UNIQUE NOT NULL,
    password VARCHAR(10) UNIQUE NOT NULL,
    role     INTEGER     NOT NULL,
    FOREIGN KEY (role) REFERENCES roles (id)
);

-- Заполняем таблицу пользователей
-- Создаем пользователей
-- для лекции 1
INSERT INTO users (id, login, password, role) VALUES (DEFAULT, 't-800', '123', 1);
INSERT INTO users (id, login, password, role) VALUES (DEFAULT, 't-1000', '1234', 2);

-- для лекции 2
INSERT INTO users (id, login, password, role) VALUES (DEFAULT, 'admin', '123', 1);
INSERT INTO users (id, login, password, role) VALUES (DEFAULT, 'useer', '1234', 2);

-- Выгрузить пользователя с ролью
-- Получение
SELECT u.id, u.login, u.password, r.id AS rol_id, r.role FROM users AS u LEFT JOIN roles AS r ON u.role = r.id WHERE u.login = (?);

-- Добавление пользователя
INSERT INTO users (id, login, password, role) VALUES (DEFAULT, (?), (?), (?)) RETURNING id;

-- Удалить пользователя
DELETE FROM users WHER id = (?) AND login = (?) AND password = (?) RETURNING id;

-- Обновить пользователя
UPDATE users SET password = (?) WHERE id = (?) RETURNING id;

-- Модели телефонов
СREATE TABLE IF NOT EXISTS phone_models (
    id SERIAL PRIMARY KEY,
    name VARCHAR(15) UNIQUE NOT NULL
);

**********************************
-- Удаление записи из таблицы
-- Например, удалить все строки из таблицы с товарами, имеющими цену 10, можно так:
DELETE FROM products WHERE price = 10;

-- Удаление всех строк 
DELETE FROM productes
**********************************




