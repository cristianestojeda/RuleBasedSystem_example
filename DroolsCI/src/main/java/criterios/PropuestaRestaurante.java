package criterios;

import java.util.Date;

import model.Restaurante;
import model.Cliente;

public class PropuestaRestaurante {

    private final Restaurante restaurante;
    private final Cliente cliente;
    private final Date date;
    private boolean decision = false;

    public PropuestaRestaurante(Restaurante restaurante, Cliente cliente, Date date) {
        this.restaurante = restaurante;
        this.cliente = cliente;
        this.date = date;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getDate() {
        return date;
    }

	public boolean isDecision() {
		return decision;
	}

	public void aprobar() {
		this.decision = true;
	}
    
}
