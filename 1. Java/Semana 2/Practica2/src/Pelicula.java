
public class Pelicula extends Multimedia implements Visualizable {
	private int año;
	
	public Pelicula() {
		super();
	}
	
	public Pelicula(String titulo, String creador) {
		super(titulo,creador);
	}
	
	public Pelicula(String titulo, String genero, String creador, int año, int duracion) {
		super(titulo,genero,creador,duracion);
		this.año = año;
	}
	
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Titulo: "+this.getTitulo()+
				"\nAño: "+this.getAño()+
				"\nGenero: "+this.getGenero()+
				"\nCreador: "+this.getCreador()+
				"\nDuracion: "+this.getDuracion());
	}

	@Override
	public void marcarVisto() {
		this.visto = !this.visto;
	}

	@Override
	public boolean esVisto() {
		return this.visto;
	}

	@Override
	public int tiempoVisto() {
		return this.getDuracion();
	}
	
	
}
