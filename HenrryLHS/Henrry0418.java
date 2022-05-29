package HenrryLHS;

import java.util.Scanner;

public class Henrry0418 {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i, N;
    double Categoria1, Categoria2, Categoria3, Clave, Costo;
    double Impuesto, ImpuestoPagar;
    Categoria1 = 0;
    Categoria2 = 0;
    Categoria3 = 0;
    ImpuestoPagar = 0;
    System.out.print("Ingresa el Valor de N: ");
    N = in.nextInt();
    in.nextLine();
    for (i=1; i<=N; i++) {
        System.out.print("Proceso " + i);
        System.out.print("Ingresa el Valor de la Clave: ");
        Clave = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el Valor del Costo: ");
        Costo = in.nextDouble();
        in.nextLine();
        Impuesto=0;
        if(Clave==1)
        {
            Impuesto=Costo*0.1;
            Categoria1=Categoria1+Impuesto;
        }
        if(Clave==2)
        {
            Impuesto=Costo*0.07;
            Categoria2=Categoria2+Impuesto;
        }
        if(Clave==3)
        {
            Impuesto=Costo*0.05;
            Categoria3=Categoria3+Impuesto;
        }
        ImpuestoPagar=ImpuestoPagar+Impuesto;
        System.out.println("Valor de impuesto: " + Impuesto);
        System.out.println();
    }
    System.out.println("Valor de categoria 1: " + Categoria1);
    System.out.println("Valor de categoria 2: " + Categoria2);
    System.out.println("Valor de categoria 3: " + Categoria3);
    System.out.println("Valor de impuesto a pagar: " + ImpuestoPagar);
}

}