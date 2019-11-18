package service.com.hotel.rooms;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RoomMapper se utiliza para mapear la respuesta del jdbcTemplate
 * a un objeto de tipo service.com.hotel.rooms.RoomDto.
 *
 * Es necesario porque las propiedades del DTO no coinciden
 * con las propiedades del esquema definido en la base de datos.
 */
public class RoomMapper implements RowMapper
{
    @Override
    public RoomDto mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        RoomDto roomDto = new RoomDto();
        roomDto.setNoCuarto(rs.getInt("no_cuarto"));
        roomDto.setNombreCuarto(rs.getString("nombre_cuarto"));
        roomDto.setTipoCuarto(rs.getString("tipo_cuarto"));
        roomDto.setPrecioNoche(rs.getInt("precio_noche"));
        roomDto.setEstatus(rs.getInt("estatus"));
        return roomDto;
    }
}
