package service.com.hotel.rooms;

import com.hotel.rooms.RequestDocument.Request;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Room Data Access Object.
 * El puente de dos mundos maravillosos:
 * Bases de datos y objetos Java (Data Transfer Objects)
 */
public class RoomDao
{
    /**
     * JdbcTemplate para acceder a la base de datos del Hotel.
     * Propiedad inyectada por Spring con el metodo setJdbcTemplate(...);
     */
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    //=============METODOS DE ACCESO A DATOS=================

    public List<RoomDto> findAvailableRooms(Request reservation)
    {
        String query = "SELECT * FROM Cuartos WHERE no_cuarto = 3";
        return jdbcTemplate.query(query, new RoomMapper()); //Ver service.com.hotel.rooms.RoomMapper
    }
}
