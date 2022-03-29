package com.postgresql_jdbc.jdbc;

// DAO - Data Access Object

public interface DAO<Entity, Key> {
    boolean create(Entity model);
    Entity read(Key key);
    boolean update(Entity model);
    boolean delete(Entity model);
}
