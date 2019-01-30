package model;

public class InfoPersonal {

    public enum EstadoCivil{
        Soltero, Casado, Divorciado, Viudo
    }


    private final int edad;
    private final EstadoCivil estadoCivil;
    private final int nHijos;
    private final boolean discapacidad;
    private final int costeMax;

    public InfoPersonal(int edad, EstadoCivil estadoCivil,int nHijos, boolean discapacidad, int costeMax) {
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.discapacidad = discapacidad;
        this.costeMax = costeMax;
        this.nHijos = nHijos;
    }

    public int getNHijos() {
		return nHijos;
	}

	public int getEdad() {
        return edad;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public int getCosteMax() {
        return costeMax;
    }

    @Override
    public String toString() {
        return "InfoPersonal{" +
                "edad=" + edad +
                ", estadoCivil=" + estadoCivil +
                ", discapacidad=" + discapacidad +
                ", hijos=" + nHijos +
                ", costeMax=" + costeMax +
                '}';
    }
    
    
}
