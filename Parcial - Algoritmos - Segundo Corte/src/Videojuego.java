
public class Videojuego implements Entregable {

		private final static int horas_pretederminadas = 10;
	    public final static int mayor = 1;
	    public final static int menor = -1;
	    public final static int igual = 0;
	  
	    private String titulo;
	    private int horasEstimadas;
	    private boolean entregado;
	    private String genero;
	    private String compañia;
	    
	    		public String getTitulo() {
	    			return titulo;
	    		}

	    		public void setTitulo(String titulo) {
	    			this.titulo = titulo;
	    		}
	    		
	    		public int getHorasEstimadas() {
	    			return horasEstimadas;
	    		}
	   	
	    		public void setHorasEstimadas(int horasEstimadas) {
	    			this.horasEstimadas = horasEstimadas;
	    		}
	    		
	    		public String getGenero() {
	    			return genero;
	    		}

	    		public void setGenero(String genero) {
	    			this.genero = genero;
	    		}

	    		public String getcompañia() {
	    			return compañia;
	    		}

	    		public void setcompañia(String compañia) {
	    			this.compañia = compañia;
	    		}

	    public void entregar() {
	        entregado = true;
	    }

	    public void devolver() {
	        entregado = false;
	    }

	    public boolean isEntregado() {
	        if(entregado){
	            return true;
	        }
	        return false;
	    }

	    public int compareTo(Object a) {
	        int estado = menor;
	  
	        Videojuego ref=(Videojuego)a;
	        if (horasEstimadas>ref.getHorasEstimadas()){
	            estado = mayor;
	        }else if(horasEstimadas==ref.getHorasEstimadas()){
	            estado = igual;
	        }
	  
	        return estado;
	    }

	    public String toString(){
	        return "Informacion del videojuego con mas horas: \n" +
	                "|Titulo del videojuego: " + titulo + "\n" +
	                "|Horas estimadas: " + horasEstimadas + "\n" +
	                "|Genero: " + genero + "\n" +
	                "|Compañia: " + compañia;
	    }

	    public boolean equals(Videojuego a){
	        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())){
	            return true;
	        }
	        return false;
	    }

	    public Videojuego(){
	        this("", horas_pretederminadas , "", "");
	    }

	    public Videojuego(String titulo, String compañia){
	        this(titulo, horas_pretederminadas , "", compañia);
	    }

	    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
	        this.titulo = titulo;
	        this.horasEstimadas = horasEstimadas;
	        this.genero = genero;
	        this.compañia = compañia;
	        this.entregado = false;
	    }
	}

