package HenrryLHS;

import java.util.Scanner;

public class Henrry043 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int CantidadCero, i, MayoraCero, MenoraCero, n;
        double Cantidad;
        CantidadCero = 0;
        MenoraCero = 0;
        MayoraCero = 0;
        System.out.print("Ingresa el Valor de N: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("Proceso" + i);
            System.out.print("Ingresa el Valor de la Cantidad: ");
            Cantidad = in.nextDouble();
            in.nextLine();
            if(Cantidad==0)
                CantidadCero=CantidadCero+1;
            if(Cantidad<0)
                MenoraCero=MenoraCero+1;
            if(Cantidad>0)
                MayoraCero=MayoraCero+1;
            System.out.println();
        }
        System.out.println("Valor de Cantidad Cero: " + CantidadCero);
        System.out.println("Valor de Menor a Cero: " + MenoraCero);
        System.out.println("Valor de Mayor a Cero: " + MayoraCero);
    }

}
