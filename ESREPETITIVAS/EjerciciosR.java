package ESREPETITIVAS;

/**
 * EjerciciosR
 */
public class EjerciciosR {
    public static void ImprimirWhileN1_20() {
        int numInit=21;
        while (numInit<=20) {
            System.out.println(numInit);
            numInit=numInit+1; 
        }
    }
    public static void ImprimirDowhileN1_20() {
        int numInit=21;
        do {
            System.out.println(numInit);
            numInit++;
        } while (numInit<=20);
    }
    public static void ImprimirForN1_20() {
        for (int numInit = 1;  numInit<= 20; numInit++) {
            System.out.println(numInit);
        } 
    }
    
    public static void main(String[] args) {
        System.out.println("Imprime While:"); ImprimirWhileN1_20();
        System.out.println("Imprime Do while:");ImprimirDowhileN1_20();
        System.out.println("Imprime For:");ImprimirForN1_20();
    }
}
