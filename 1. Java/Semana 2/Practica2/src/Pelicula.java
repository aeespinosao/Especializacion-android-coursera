
public class Pelicula extends Multimedia implements Visualizable {
	private int a�o;
	
	public Pelicula() {
		super();
	}
	
	public Pelicula(String titulo, String creador) {
		super(titulo,creador);
	}
	
	public Pelicula(String titulo, String genero, String creador, int a�o, int duracion) {
		super(titulo,genero,creador,duracion);
		this.a�o = a�o;
	}
	
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Titulo: "+this.getTitulo()+
				"\nA�o: "+this.getA�o()+
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
