package Pruebas;

import junit.framework.TestCase;
import model.data_structures.Nodo;

public class NodoTests extends TestCase {
	
	
	private  Nodo<String> prueba;
	private Nodo<Integer> prueba2;
	private Nodo<Integer> prueba3;
	
	private void setUpEscenario1(){
		
		prueba = new Nodo<String>("Daniel");
	}
	private void setUpEscenario2(){
		prueba2 = new Nodo<Integer>(1);
		prueba3 = new Nodo<Integer>(2);

		
		try {
			
			prueba3.cambiarSiguiente(prueba2);
			
		} catch (Exception e) {
			fail("Error en los métodos básicos de los nodos");
		}
		
	}
	
	public void testConStrings()
	{
		setUpEscenario1( );

        assertEquals( "El nodo no se inicializó correctamente",null, prueba.darSiguiente() );
        assertEquals( "La información que contiene el nodo es erronea", "Daniel", prueba.darObjeto() );
		
		
	}
	
	public void testConIntegers()
	{
		setUpEscenario2( );

        assertEquals( "El nodo no se inicializó correctamente","1", Integer.toString(prueba3.darSiguiente().darObjeto()) );
 
      
	}
	
	
	
	
	
	
	

}
