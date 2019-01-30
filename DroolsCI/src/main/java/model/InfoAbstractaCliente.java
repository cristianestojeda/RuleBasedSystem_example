package model;

public class InfoAbstractaCliente {

    public enum RangoEdad{
        Joven, Adulto, Mayor
    }

    private RangoEdad rangoEdad;

    private boolean capacidadMovilidad = true;

    public boolean isCapacidadMovilidad() {
		return capacidadMovilidad;
	}

	public void setCapacidadMovilidad(boolean capacidadMovilidad) {
		this.capacidadMovilidad = capacidadMovilidad;
	}

	public InfoAbstractaCliente() {
        
    }

    public RangoEdad getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(RangoEdad rango) {
        this.rangoEdad = rango;
    }
}