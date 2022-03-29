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

INSERT INTO users (id, login, password, role) VALUES (DEFAULT, 't-800', '123', 1);
INSERT INTO users (id, login, password, role) VALUES (DEFAULT, 't-1000', '1234', 2);