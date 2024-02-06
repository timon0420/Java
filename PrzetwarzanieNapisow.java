import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrzetwarzanieNapisow {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        do {
            menu();
            int wybory = wybory(scan);
            if (wybory == 10) break;
            wyswietlanieWynikow(wybory, scan);
            System.out.print("Aby kontynuować należy nacisnąć dowolny klawisz: ");
            scan.next();
        }while(true);
    }
    static void menu(){
        System.out.println("1.Odwracanie słowa");
        System.out.println("2.Przestawianie słów w napisie");
        System.out.println("3.Szyfrowanie napisu");
        System.out.println("4.Deszyfrowanie napisu");
        System.out.println("5.Uporządkowanie napisu");
        System.out.println("6.Liczba wystąpień litery w napisie");
        System.out.println("7.Histogram");
        System.out.println("8.Palindrom");
        System.out.println("9.Anagram");
        System.out.println("10.Koniec");
    }
    static int wybory(Scanner scan){
        System.out.print("Wybór: ");
        try{
            return scan.nextInt();
        }catch (InputMismatchException e){
            return 11;
        }
    }
    static String napisy(Scanner scan){
        System.out.print("Tekst: ");
        try{
            return scan.nextLine();
        }catch (InputMismatchException e){
            return null;
        }
    }
    static int kod(Scanner scan){
        System.out.print("Kod: ");
        return scan.nextInt();
    }
    static String znak(Scanner scan){
        while(true){
            System.out.print("Znak: ");
            String znak =  scan.next();
            if (znak.length() == 1){
                return znak;
            }
            else System.out.println("Należy podać literę");
        }
    }
    static void wyswietlanieWynikow(int wybor, Scanner scan){
        switch (wybor){
            case 1:
                scan.nextLine();
                odwrocony(napisy(scan));
                break;
            case 2:
                scan.nextLine();
                przestawioneSlowa(napisy(scan));
                break;
            case 3:
                scan.nextLine();
                szyfrowanie(napisy(scan), kod(scan));
                break;
            case 4:
                scan.nextLine();
                deszyfrowanie(napisy(scan), kod(scan));
                break;
            case 5:
                scan.nextLine();
                uporzodkuj(napisy(scan));
                break;
            case 6:
                scan.nextLine();
                wystapienie(napisy(scan), znak(scan));
                break;
            case 7:
                scan.nextLine();
                histogram(napisy(scan));
                break;
            case 8:
                scan.nextLine();
                System.out.println(palindrom(napisy(scan)));
                break;
            case 9:
                scan.nextLine();
                System.out.println(anagram(napisy(scan), napisy(scan)));
                break;
            default:
                System.out.println("BŁĄD");
                break;
        }
    }
    static void odwrocony(String slowo){
        String noweSlowo = "";
        for(int i = slowo.length()-1; i >= 0; i--){
            noweSlowo += slowo.charAt(i);
        }
        System.out.println("Odwrócone słowo: "+noweSlowo);
    }
    static void przestawioneSlowa(String napis){
        String[] nowyNapis = napis.split(" ");
        String wynik = "";
        for (int i = nowyNapis.length-1; i >= 0; i--){
            wynik = wynik + nowyNapis[i] + " ";
        }
        System.out.println("Przestawione słowa: "+wynik);
    }
    static void szyfrowanie(String napis, int klucz){
        String nowyNapis = "";
        for (int i = 0; i <= napis.length()-1; i++){
            nowyNapis += (char)((int)napis.charAt(i)+klucz);
        }
        System.out.println("Szyfrowanie: "+nowyNapis);
    }
    static void deszyfrowanie(String napis, int klucz){
        String nowyNapis = "";
        for (int i = 0; i <= napis.length()-1; i++){
            nowyNapis += (char)((int)napis.charAt(i)-klucz);
        }
        System.out.println("Deszyfrowanie: "+nowyNapis);
    }
    static void uporzodkuj(String napis){
        napis = napis.replaceAll(" ", "-");
        String nowyNapis = "";
        for (int i = 0; i < napis.length(); i++){
            if (napis.charAt(i) != '-') nowyNapis += napis.charAt(i);
            else if (napis.charAt(i) == '-' && (napis.toLowerCase().charAt(i+1) > 96 && napis.toLowerCase().charAt(i+1) < 122)){
                nowyNapis += " ";
            }
            else if(napis.charAt(i) == '.' || napis.charAt(i) == ',') nowyNapis += " ";
        }
        System.out.println(nowyNapis);
    }
    static void wystapienie(String napis, String znak){
        int licznik = 0;
        String nowyNapis = napis.toLowerCase();
        for (int i = 0; i < nowyNapis.length(); i++){
            if (nowyNapis.charAt(i) == znak.charAt(0)) licznik += 1;
        }
        System.out.println("Liczba wystąpień litery: "+znak+": "+licznik);
    }
    static void histogram(String napis){
        System.out.println("Histogram:");
        for (int i = 97; i < 122; i++){
            int licznik = 0;
            for (int x = 0; x < napis.length(); x++){
                if((int)(napis.charAt(x)) == i){
                    licznik += 1;
                }
            }
        System.out.println((char)(i)+". "+licznik);
        }
    }
    static boolean palindrom(String napis){
        for (int i = 0; i < napis.length(); i++){
            int x = napis.length()-1-i;
            if (napis.charAt(i) != napis.charAt(x)) return false;
        }
        return true;
    }
    static boolean anagram(String napis1, String napis2){
        String[] nowyNapis1 = napis1.split("");
        String[] nowyNapis2 = napis2.split("");
        Arrays.sort(nowyNapis1);
        Arrays.sort(nowyNapis2);
        return Arrays.toString(nowyNapis1).equals(Arrays.toString(nowyNapis2));
    }
}
