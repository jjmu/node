/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nod;

import java.util.Scanner;

/**
 *
 * @author JJNET
 */
public class Nod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        Node head = null, nuevo, aux;

        System.out.println("Ingresa numeros\nsi ingresas un numero negativo se cierra el programa");
        int n = scan.nextInt();
        while (n >= 0) {
            nuevo = new Node(n);
            nuevo.setNext(head);
            head = nuevo; //la referancia nuevo a punta a la cabeza
            n = scan.nextInt();
        }

        aux = head;
        while (aux != null) {
            System.out.println(aux.getData());
            aux = aux.getNext();
        }

    }
    
}
