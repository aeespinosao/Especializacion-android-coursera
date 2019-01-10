public class matriz{

public static void main(String[] args) {
  int fil = 4;
  		int col = 4;
  		int contador = 1;
  		int renglon = 1;

  		int[][] matriz = new int[col][fil];

  		for (int i = 0; i < matriz.length; i++) {

  			System.out.print(renglon + " ");
  			++renglon;

  			for (int j = 0; j < matriz.length; j++) {

  				matriz[i][j] = contador * 2;

  				if(i==0 ) {
  				  System.out.print(" ");
  				}
  				System.out.print(" " + matriz[i][j]);

  				contador++;

  			}

  			System.out.println();

  		}

  	}

}
