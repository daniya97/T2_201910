package Pruebas;

import junit.framework.TestCase;
import model.data_structures.LinkedList;
/**
 * Prueba las principales funciones de la lista encadenada
 */
public class LinkedListTest extends TestCase {


	private LinkedList<String> linkedList;


	/**
	 * Se crea el escenario 1
	 */
	private void setUpEscenario1(){
		linkedList = new LinkedList<String>(null);

		try {

			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Camila");


		} catch (Exception e) {
			fail("Revisa los m�todos de agregar de las lista encadenada (�ltima y primera posici�n");
		}


	}
	
	/**
	 * Se crea el escenario 2
	 */
	private void setUpEscenario2(){
		linkedList = new LinkedList<String>(null);

		try {

			linkedList.agregarElementoPrimeraPosicion("Juan");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");


		} catch (Exception e) {
			fail("Fall� 2: Revisa los m�todos de agregar de las lista encadenada (�ltima y primera posici�n");
		}


	}
	
	/**
	 * Se crea el escenario 3
	 */
	private void setUpEscenario3(){
		linkedList = new LinkedList<String>(null);

		try {

			linkedList.agregarElementoPrimeraPosicion("Juan");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");
			linkedList.agregarElementoPrimeraPosicion("Juan");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");
			linkedList.agregarElementoPrimeraPosicion("Camila");
			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Maria");


		} catch (Exception e) {
			fail("Fall� 2: Revisa los m�todos de agregar de las lista encadenada (�ltima y primera posici�n");
		}


	}

	
	/**
	 * Se agregan elementos y se pide el tama�o
	 */
	public void testLinkedListAgregaryTamano()
	{
		setUpEscenario1();
		assertEquals("No se agregaron correctamente los artistas",2,linkedList.darTamanoLista());
		assertEquals("No se agregaron correctamente los artistas","Camila", linkedList.darPrimerNodo().darObjeto());
		assertEquals("No se agregaron correctamente los artistas","Daniel", linkedList.darPrimerNodo().darSiguiente().darObjeto());

	}
	
	/**
	 * Se agregan elementos y se pide el tama�o
	 */
	public void testLinkedListAgregaryTamano2()
	{
		setUpEscenario2();
		assertEquals("No se agregaron correctamente los artistas",4,linkedList.darTamanoLista());
		assertEquals("No se agregaron correctamente los artistas","Maria", linkedList.darPrimerNodo().darObjeto());
		assertEquals("No se agregaron correctamente los artistas","Daniel", linkedList.darPrimerNodo().darSiguiente().darObjeto());

	}
	
	
	/**
	 * Se determina el tama�o de una lita con varios elementos
	 */
	public void testLinkedListTamano()
	{
		setUpEscenario3();
		assertEquals("No se agregaron correctamente los artistas",26,linkedList.darTamanoLista());
	}


}
