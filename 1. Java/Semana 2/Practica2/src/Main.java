
public class Main {

	public static void main(String[] args) {
		Pelicula peliculas[] = new Pelicula[5];
		Serie series[] = new Serie[5];
		Pelicula maspelicula = new Pelicula("", "", "", 0, 0); //Mas nueva
		Serie masserie = new Serie("", 0, "", "", 0); //Mas temporadas
		
		peliculas[0] = new Pelicula("Los vengadores", "Accion", "Carlos",2001,39);
		peliculas[1] = new Pelicula("AntMan", "Accion","Juan", 2015,40);
		peliculas[2] = new Pelicula("Hulk", "Accion", "Pedro", 2004, 90);
		peliculas[3] = new Pelicula("Capitan america", "Accion", "Andres", 2014, 120);
		peliculas[4] = new Pelicula("Los vengadores 2", "Accion","Carlos",2015,200);
		
		series[0] = new Serie("Arrow", "Juana");
		series[0].setNumeroTemporadas(6);
		series[1] = new Serie("Flash", "Carla");
		series[1].setNumeroTemporadas(7);
		series[2] = new Serie("DC legends", 3, "Ficcioón", "Luz", 215);
		series[3] = new Serie("Supergirl", 6, "Ficcioón", "Amparo", 1205);
		series[4] = new Serie("Atom", "Sol");
		series[4].setNumeroTemporadas(2);
		
		peliculas[0].marcarVisto();
		series[3].marcarVisto();
		peliculas[4].marcarVisto();
		series[1].marcarVisto();
		
		System.out.println("Peliculas vistas");
		for(Pelicula pelicula : peliculas) {
			if(pelicula.esVisto())
				System.out.println("Titulo: "+pelicula.getTitulo()+"\nDuración: "+pelicula.getDuracion()+" Minutos");
			if(pelicula.getAño() > maspelicula.getAño())
				maspelicula = pelicula;
		}
		
		System.out.println("\nSeries vistas");
		for(Serie serie : series) {
			if(serie.esVisto())
				System.out.println("Titulo: "+serie.getTitulo()+"\nDuración: "+serie.getDuracion()+" Minutos");
			if(serie.getNumeroTemporadas()>masserie.getNumeroTemporadas())
				masserie = serie;
		}
		
		System.out.println("\nPelicula mas nueva");
		System.out.println(maspelicula.toString());
		System.out.println("\nSerie con más temporadas");
		System.out.println(masserie.toString());
		
	}

}
