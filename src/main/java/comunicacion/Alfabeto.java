package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	static ArrayList<String> letras = new ArrayList<String>();
	String interpretacion;
	
	// constructor
	
	public Alfabeto(String origen, String[] strings, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
	}
	
	// metodos  de la  super clase abstracta
	
	String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String out = "";
		for(int i = 0; i < letras.size(); i++) {
			if(i != (letras.size()-1)) {
				out += letras.get(i) + ", ";
			}
		}
		return out;	
	}
	// metodo propio de  la clase
	
	public int cantidadLetras() {
		return Alfabeto.letras.size();
	}
	
	//Getters and  setters

	public static ArrayList<String> getLetras() {
		return letras;
	}

	public static void setLetras(ArrayList<String> letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
