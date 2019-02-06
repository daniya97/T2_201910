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

public class MovingViolationsManager implements IMovingViolationsManager {

	private LinkedList<VOMovingViolations> movingViolations = new LinkedList<>(null);



	public void loadMovingViolations(String movingViolationsFile){
		// TODO Auto-generated method stub

		CSVReader reader = null;
		try {

			reader = new CSVReader(new FileReader("./data/"+movingViolationsFile));
			for(String[] nextLine : reader) {

				VOMovingViolations nuevo = new VOMovingViolations(nextLine);
				movingViolations.agregarElementoPrimeraPosicion(nuevo);

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


	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {

		LinkedList<VOMovingViolations> nueva = new LinkedList<VOMovingViolations>(null);
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


		return nueva;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {


		LinkedList<VOMovingViolations> nueva = new LinkedList<VOMovingViolations>(null);
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


		return nueva;



	}	


}
