import java.util.Scanner;
public class FiguryASCII {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String bufor;
        int i = 0;
        while (true){
            if (i == 0) i++;
            else{
                System.out.print("Aby kontynuować działanie programu należy nacisnąć kalwisz 's'\nAby zakończyć działanie programu należy nacisnąć klawisz 'q': ");
                bufor = scan.next();
                if (bufor.equals("q")) break;
            }

            menu();
            switch(wybory(scan)){
                case 1:
                    kwadrat(pobieranieDanych(scan));
                    break;
                case 2:
                    trojkat1(pobieranieDanych(scan));
                    break;
                case 3:
                    trojkat2(pobieranieDanych(scan));
                    break;
                case 4:
                    ramka(pobieranieDanych(scan));
                    break;
                case 5:
                    ramkaZPrzekatnymi(pobieranieDanych(scan));
                    break;
                case 6:
                    piramida(pobieranieDanych(scan));
                    break;
                default:
                    System.out.println("BŁĄD");
            }

        }
    }
    public static void menu(){
        System.out.println("1.Kwadrat");
        System.out.println("2.Trójkąt 1");
        System.out.println("3.Trójkąt 2");
        System.out.println("4.Ramka");
        System.out.println("5.Ramka z przekątnymi");
        System.out.println("6.Piramidka");
    }
    public static int wybory(Scanner scan){
        int wybor;
        System.out.print("-----------------\nWybór: ");
        wybor = scan.nextInt();
        return wybor;
    }
    public static int pobieranieDanych(Scanner scan){
        int dana;
        System.out.print("-----------------\nWielkość: ");
        dana = scan.nextInt(); if (dana <= 0) System.out.print("BŁĄD");
        return dana;
    }
    public static void kwadrat(int dana){
        for (int i = dana; i > 0; i--){
            for (int x = dana; x > 0; x--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void trojkat1(int dana){
        for (int i = 1; i <= dana; i++){
            for (int x = i; x > 0; x--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void trojkat2(int dana){
        for (int i = 1; i <= dana; i++){
            for (int x = (dana-i); x > 0; x--){
                System.out.print(" ");
            }
            for (int y = i; y > 0; y--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void ramka(int dana){
        for (int i = 0; i < dana; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = (dana-2); i > 0; i--){
            System.out.print("*");
            for (int x = (dana-2); x > 0; x--){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < dana; i++){
            System.out.print("*");
        }
        System.out.println();
    }
   public static void ramkaZPrzekatnymi(int dana){
        for (int i = 0; i < dana; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int y = 0; y < dana-2; y++){ //przechodzenie do kolejnych linijek
            for (int x = 0; x < dana; x++){ //rysowanie giwazdek i spacji
                if (x == 0 || x == dana-1){ //sprawdzanie czy wyrysować gwiazdkę
                    System.out.print("*");
                }
                else {
                    if(dana%2 != 0){
                        if (x == y+1){
                            System.out.print("*");
                        }
                        else if (x == dana-2-y && x != Math.round(dana/2)){
                            System.out.print("*");
                        }
                        else System.out.print(" ");
                    }
                    else{
                        if (x == y+1){
                            System.out.print("*");
                        }
                        else if (x == dana-2-y){
                            System.out.print("*");
                        }
                        else System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 0; i < dana; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void piramida(int dana){
        for (int i = 1; i <= dana; i++){
            for (int y = dana-i; y > 0; y--){
                System.out.print(" ");
            }
            for (int x = i*2-1; x > 0; x--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
