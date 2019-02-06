package model.data_structures;

public class Nodo<K> {
	

	
	// El nodo contiene en sus atributos toda la información sobre cada accidente
	private Nodo<K> siguiente;
	private K objeto;
	
	
	
	public Nodo(K pObjeto){
		objeto = pObjeto;
		siguiente = null;
	}
	
	public Nodo<K> darSiguiente(){
		return siguiente;
	}
	
	
	public void cambiarSiguiente(Nodo<K> pNuevoSiguiente){
		siguiente = pNuevoSiguiente;
	}
	
	public K darObjeto(){
		return objeto;
	}
	

	
}
