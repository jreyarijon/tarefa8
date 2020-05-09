/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa8;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Tarefa8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer[][] array = {{1, 2, 3, 4}, {5, 5, 6, 7}};

        System.out.println("Elemento minimo del array: " + Operacions.elementoMinimo(array));
        System.out.println("Elemento maximo del array: " + Operacions.elementoMaximo(array));

        System.out.print("Introduce o valor que queres atopar: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();
        Operacions.buscarObxecto(array, valor);

        System.out.print("Introduce o valor que queres facer desaparecer: ");
        valor = sc.nextInt();
        Operacions.borrarObxecto(array, valor);
    }
}
