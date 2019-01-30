package model;

import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class Gustos {

    public enum Comida {
        Italiano, Espanola, Oriental, Occidental, Francesa, Britanica, Tradicional, Moderna
    }

    private final Set<Comida> comidas;

    public Gustos(){
        comidas = new HashSet<>();
    }
    
    public Gustos(Collection<Comida> col) {
    	this.comidas = new HashSet<Comida>(col);
    }

    public Set<Comida> getComidas() {
        return comidas;
    }
}
