import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int firstNum = scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int secondNum = scanner.nextInt();
        boolean firstBigger = firstNum > secondNum;
        boolean secondBigger = secondNum > firstNum;
        boolean equalNumbers = firstNum == secondNum;
        boolean diffNumbers = firstNum != secondNum;
        boolean firstBiggerEqual = firstNum >= secondNum;
        boolean secondBiggerEqual = secondNum >= firstNum;
        System.out.println("¿" + firstNum + " es mayor que " + secondNum + "?: " + firstBigger);
        System.out.println("¿" + firstNum + " es menor que " + secondNum + "?: " + secondBigger);
        System.out.println("¿" + firstNum + " es igual que " + secondNum + "?: " + equalNumbers);
        System.out.println("¿" + firstNum + " es diferente que " + secondNum + "?: " + diffNumbers);
        System.out.println("¿" + firstNum + " es mayor o igual que " + secondNum + "?: " + firstBiggerEqual);
        System.out.println("¿" + firstNum + " es mayor o igual que " + secondNum + "?: " + secondBiggerEqual);

    }

}
