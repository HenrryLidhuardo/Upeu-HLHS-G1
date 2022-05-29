package HenrryLidhuardoHS;

import java.util.Scanner;

public class HenrryLHS041{

    public static void main(String[] args) {
        int i;
        double Salario_Inicial, Salario_Recibido, Año;
        for (i=1; i<=6; i++) {
            System.out.print("Proceso " + i);
            Salario_Inicial=1500;
            Año=i;
            Salario_Recibido=Salario_Inicial*Math.pow(1.1,Año);
            System.out.println("Salario del Inicial: " + Salario_Inicial);
            System.out.println("Salario Recibido: " + Salario_Recibido);
            System.out.println("Salario del Año: " + Año);
            System.out.println();
        }
    }

}