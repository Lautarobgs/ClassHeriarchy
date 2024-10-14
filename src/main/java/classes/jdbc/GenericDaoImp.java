package classes.jdbc;

import interfaces.jdbcinterfaces.GenericDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public abstract class GenericDaoImp<T> implements GenericDao<T> {


    protected Connection getConnection() throws SQLException {
        return DBConnection.getConnection();
    }


    protected abstract String getTableName();


    public abstract void create(T entity) throws SQLException;

    // Método para leer todos los registros
    public abstract List<T> readAll() throws SQLException;

    // Método para leer por ID
    public abstract T readById(Long id) throws SQLException;

    // Método para actualizar un registro
    public abstract void update(T entity) throws SQLException;

    // Método para eliminar un registro por ID
    public abstract void delete(Long id) throws SQLException;
}
