package comunicacion;

public class Fabula extends Escrito {
	protected String ensenanza;
	protected String interpretacion;
	
	// constructor
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}


	String interpretacion() {
			return interpretacion;
	}
	// getters  and  setters
	
	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}
	// Metodos de la clase abstracta heredada
	
	int palabrasTotales(int palabrasPagina) {
		return 0;
		}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String toString() {
		return getOrigen() + "\n" +
				getTitulo() + "\n" +
				getAutor() + "\n" +
				getPaginas() + "\n" +
				Ensenanza "\n" +
				
	}
	
}
