package view;

import java.util.Scanner;

import controller.Controller;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;
import model.data_structures.Nodo;
import model.vo.VOMovingViolations;

public class MovingViolationsManagerView 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean fin=false;
		while(!fin)
		{
			printMenu();
			
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					
					//Se cargan los datos
					Controller.loadMovingViolations();
					break;
					
				case 2:
					//Se busca las infracciones por el código
					System.out.println("Ingrese el código de la infracción:");
					String violationCode = sc.next();
					LinkedList<VOMovingViolations> violationsByCodeList = Controller.getMovingViolationsByViolationCode (violationCode);
					

					Nodo<VOMovingViolations> actual = violationsByCodeList.darPrimerNodo();
					
					while(actual != null)
					{
						
						VOMovingViolations contador = actual.darObjeto();	
						if(contador!=null){
						System.out.println(contador.objectId() + " " + contador.getLocation() + " " + contador.getTicketIssueDate()+ " " + contador.getTotalPaid() + " " + contador.getAccidentIndicator()+ " " + contador.getViolationDescription());
						}
						actual = actual.darSiguiente();
						
					}
					System.out.println("Se encontraron "+ violationsByCodeList.darTamanoLista() + " elementos");
					break;
					
				case 3:
					
					// Se buscan las infracciones por el indicador
					System.out.println("Ingrese el indicador de Accidente que quiere consulta (No/Yes):");
					String accidentIndicator = sc.next();
					LinkedList<VOMovingViolations> violationsByAccidentsList = Controller.getMovingViolationsByAccident (accidentIndicator);
					

					Nodo<VOMovingViolations> actual2 = violationsByAccidentsList.darPrimerNodo();
					
					while(actual2 != null)
					{
						
						VOMovingViolations contador = actual2.darObjeto();	
						if(contador!=null){
						System.out.println(contador.objectId() + " " + contador.getLocation() + " " + contador.getTicketIssueDate()+ " " + contador.getTotalPaid() + " " + contador.getAccidentIndicator()+ " " + contador.getViolationDescription());
						}
						actual2 = actual2.darSiguiente();
						
					}
					System.out.println("Se encontraron "+ violationsByAccidentsList.darTamanoLista() + " elementos");
					
					break;
											
				case 4:	
					
					/// Cualquier otro caso
					fin=true;
					sc.close();
					break;
			}
		}
	}

	
	// Menu prinicipal
	private static void printMenu() {
		System.out.println("---------ISIS 1206 - Estructuras de datos----------");
		System.out.println("---------------------Taller 2----------------------");
		System.out.println("1. Cree una nueva coleccion de infracciones en movimiento");
		System.out.println("2. Dar listado de infracciones reportadas dado un código de infracción");
		System.out.println("3. Dar listado de infracciones reportadas de acuerdo a si hay o no accidente reportado");
		System.out.println("4. Salir");
		System.out.println("Digite el número de opción para ejecutar la tarea, luego presione enter: (Ej., 1):");
		
	}
}
