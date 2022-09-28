package tarea1emmanuel;

import java.util.Scanner;

//@author Varela Castro Emmanuel

public class Tarea1Emmanuel {
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //Variables de diagonales y tamaño de la matriz
        int diagonal1 = 0, diagonal2 = 0, sumaDiagonales = 0, tamaño = 0;
        
        //Solicitar tamaño de la matriz
        System.out.println("Ingrese en un numero entero el tamaño de la matriz (Ejemplo: 4 = 4x4, 6 = 6x6, 9 = 9x9)");
        tamaño = leer.nextInt();
                
        //Crear matriz tipo entero del tamaño indicado por el usuario 
        int [][] matriz = new int [tamaño][tamaño];
        
        //Recorre y llena la matriz
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                //Pide numero y lo guarda en la matriz
                System.out.println("Ingrese un numero entero");
                matriz[f][c] = leer.nextInt();
            }
        }
        //Recorre e imprime la matriz
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                System.out.print(matriz[f][c]+"  ");
            }
            System.out.println("  ");
        }
        //Recorre la matriz y suma las diagonales 1 y 2
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz.length;c++){
                //Suma diagonal 1
                if(f == c){
                    diagonal1 += matriz[f][c];
                }
                //Suma diagonal 2
                if(f+c == tamaño-1){
                    diagonal2 += matriz[f][c];
                }
            }
        }
        System.out.println("La suma de la diagonal 1 es de: "+diagonal1);
        System.out.println("La suma de la diagonal 2 es de: "+diagonal2);
        //Suma ambas diagonales
        sumaDiagonales = diagonal1 + diagonal2; 
        System.out.println("La suma de ambas diagonales es de: "+sumaDiagonales);
    }
}