package model;

public class Cliente {


    private final InfoPersonal infoPersonal;
    private final Gustos gustos;
    private final InfoAbstractaCliente infoAbstracta;


    public Cliente(InfoPersonal infoPersonal, Gustos gustos, InfoAbstractaCliente infoAbstracta) {
        this.infoPersonal = infoPersonal;
        this.gustos = gustos;
        this.infoAbstracta = infoAbstracta;
    }

    public InfoPersonal getInfoPersonal() {
        return infoPersonal;
    }

    public Gustos getGustos() {
        return gustos;
    }

    public InfoAbstractaCliente getInfoAbstracta() {
        return infoAbstracta;
    }

    @Override
    public String toString() {
        return infoPersonal.toString();
    }
}
