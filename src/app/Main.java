package app;

import Excepciones.isEmptyException;
import Stack.StackSimpleList;
import Stack.Stacks;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws isEmptyException {

        int resp = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tamaño de la pila #1", null));
        Stacks<Integer> pila = new StackSimpleList<>(resp);
        resp = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tamaño de la pila #2", null));
        Stacks<Integer> pila2 = new StackSimpleList<>(resp);
        int opc = 0;

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("1: Push"
                    + "\n 2: Pop"
                    + "\n3: Tamaño de la pila"
                    + "\n4: Mostrar Pila"
                    + "\n5: Comparar pilas"
                    + "\n 6: Peak"
                    + "\n7: Salir", null));
            int aux;
            switch (opc) {
                case 1:
                    aux = Integer.parseInt(JOptionPane.showInputDialog("Que pila desea modificar *1* ó *2*", null));
                    if (aux == 1) {
                        resp = Integer.parseInt(JOptionPane.showInputDialog("INTRUDUZCA EL ELEMENTO QUE DESEA AGREGAR", null));
                        pila.push(resp);
                    } else if (aux == 2) {
                        resp = Integer.parseInt(JOptionPane.showInputDialog("INTRUDUZCA EL ELEMENTO QUE DESEA AGREGAR", null));
                        pila2.push(resp);
                    } else {
                        System.out.println("INTRODUZE UNA OPCION VALIDA");
                    }

                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    aux = Integer.parseInt(JOptionPane.showInputDialog("Que pila desea mostrar *1* ó *2*", null));
                    if (aux == 1) {
                        System.out.println("" + pila.getLength());

                    } else if (aux == 2) {
                        System.out.println("" + pila2.getLength());

                    } else {
                        System.out.println("INTRODUZE UNA OPCION VALIDA");
                    }

                    break;
                case 4:
                    aux = Integer.parseInt(JOptionPane.showInputDialog("Que pila desea mostrar *1* ó *2*", null));
                    if (aux == 1) {
                        for (Object object : pila) {
                            System.out.print("{" + object + "} ");
                        }
                    } else if (aux == 2) {
                        for (Object object : pila2) {
                            System.out.print("{" + object + "} ");
                        }
                    } else {
                        System.out.println("INTRODUZE UNA OPCION VALIDA");
                    }

                    break;

                case 5:
                    pila.compare(pila, pila2);
                    break;
                case 6:
                    aux = Integer.parseInt(JOptionPane.showInputDialog("Que pila desea mostrar *1* ó *2*", null));
                    if (aux == 1) {
                        System.out.println("El ultimo elemento de la pila es: " + pila.peak());

                    } else if (aux == 2) {

                        System.out.println("El ultimo elemento de la pila es: " + pila2.peak());

                    } else {
                        System.out.println("INTRODUZE UNA OPCION VALIDA");
                    }
                    break;

            }
        } while (opc != 7 && opc > 0);
    }

}
