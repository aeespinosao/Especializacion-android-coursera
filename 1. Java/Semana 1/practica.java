public class practica {
	public static void main(String args[]) {
		//Definir variables
		byte NumeroBase = 2;
		byte Matriz[][] = new byte[4][4];
		byte Suma = 0;

		//Llenar y mostrar matriz
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				Suma += NumeroBase;
				Matriz[i][j] = Suma;
				System.out.print(Suma + " ");
				if(i==0)
					System.out.print(" ");
			}
			System.out.print("\n");
		}

	}
}