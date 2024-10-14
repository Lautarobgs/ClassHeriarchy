package interfaces.jdbcinterfaces;

import classes.MusicGenreJDBC;

import java.sql.SQLException;
import java.util.List;

public interface IMusicGenreService {
    void create(MusicGenreJDBC genre) throws SQLException;
    List<MusicGenreJDBC> getAllGenres() throws SQLException;
    MusicGenreJDBC getGenreById(Long id) throws SQLException;
    void update(MusicGenreJDBC genre) throws SQLException;
    void delete(Long id) throws SQLException;
}
