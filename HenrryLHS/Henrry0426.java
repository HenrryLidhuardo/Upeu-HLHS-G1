package HenrryLHS;

public class Henrry0426 {
    public static void main(String[] args) {
        System.out.print("Introduzca Número: ");
        int IntroducirNum = Integer.parseInt(System.console().readLine());
    
        System.out.println("   n  |    n²   |    n³");
        System.out.println("---------------------------");
        for (int i = IntroducirNum; i < IntroducirNum + 5; i++) {
          System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }
      }
    }