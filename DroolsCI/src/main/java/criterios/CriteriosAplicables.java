package criterios;

public class CriteriosAplicables {

    public static final int ACTIVO = 1;
    public static final int NOACTIVO = 0;
    public static final int NOAPLICABLE = -1;

    public enum Capacidad {
        Movilidad, Pago, Comidas
    }

    private int estado;
    private boolean verificado = false;
    private final Capacidad tipoCriterio;
    private int nComunes = -1; // solo para tipo Comidas

    public CriteriosAplicables(Capacidad tipoCriterio) {
        this.estado = NOACTIVO;
        this.verificado = false;
        this.tipoCriterio = tipoCriterio;
    }

    public String getEstado() {
        switch(estado) {
	        case ACTIVO: return "activo";
	        case NOACTIVO: return "no activo";
	        case NOAPLICABLE: return "no aplicable";
	        default: return "UNKNOWN";
        }
    }

    public boolean isVerificado() {
        return verificado;
    }

    public Capacidad getTipoCriterio() {
        return tipoCriterio;
    }

    public int getnComunes() {
        return nComunes;
    }

	public void setEstado(int activo) {
		this.estado = activo;
	}

	public void verificar() {
		this.verificado = true;
	}
	
	public void activar() {
		this.estado = ACTIVO;
	}
	
	public void setnComunes(int nComunes) {
        this.nComunes = nComunes;
    }
	
}
