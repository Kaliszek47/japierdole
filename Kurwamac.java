import java.util.Scanner;

public class Kurwamac {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba=input.nextInt();

        System.out.println("Podana liczba to: " + liczba);

        final int STALA = 69;

        if (liczba>STALA) {
            System.out.println("Twoja liczba jest większa niż " + STALA);
        }
        else if (liczba<STALA) {
            System.out.println("Twoja liczba jest mniejsza niż " + STALA);
        }
        else {
            System.out.println("Twoja liczba jest równa " + STALA);
        }
    }
}
// stała "final int" wielkimi literami i podłogą "STALA_ZMIENNA"
// sout = System.out.println
