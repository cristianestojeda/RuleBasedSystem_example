package herramientas;

import java.util.HashSet;
import model.Gustos.Comida;

import java.util.Set;

public class OperacionesConjuntos {
	public static HashSet<String> interseccion(Set<String> conjunto1, Set<String> conjunto2) {
		HashSet<String> copiaConjunto1 = new HashSet<String>(conjunto1);
		copiaConjunto1.retainAll(conjunto2);
		return copiaConjunto1;
	}
	
	public static HashSet<Comida> interseccionComidas(Set<Comida> conjunto1, Set<Comida> conjunto2) {
		HashSet<Comida> copiaConjunto1 = new HashSet<Comida>(conjunto1);
		copiaConjunto1.retainAll(conjunto2);
		return copiaConjunto1;
	}
	
	public static int tamanoConjunto(HashSet<String> conjunto) {
		return conjunto.size();
	}
	
	public static int tamanoConjuntoComida(Set<Comida> conjunto) {
		return conjunto.size();
	}

}
