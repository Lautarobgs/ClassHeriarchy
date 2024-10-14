package classes.jdbc;

import classes.MusicGenreJDBC;
import interfaces.jdbcinterfaces.GenericDao;
import interfaces.jdbcinterfaces.IMusicGenreService;

import java.sql.SQLException;
import java.util.List;

public class MusicGenreService implements IMusicGenreService {
    private final GenericDao<MusicGenreJDBC> genreDAO;

    // Constructor where the DAO is injected
    public MusicGenreService(GenericDao<MusicGenreJDBC> genreDAO) {
        this.genreDAO = genreDAO;
    }

    @Override
    public void create(MusicGenreJDBC genre) throws SQLException {
        genreDAO.create(genre);
    }

    @Override
    public List<MusicGenreJDBC> getAllGenres() throws SQLException {
        return genreDAO.readAll();
    }

    @Override
    public MusicGenreJDBC getGenreById(Long id) throws SQLException {
        return genreDAO.readById(id);
    }

    @Override
    public void update(MusicGenreJDBC genre) throws SQLException {
        genreDAO.update(genre);
    }

    @Override
    public void delete(Long id) throws SQLException {
        genreDAO.delete(id);
    }
}
