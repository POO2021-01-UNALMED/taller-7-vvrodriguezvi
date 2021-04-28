package comunicacion;
import java.util.*;

public class Tesis extends Escrito{
	String idea;
	static ArrayList<String> argumentos = new ArrayList<String>();
	String conclusion;
	String referencias;
	String interpretacion;
	
	// constructor
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] strings, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

		// metodos de la  clase padre
		
		int palabrasTotales(int palabrasPagina) {
				return 0;
		}
		String interpretacion() {
				return  interpretacion;
		}
		public String toString() {
				return null;
			
		}
		
		// getters  and setters

		public String getIdea() {
			return idea;
		}

		public void setIdea(String idea) {
			this.idea = idea;
		}

		public static ArrayList<String> getArgumentos() {
			return argumentos;
		}

		public static void setArgumentos(ArrayList<String> argumentos) {
			Tesis.argumentos = argumentos;
		}

		public String getConclusion() {
			return conclusion;
		}

		public void setConclusion(String conclusion) {
			this.conclusion = conclusion;
		}

		public String getReferencias() {
			return referencias;
		}

		public void setReferencias(String referencias) {
			this.referencias = referencias;
		}

		public String getInterpretacion() {
			return interpretacion;
		}

		public void setInterpretacion(String interpretacion) {
			this.interpretacion = interpretacion;
		}

		
}
