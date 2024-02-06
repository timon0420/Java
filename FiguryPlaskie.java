import java.util.Scanner;
public class FiguryPlaskie{
    public static void main(String[] args){
        int i = 0;
        boolean q = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Program obliczba pola i obwody figur płaskich");
        while(q){
            if (i != 0){
                String klawisz;
                System.out.print("Aby kontynuować działanie programu należy nacisnąć klawisz 's'\nAby przerwać działanie programu należy nacisnąć klawisz 'q': ");
                klawisz = scan.next().toLowerCase();
                if (klawisz.equals("q")) break;
                else if (klawisz.equals("s")) q = true;
                else{
                    System.out.println("BŁĄD");
                    break;
                }
            }
            if (i == 0) i++;
            menu();
            switch (wybory(scan)){
                case 1:
                    podMenu();
                    switch (wybory(scan)){
                        case 1:
                            System.out.println(kwadratPole(scan));
                            break;
                        case 2:
                            System.out.println(kwadratObw(scan));
                            break;
                        default:
                            System.out.println("BŁĄD");
                            break;

                    }
                    break;
                case 2:
                    podMenu();
                    switch (wybory(scan)){
                        case 1:
                            System.out.println(prostokatPole(scan));
                            break;
                        case 2:
                            System.out.println(prostokatObw(scan));
                            break;
                        default:
                            System.out.println("BŁĄD");
                            break;
                    }
                    break;
                case 3:
                    podMenu();
                    switch (wybory(scan)){
                        case 1:
                            System.out.println(koloPole(scan));
                            break;
                        case 2:
                            System.out.println(koloObw(scan));
                            break;
                        default:
                            System.out.println("BŁĄD");
                            break;
                    }
                    break;
                case 4:
                    podMenu();
                    switch (wybory(scan)){
                        case 1:
                            System.out.println(trojkatPole(scan));
                            break;
                        case 2:
                            System.out.println(trojkatObw(scan));
                            break;
                        default:
                            System.out.println("BŁĄD");
                            break;
                    }
                    break;
                case 5:
                    podMenu();
                    switch (wybory(scan)){
                        case 1:
                            System.out.println(trapezPole(scan));
                            break;
                        case 2:
                            System.out.println(trapezObw(scan));
                            break;
                        default:
                            System.out.println("BŁĄD");
                            break;
                    }
                    break;
                default:
                    System.out.println("BŁĄD");
                    break;
            }
        }
    }
    static void menu(){
        System.out.println("1.Kwadrat");
        System.out.println("2.Prostokąt");
        System.out.println("3.Koło");
        System.out.println("4.Trójkąt");
        System.out.println("5.Trapez");
    }
    static void podMenu(){
        System.out.println("1.Pole");
        System.out.println("2.Obwód");
    }
    static int wybory(Scanner scan){
        int wybor;
        System.out.print("--------------------\nWybór: ");
        wybor = scan.nextInt();
        return wybor;
    }
    static Object kwadratPole(Scanner scan){
        System.out.print("Bok kwadratu: ");
        double bok = scan.nextDouble();
        if (bok > 0) return bok*bok;
        else return "BŁĄD";
    }
    static Object kwadratObw(Scanner scan){
        System.out.print("Bok kwadratu: ");
        double bok = scan.nextDouble();
        if (bok > 0) return 4*bok;
        else return "BŁĄD";
    }
    static Object prostokatPole(Scanner scan){
        System.out.print("1 Bok: ");
        double a = scan.nextDouble(); if (a <= 0) return "BŁĄD";
        System.out.print("2 Bok: ");
        double b = scan.nextDouble(); if (b <= 0) return "BŁĄD";
        return a*b;
    }
    static Object prostokatObw(Scanner scan){
        System.out.print("1 Bok: ");
        double a = scan.nextDouble(); if (a <= 0) return "BŁĄD";
        System.out.print("2 Bok: ");
        double b = scan.nextDouble(); if (b <= 0) return "BŁĄD";
        return (2*a)+(2*b);
    }
    static Object koloPole(Scanner scan){
        System.out.print("Promień: ");
        double r = scan.nextDouble(); if (r <= 0) return "BŁĄD";
        return Math.PI*Math.pow(r,2);
    }
    static Object koloObw(Scanner scan){
        System.out.print("Promień: ");
        double r = scan.nextDouble(); if (r <= 0) return "BŁĄD";
        return Math.PI*r*2;
    }
    static Object trojkatPole(Scanner scan){
        System.out.print("Podstawa: ");
        double a = scan.nextDouble(); if (a <= 0) return "BŁĄD";
        System.out.print("Wysokość: ");
        double h = scan.nextDouble(); if (h <= 0) return "BŁĄD";
        return 0.5*a*h;
    }
    static Object trojkatObw(Scanner scan){
        double wynik = 0, a;
        for (int i = 1; i <= 3; i++){
            System.out.print(i+" Bok: ");
            a = scan.nextDouble(); if (a <= 0) return "BŁĄD";
            wynik += a;
        }
        return wynik;
    }
    static Object trapezPole(Scanner scan){
        System.out.print("1 Podstawa: ");
        double a = scan.nextDouble(); if (a <= 0) return "BŁĄD";
        System.out.print("2 Podstawa: ");
        double b = scan.nextDouble(); if (b <= 0) return "BŁĄD";
        System.out.print("Wysokość: ");
        double h = scan.nextDouble(); if (h <= 0) return "BŁĄD";
        return 0.5*(a+b)*h;
    }
    static Object trapezObw(Scanner scan){
        double wynik = 0, a;
        for (int i = 1; i <= 4; i++){
            System.out.print(i+" Bok: ");
            a = scan.nextDouble(); if (a <= 0) return "BŁĄD";
            wynik += a;
        }
        return wynik;
    }
}