package service.com.hotel.rooms;

import com.hotel.rooms.Room;

/** Room Data Transfer Object*/
public class RoomDto
{
    private int noCuarto;
    private String nombreCuarto;
    private String tipoCuarto;
    private double precioNoche;
    private int estatus;

    public RoomDto() { }

    public RoomDto(String nombreCuarto, String tipoCuarto, double precioNoche, int estatus)
    {
        this.nombreCuarto = nombreCuarto;
        this.tipoCuarto = tipoCuarto;
        this.precioNoche = precioNoche;
        this.estatus = estatus;
    }

    /**
     * Metodo utilizado que funciona como Casteador.
     * Establece los valores del objeto actual,
     * a un objeto XML generado por el ResponseDocument.
     * @param room objecto XML del ResponseDocument
     */
    public void putInto(Room room)
    {
        room.setNumeroCuarto(noCuarto);
        room.setNombre(nombreCuarto);
        room.setTipoCuarto(tipoCuarto);
        room.setPrecioNoche(precioNoche);
    }

    public int getNoCuarto()
    {
        return noCuarto;
    }

    public void setNoCuarto(int noCuarto)
    {
        this.noCuarto = noCuarto;
    }

    public String getNombreCuarto()
    {
        return nombreCuarto;
    }

    public void setNombreCuarto(String nombreCuarto)
    {
        this.nombreCuarto = nombreCuarto;
    }

    public String getTipoCuarto()
    {
        return tipoCuarto;
    }

    public void setTipoCuarto(String tipoCuarto)
    {
        this.tipoCuarto = tipoCuarto;
    }

    public double getPrecioNoche()
    {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche)
    {
        this.precioNoche = precioNoche;
    }

    public int getEstatus()
    {
        return estatus;
    }

    public void setEstatus(int estatus)
    {
        this.estatus = estatus;
    }
}
