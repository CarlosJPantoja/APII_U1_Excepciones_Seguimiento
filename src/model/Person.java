package model;

import customExceptions.*;

public class Person {
	
	public final static String TI = "TI";
	public final static String CC = "CC";
	public final static String PP = "PP";
	public final static String CE = "CE";
	
	private String tipoDocumento;
	private String numDocumento;
	
	public Person(int type, String numDocumento) throws DocumentoException {
		tipoDocumento = assingType(type);
		if(tipoDocumento == TI || tipoDocumento == "Not especified") {
			throw new DocumentoException("el tipo de documento es invalido");
		}
		this.numDocumento = numDocumento;
	}
	
	public String assingType(int type){
		String typeDoc = "";
		if(type==1){ typeDoc = TI;}
		else if(type==2){ typeDoc = CC;}
		else if(type==3){ typeDoc = PP;}
		else if(type==4){ typeDoc = CE;}
		else{ typeDoc = "Not especified";}
		return typeDoc;
	}

	public int getTipoDocumento() {
		int typeDoc = 0;
		if(tipoDocumento.equals(TI)){ typeDoc = 1;}
		else if(tipoDocumento.equals(CC)){ typeDoc = 2;}
		else if(tipoDocumento.equals(PP)){ typeDoc = 3;}
		else if(tipoDocumento.equals(CE)){ typeDoc = 4;}
		else{ typeDoc = 0;}
		return typeDoc;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	
}
