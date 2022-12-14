package tarea1emmanuel;

import java.util.Scanner;

//@author Varela Castro Emmanuel

public class Tarea1Emmanuel {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Variables de diagonales y tamaño de la matriz
        int diagonalP = 0, diagonalI = 0, sumaDiagonales = 0, tamaño = 0;
        
        //Solicitar tamaño de la matriz
        System.out.println("Ingrese en un numero entero el tamaño de la matriz (Ejemplo: 4 = 4x4, 6 = 6x6, 9 = 9x9)");
        tamaño = entrada.nextInt();
                
        //Crear matriz tipo entero del tamaño indicado por el usuario 
        int [][] matriz = new int [tamaño][tamaño];
        
        //Recorre y llena la matriz
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                //Pide numero y lo guarda en la matriz
                System.out.println("Ingrese un numero entero");
                matriz[f][c] = entrada.nextInt();
            }
        }
        //Recorre e imprime la matriz
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                System.out.print(matriz[f][c]+"  ");
            }
            System.out.println("  ");
        }
        //Recorre la matriz y suma las diagonales 
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                //Suma diagonal principal
                if(f == c){
                    diagonalP += matriz[f][c];
                }
                //Suma diagonal inversa
                if(f+c == tamaño-1){
                    diagonalI += matriz[f][c];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: "+diagonalP);
        System.out.println("La suma de la diagonal inversa es: "+diagonalI);
        //Suma ambas diagonales
        sumaDiagonales = diagonalP + diagonalI; 
        System.out.println("La suma de ambas diagonales es: "+sumaDiagonales);
    }
}