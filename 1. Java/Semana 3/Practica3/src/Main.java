import java.util.ArrayList; 

public class Main {

	public static void main(String[] args) {
		try {
		ArrayList<Pelicula> peliculas = new ArrayList<>();
		ArrayList<Serie> series = new ArrayList<>();
		Pelicula maspelicula = new Pelicula("", "", "", 0, 0); //Mas nueva
		Serie masserie = new Serie("", 0, "", "", 0); //Mas temporadas
		
		peliculas.add(new Pelicula("Los vengadores", "Accion", "Carlos",2001,39));
		peliculas.add(new Pelicula("AntMan", "Accion","Juan", 2015,40));
		peliculas.add(new Pelicula("Hulk", "Accion", "Pedro", 2004, 90));
		peliculas.add(new Pelicula("Capitan america", "Accion", "Andres", 2014, 120));
		peliculas.add(new Pelicula("Los vengadores 2", "Accion","Carlos",2015,200));
		
		series.add(new Serie("Arrow", "Juana"));
		series.get(0).setNumeroTemporadas(6);
		series.add(new Serie("Flash", "Carla"));
		series.get(1).setNumeroTemporadas(7);
		series.add(new Serie("DC legends", 3, "Ficcioón", "Luz", 215));
		series.add(new Serie("Supergirl", 6, "Ficcioón", "Amparo", 1205));
		series.add(new Serie("Atom", "Sol"));
		series.get(4).setNumeroTemporadas(2);
		
		peliculas.get(0).marcarVisto();
		series.get(3).marcarVisto();
		peliculas.get(4).marcarVisto();
		series.get(1).marcarVisto();
		
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
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		}catch (NullPointerException ex) {
			System.out.println("Null pointer exception");
		}catch (Exception exp) {
			System.out.println("General exception");
		}finally {
			System.out.println("Fin de APP");
		}
	}

}
