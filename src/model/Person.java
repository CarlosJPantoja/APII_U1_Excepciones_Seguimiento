package model;

public class Person {
	
	public final static String TI = "TI";
	public final static String CC = "CC";
	public final static String PP = "PP";
	public final static String CE = "CE";
	
	private String tipoDocumento;
	private String numDocumento;
	
	public Person(int type, String numDocumento) {
		tipoDocumento = assingType(type);
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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	
}
