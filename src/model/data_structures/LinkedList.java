package model.data_structures;

import java.util.Iterator;

public class LinkedList <K> implements ILinkedList<K>{
	
	private Nodo<K> primero;
	
	
	public LinkedList(K primerNodo) {
		primero = new Nodo<>(primerNodo);
	}
	
	@Override
	public Iterator<K> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarElementoPrimeraPosicion(K pNuevo){
		
		Nodo<K> nuevo = new Nodo<>(pNuevo);
		K auxiliar = primero.darObjeto();
		
		
		if (primero.equals(null))
			primero = nuevo;
		else
		{
		nuevo.cambiarSiguiente(primero);
		primero = nuevo;
		}
		
		
	}
	

	@Override
	public int darTamanoLista() {
	
		int contador = 0;
		
		Nodo<K> actual = primero;
		while(actual.darObjeto() !=null)
		{
			contador ++;
			actual = actual.darSiguiente();
		}
		
		return contador;
	}



	@Override
	public Nodo<K> darPrimerNodo() {
		return primero;
	}
	

}
