package service.com.hotel.rooms;

import com.hotel.rooms.RequestDocument;
import com.hotel.rooms.ResponseDocument;
import com.hotel.rooms.ResponseDocument.Response;
import com.hotel.rooms.Room;
import com.hotel.rooms.RoomsServiceSkeleton;

import java.util.List;

public class RoomsServiceImpl extends RoomsServiceSkeleton
{
    /**
     * RoomDao, es el puente entre cualquier RoomDto
     * que haya sido creado al atender una peticion y la base de datos.
     *
     * Propiedad inyectada por Spring con el metodo setRoomDao(...);
     */
    private RoomDao roomDao;
    public void setRoomDao(RoomDao roomDao)
    {
        this.roomDao = roomDao;
    }

    @Override
    public ResponseDocument roomsOperation(RequestDocument request)
    {
        ResponseDocument document = ResponseDocument.Factory.newInstance();
        Response response = document.addNewResponse(); //Respuesta vacia por defecto

        List<RoomDto> cuartosDisponibles = roomDao.findAvailableRooms(request.getRequest());
        if(cuartosDisponibles.size() > 0)
        {
            System.out.println("Total de cuartos disponibles: " + cuartosDisponibles.size());
            RoomDto roomDto = cuartosDisponibles.get(0); //Solo se toma el primer cuarto disponible
            Room available = response.addNewCuarto(); //Ya no es respuesta vacia
            roomDto.putInto(available); //Se asignan los valores al objeto XML de la respuesta
        }
        else
            System.out.println("No hay cuartos disponibles carnal");
        return document;
    }
}
