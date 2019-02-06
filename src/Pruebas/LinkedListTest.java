package Pruebas;

import junit.framework.TestCase;
import model.data_structures.LinkedList;

public class LinkedListTest extends TestCase {


	private LinkedList<String> linkedList;



	private void setUpEscenario1(){
		linkedList = new LinkedList<String>(null);

		try {

			linkedList.agregarElementoPrimeraPosicion("Daniel");
			linkedList.agregarElementoPrimeraPosicion("Camila");


		} catch (Exception e) {
			fail("Revisa los m�todos de agregar de las lista encadenada (�ltima y primera posici�n");
		}


	}
	
	
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



	public void testLinkedListAgregaryTamano()
	{
		setUpEscenario1();
		assertEquals("No se agregaron correctamente los artistas",2,linkedList.darTamanoLista());
		assertEquals("No se agregaron correctamente los artistas","Camila", linkedList.darPrimerNodo().darObjeto());
		assertEquals("No se agregaron correctamente los artistas","Daniel", linkedList.darPrimerNodo().darSiguiente().darObjeto());

	}
	

	public void testLinkedListAgregaryTamano2()
	{
		setUpEscenario2();
		assertEquals("No se agregaron correctamente los artistas",4,linkedList.darTamanoLista());
		assertEquals("No se agregaron correctamente los artistas","Maria", linkedList.darPrimerNodo().darObjeto());
		assertEquals("No se agregaron correctamente los artistas","Daniel", linkedList.darPrimerNodo().darSiguiente().darObjeto());

	}
	
	public void testLinkedListTamano()
	{
		setUpEscenario3();
		assertEquals("No se agregaron correctamente los artistas",26,linkedList.darTamanoLista());
	}


}
