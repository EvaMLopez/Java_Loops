package dev.eva;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Scanner response = new Scanner(System.in);
        
        System.out.println("Introduce un número entero para ver su tabla de multiplicar (del 1 al 10):");

        int number = response.nextInt();

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        String[] table = multiplicationTable.getMultiplicationTable(number);
    
        for (int i = 0; i < table.length; i++) {
            System.out.println (table[i]);
        }

        response.close();
    }
}
