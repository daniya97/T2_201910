package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;


import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import sun.awt.util.IdentityLinkedList;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;
import model.data_structures.Nodo;
/**
 * Maneja las infracciones de tránsito a trvés de una lista encadenada
 */
public class MovingViolationsManager implements IMovingViolationsManager {

	
	/**
	 * Lista encadenada que guarda todas las infracciones
	 */
	private LinkedList<VOMovingViolations> movingViolations = new LinkedList<>(null);

	/**
	 * Método para cargar las infracciones de un csv
	 */

	public void loadMovingViolations(String movingViolationsFile){
		// TODO Auto-generated method stub

		 
		//Lector del CSV
		CSVReader reader = null;
		try {
			
			// Intenta cargar los datos excluyendo la primera fila
			boolean primeraFila = false;
			reader = new CSVReader(new FileReader("./data/"+movingViolationsFile));
			// Para cada línea, se crea una nueva infracción y se agrega a la lista encadenada
			for(String[] nextLine : reader) {
				
				if (primeraFila){
				VOMovingViolations nuevo = new VOMovingViolations(nextLine);
				movingViolations.agregarElementoPrimeraPosicion(nuevo);
				}
				
				primeraFila = true;

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}






	}

	/**
	 * Método para obtener las infracciones que correspondan a un violation code
	 */
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {

		
		// Lista auxiliar donde se guardaran las infracciones que cumplan con el violationCode
		LinkedList<VOMovingViolations> nueva = new LinkedList<VOMovingViolations>(null);
		// Se recorre la lista con todas las infracciones revisando si cumple o no con el violationCode
		Nodo<VOMovingViolations> actual = movingViolations.darPrimerNodo();



		while(actual != null)
		{
			VOMovingViolations contador = actual.darObjeto();
			if(contador!=null){
				if(contador.getViolationCode().equals(violationCode)){
					nueva.agregarElementoPrimeraPosicion(contador);
				}

			}
			
			actual = actual.darSiguiente();
		}


		
		//Se retorna una nueva lista encadenada con elementos que cumplen la condición
		return nueva;
	}

	
	/**
	 * Método para obtener las infracciones que correspondan a un indicador
	 */
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {

			
	
		// Lista auxiliar donde se guardan los elementos que tenga el accidentIndicator dado por parámetro
		LinkedList<VOMovingViolations> nueva = new LinkedList<VOMovingViolations>(null);
		//Se recorre la lista de todas las infracciones revisando la condición
		Nodo<VOMovingViolations> actual = movingViolations.darPrimerNodo();


		while(actual != null)
		{
			VOMovingViolations contador = actual.darObjeto();
			if(contador!=null){
				if(contador.getAccidentIndicator().equals(accidentIndicator)){
					nueva.agregarElementoPrimeraPosicion(contador);
				}

			}
			
			actual = actual.darSiguiente();
		}


		// Se retorna una nueva lista con los elementos que cumplen el requisito
		return nueva;

	}	


}
