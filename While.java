import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner wpis = new Scanner(System.in);
        System.out.println("Podaj liczbę :");

        try {
            int liczba = wpis.nextInt();

            for (int i = 0; i < liczba; i++) {
                for (int j = 0; j < liczba; j++) {
                    System.out.print("@  ");
                }
                System.out.println();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Podaj liczbę całkowitą ");
        }
//


    }



}