package interfaces.jdbcinterfaces;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface GenericDao<T>{
    void create(T entity) throws SQLException;
    List<T> readAll() throws SQLException;
    T readById(Long id) throws SQLException;
    void update(T entity) throws SQLException;
    void delete(Long id) throws SQLException;

}
