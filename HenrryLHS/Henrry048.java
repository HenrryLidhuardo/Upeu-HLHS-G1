package HenrryLHS;

import java.util.Scanner;

public class Henrry048 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        double Cantidad_de_Enero01, Cantidad_de_Febrero02, Cantidad_de_Marzo03, Cantidad_de_Abril04, Cantidad_de_Mayo05; 
        double Cantidad_de_Junio06, Cantidad_de_Julio07, Cantidad_de_Agosto08, Cantidad_de_Septiembre09, Cantidad_de_Octubre10;
        double Cantidad_de_Noviembre11, Cantidad_de_Diciembre12, Interes, Inversion_Final, Total;
        Total = 0;
        System.out.print("Ingresa el Valor de N: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("Proceso " + i);
            System.out.print("Ingresa el Valor de la Cantidad de Enero01: ");
            Cantidad_de_Enero01 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Febrero02: ");
            Cantidad_de_Febrero02 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Marzo03: ");
            Cantidad_de_Marzo03 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Abril04: ");
            Cantidad_de_Abril04 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Mayo05: ");
            Cantidad_de_Mayo05 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Junio06: ");
            Cantidad_de_Junio06 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Julio07: ");
            Cantidad_de_Julio07 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Agosto08: ");
            Cantidad_de_Agosto08 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Septiembre09: ");
            Cantidad_de_Septiembre09 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Octubre10: ");
            Cantidad_de_Octubre10 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Noviembre11: ");
            Cantidad_de_Noviembre11 = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el Valor de la Cantidad de Diciembre12: ");
            Cantidad_de_Diciembre12 = in.nextDouble();
            in.nextLine();
            Interes=Total*0.1;
            Total=Total+Interes+Cantidad_de_Enero01+Cantidad_de_Febrero02+Cantidad_de_Marzo03+Cantidad_de_Abril04+Cantidad_de_Mayo05+Cantidad_de_Junio06+Cantidad_de_Julio07+Cantidad_de_Agosto08+Cantidad_de_Septiembre09+Cantidad_de_Octubre10+Cantidad_de_Noviembre11+Cantidad_de_Diciembre12;
            Inversion_Final=Total;
            System.out.println("Valor de intereses: " + Interes);
            System.out.println("Valor de inversion final: " + Inversion_Final);
            System.out.println();
        }
        System.out.println("Valor de total: " + Total);
    }

}