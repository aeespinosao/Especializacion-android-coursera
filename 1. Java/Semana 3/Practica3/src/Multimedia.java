
public class Multimedia {
	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	public boolean visto = false;
	
	public Multimedia() {
		
	}
	
	public Multimedia(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Multimedia(String titulo, String genero, String creador, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
