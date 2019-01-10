package com.alecuautlemiguel.tarea;

public class Tarea {

	public static void main(String[] args) {

        
        int columna[][] = new int[4][4];
        int linea = 0;
        
        for (int i = 0; i < columna.length; i++) {
            for (int j = 0; j < columna.length; j++) {  
            	linea= linea + 2;
            	columna[i][j]= linea;
                 
            	 System.out.print("     ");
                 System.out.print(columna [i][j]+"");

            }
            System.out.println("");
            
        }

        
        
	}
    
}
	


	