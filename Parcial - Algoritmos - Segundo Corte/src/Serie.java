
public class Serie implements Entregable {

	private final static int temporadas_defecto = 3;
	public static int mayor = 1;
	public static int menor = -1;
	public static int igual = 0;
	
	private String titulo;
	private int numeroDeTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
			public String getTitulo() {
				return titulo;
			}
			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}
			public int getNumeroDeTemporadas() {
				return numeroDeTemporadas;
			}
			public void setNumeroDeTemporadas(int numeroDeTemporadas) {
				this.numeroDeTemporadas = numeroDeTemporadas;
			}
			public String getGenero() {
				return genero;
			}
			public void setGenero(String genero) {
				this.genero = genero;
			}
			public String getCreador() {
				return creador;
			}
			public void setCreador(String creador) {
				this.creador = creador;
			}
			
			public void entregar() {
				entregado = true;
			}
			
			public void devolver() {
				entregado = false;
			}
			
			public boolean isEntregado() {
				if(entregado) {
					return true;
				}
				return false;
			}
			
			public int compareTo (Object a) {
				int estado = menor;
				
				Serie ref = (Serie)a;
				if(numeroDeTemporadas>ref.getNumeroDeTemporadas()) {
					estado = mayor;
				}else if(numeroDeTemporadas==ref.getNumeroDeTemporadas()) {
					estado = igual;
				}
				
				return estado;
			}
			
			public String toString() {
				return "Informacion de la serie: \n" +
						"|Titulo de la serie con mas temporadas: " + titulo + "\n" +
						"|Numero de temporadas: " + numeroDeTemporadas + "\n" +
						"|Genero: " + genero + "\n" +
						"|Creador: " + creador;
			}
			
			public boolean equals(Serie a) {
				if(titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())) {
					return true;
				}
				return false;
			}
			
			public Serie() {
				this("", temporadas_defecto, "", "");
			}
			
			public Serie(String titulo, String creador) {
				this(titulo, temporadas_defecto, "", creador);
			}
			
			public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
				this.titulo = titulo;
				this.numeroDeTemporadas = numeroDeTemporadas;
				this.genero = genero;
				this.creador = creador;
				this.entregado = false;
			}
			
}
