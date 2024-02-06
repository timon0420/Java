import java.util.Scanner;
public class KalkulatorDwuargumentowy {
    public static void main(String[] args){
        boolean program = true;
        double liczba1;
        double liczba2;
        String znak;
        Scanner scan = new Scanner(System.in);
        System.out.println("Program wykonuje następujące obliczenia: dodawanie, odejmowanie, mnożenie i dzielenie.\nProgram wykonuje działania na liczbach podanych przez użytkownika");
        while (program){
            System.out.print("Pierwsza liczba: ");
            liczba1 = scan.nextDouble();
            System.out.print("Znak działania: ");
            znak = scan.next();
            System.out.print("Druga liczba: ");
            liczba2 = scan.nextDouble();
            switch(znak){
                case "+":
                    System.out.println("Wynik dodawania: "+(liczba1+liczba2));
                    break;
                case "-":
                    System.out.println("Wynik odejmowania: "+(liczba1-liczba2));
                    break;
                case "*":
                    System.out.println("Wynik mnożenia: "+(liczba1*liczba2));
                    break;
                case "/":
                    if (liczba2 == 0) System.out.println("Nie wolno dzielić przez zero");
                    else System.out.println("Wynik dzielenia: "+(liczba1/liczba2));
                    break;
                default:
                    System.out.println("Program nie może się wykonać");
            }
            String kontynuacja;
            System.out.print("Aby program wykonał się ponownie należy wcisnąć klawisz 's'");
            kontynuacja = scan.next();
            if (kontynuacja.equals("s")) program = true;
            else program = false;
        }
    }
}
