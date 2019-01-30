package model;

import java.util.Set;

import static model.Gustos.Comida;

public class Restaurante {

    private final Set<Comida> tipo;
    private final int coste;
    private final boolean necesidadMovilidad;
    private final String nombre;

    public Restaurante(Set<Comida> tipo, int coste, boolean necesidadMovilidad, String nombre) {
        this.tipo = tipo;
        this.coste = coste;
        this.necesidadMovilidad = necesidadMovilidad;
        this.nombre = nombre;
    }

    public Set<Comida> getTipo() {
        return tipo;
    }

    public int getCoste() {
        return coste;
    }

    public boolean isNecesidadMovilidad() {
        return necesidadMovilidad;
    }

	public String getNombre() {
		return nombre;
	}

}
