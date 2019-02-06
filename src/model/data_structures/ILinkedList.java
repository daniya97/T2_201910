package model.data_structures;
import com.opencsv.CSVReader;


/**
 * Abstract Data Type for a linked list of generic objects
 * This ADT should contain the basic operations to manage a list
 * add, addAtEnd, AddAtK, getElement, getCurrentElement, getSize, delete, deleteAtK
 * next, previous
 * @param <T>
 */
public interface ILinkedList<K> extends Iterable<K> {


	void agregarElementoPrimeraPosicion(K pNuevo);
	int darTamanoLista();
	Nodo<K> darPrimerNodo();


}
