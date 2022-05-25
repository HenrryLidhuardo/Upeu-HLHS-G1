package HenrryLHS;

import java.util.Scanner;

public class Henrry04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Color, FocoBlanco, FocoRojo, FocoVerde, i;
        int n;
        FocoBlanco = 0;
        FocoRojo = 0;
        FocoVerde = 0;
        System.out.print("Ingresa el Valor de N: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("Proceso " + i);
            System.out.println("Seleccionar el Color.");
            System.out.println("\t1.- Verde");
            System.out.println("\t2.- Blanco");
            System.out.println("\t3.- Rojo");
            System.out.print("\t: ");
            do {
                Color = in.nextInt();
                in.nextLine();
                if (Color<1||Color>3)
                    System.out.print("Valor Incorrecto. Ingrese Nuevamente.: ");
            } while (Color<1||Color>3);
            if(Color==1)
                FocoBlanco=FocoBlanco+1;
            if(Color==2)
                FocoRojo=FocoRojo+1;
            if(Color==3)
                FocoVerde=FocoVerde+1;
            System.out.println();
        }
        System.out.println("Valor de Foco Blanco: " + FocoBlanco);
        System.out.println("Valor de Foco Rojo: " + FocoRojo);
        System.out.println("Valor de Foco Verde: " + FocoVerde);
    }

}