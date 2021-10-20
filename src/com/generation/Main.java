package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        operaciones(1, "+");
        operaciones(2, "-");
        operaciones(3, "*");
        operaciones(4, "/");
    }
    public static void operaciones(int seleccion, String operacion ){
        Scanner console = new Scanner( System.in);
        System.out.print("Enter number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter number 2  ");
        int num2 = console.nextInt();
        int resultado = 0;
        switch (seleccion){
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operacion no valida");
                break;
        }
        System.out.println( num1+ " " + operacion + " " + num2+" = "+ resultado);
    }
}