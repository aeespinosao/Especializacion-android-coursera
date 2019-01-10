
public class Serie extends Multimedia implements Visualizable  {
	private int numeroTemporadas = 1;
	
	public Serie() {
		super();
	}
	
	public Serie(String titulo, String creador) {
		super(titulo,creador);
	}
	
	public Serie(String titulo, int numeroTemporadas, String genero, String creador, int duracion) {
		super(titulo,genero,creador,duracion);
		this.setNumeroTemporadas(numeroTemporadas);
	}

	
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	@Override
	public String toString() {
		
		return ("Titulo: "+this.getTitulo()+
				"\nNumero de temporadas: "+this.numeroTemporadas+
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
