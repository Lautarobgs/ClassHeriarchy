package classes.jdbc;

import classes.MusicGenreJDBC;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MusicGenreDAO extends GenericDaoImp<MusicGenreJDBC>{
    // Logger for the class
    private static final Logger logger = LogManager.getLogger(MusicGenreDAO.class);

    @Override
    protected String getTableName() {
        return "Genres";
    }

    @Override
    public void create(MusicGenreJDBC genre) throws SQLException {
        String sql = "INSERT INTO " + getTableName() + " (genre_name) VALUES (?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, genre.getName());
            stmt.executeUpdate();
            logger.info("Genre '{}' inserted successfully.", genre.getName());

        } catch (SQLException e) {
            logger.error("Error inserting genre: {}", genre.getName(), e);
            throw e;
        }
    }

    @Override
    public List<MusicGenreJDBC> readAll() throws SQLException {
        String sql = "SELECT genre_id, genre_name FROM " + getTableName();
        List<MusicGenreJDBC> genres = new ArrayList<>();

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Long id = rs.getLong("genre_id");
                String name = rs.getString("genre_name");

                genres.add(new MusicGenreJDBC(name, id));
            }

            logger.info("Read {} genres successfully.", genres.size());

        } catch (SQLException e) {
            logger.error("Error reading genres.", e);
            throw e;
        }

        return genres;
    }

    @Override
    public MusicGenreJDBC readById(Long id) throws SQLException {
        String sql = "SELECT genre_id, genre_name FROM " + getTableName() + " WHERE genre_id = ?";
        MusicGenreJDBC genre = null;

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("genre_name");
                    genre = new MusicGenreJDBC(name, id);
                    logger.info("Genre with ID {} found: {}", id, name);
                } else {
                    logger.warn("No genre found with ID {}.", id);
                }
            }

        } catch (SQLException e) {
            logger.error("Error reading genre by ID: {}", id, e);
            throw e;
        }

        return genre;
    }

    @Override
    public void update(MusicGenreJDBC genre) throws SQLException {
        String sql = "UPDATE " + getTableName() + " SET genre_name = ? WHERE genre_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, genre.getName());
            stmt.setLong(2, genre.getId());
            stmt.executeUpdate();

            logger.info("Genre with ID {} updated to '{}'.", genre.getId(), genre.getName());

        } catch (SQLException e) {
            logger.error("Error updating genre with ID {}.", genre.getId(), e);
            throw e;
        }
    }

    @Override
    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM " + getTableName() + " WHERE genre_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            stmt.executeUpdate();

            logger.info("Genre with ID {} deleted successfully.", id);

        } catch (SQLException e) {
            logger.error("Error deleting genre with ID {}.", id, e);
            throw e;
        }
    }

}
