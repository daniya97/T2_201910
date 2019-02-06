package controller;

import api.IMovingViolationsManager;
import model.data_structures.LinkedList;
import model.logic.MovingViolationsManager;
import model.vo.VOMovingViolations;
/**
 * Controlador de la estructura de datos
 */
public class Controller {

	/**
	 * Reference to the services manager
	 */
	@SuppressWarnings("unused")
	private static IMovingViolationsManager  manager = new MovingViolationsManager();
	
	public static void loadMovingViolations() {
		
		manager.loadMovingViolations("Moving_Violations_Issued_in_January_2018 (4).csv");
	}
	
	public static LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		
		return manager.getMovingViolationsByViolationCode(violationCode);

		
	}
	
	public static LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		return manager.getMovingViolationsByAccident(accidentIndicator);
	}
}
