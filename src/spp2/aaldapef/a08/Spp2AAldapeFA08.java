/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.a08;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Spp2AAldapeFA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb=new Scanner(System.in);
        int promedio, sumaNon=0, sumaPar=0, cont=0;
        int [][]calc={{10,30,89,48,56},
                      {32,23,84,20,10},
                      {72,108,71,402,8}};
        
        for (int i=0; i<calc.length; i++){
            for (int j=0; j<calc[i].length; j= j+2){
                sumaPar= sumaPar+calc[i][j];
                cont++;
            }
    }
        System.out.println("La suma de los numeros pares es "+ sumaPar);
        System.out.println("El total de numeros sumados es "+cont);
        promedio=sumaPar/cont;
        System.out.println("El promedio de la suma de los numeros pares es "+ promedio);
        
        for(int i=0; i<calc.length; i++){
            for(int j=1; j<calc[i].length; j=j+2){
                sumaNon= sumaNon+calc[i][j];
                
            }
        }
        System.out.println("");
        System.out.println("La suma de los numeros impares es "+ sumaNon);
        
        
        
    }
    
}
