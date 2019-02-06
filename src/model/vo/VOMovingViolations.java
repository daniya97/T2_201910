package model.vo;

import com.opencsv.CSVReader;


/**
 * Representation of a Trip object
 */
public class VOMovingViolations {

	
	
	/**
	 * Atributos de la infracci�n
	 */
	private String iD;
	private String location;
	private int totalPaid;
	private String accidentIndicator;
	private String ticketIssueDate;
	private String violationCode;
	private String violationDesc;
	
	
	/**
	 * Constructor. Recibe los argumentos de la infracci�n a trav�s del archivo CSV
	 */
	public VOMovingViolations(String[] linea){
	
	
		iD = linea[0];
		location = linea[2];
		totalPaid = Integer.parseInt(linea[9]);
		accidentIndicator = linea[12];
		ticketIssueDate = linea[13];
		violationCode = linea[14];
		violationDesc = linea[15];
		
	}
	
	
	
	
	/**
	 * @return id - Identificador único de la infracción
	 */
	public String objectId() {
		// TODO Auto-generated method stub
		return iD;
	}	
	
	
	/**
	 * @return location - Direcci�n en formato de texto.
	 */
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	/**
	 * @return date - Fecha cuando se puso la infracción .
	 */
	public String getTicketIssueDate() {
		// TODO Auto-generated method stub
		return ticketIssueDate;
	}
	
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pag� el que recibi� la infracci�n en USD.
	 */
	public int getTotalPaid() {
		// TODO Auto-generated method stub
		return totalPaid;
	}
	
	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public String  getAccidentIndicator() {
		// TODO Auto-generated method stub
		return accidentIndicator;
	}
		
	/**
	 * @return description - Descripci�n textual de la infracción.
	 */
	public String  getViolationDescription() {
		// TODO Auto-generated method stub
		return violationDesc;
	}
	
	public String  getViolationCode() {
		// TODO Auto-generated method stub
		return violationCode;
	}
}
