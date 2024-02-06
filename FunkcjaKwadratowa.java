import java.util.Scanner;
public class FunkcjaKwadratowa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        double a = scan.nextDouble();
        System.out.print("b: ");
        double b = scan.nextDouble();
        System.out.print("c: ");
        double c = scan.nextDouble();
        System.out.println(funkcjakwadratowa(a,b,c));
    }
    static Object funkcjakwadratowa(double a, double b, double c){
        return a == 0 ? "To nie jest funkcja kwadratowa" : Math.pow(b,2)-(4*a*c) < 0 ? "Funkcja nie ma miejsc zerowych" : Math.pow(b,2)-(4*a*c) == 0 ? "x1 = "+((-1*b)-(2*a)) : "x1 = "+(((-1*b)-Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a))+" x2 = "+(((-1*b)+Math.sqrt((Math.pow(b,2)-(4*a*c))))/(2*a));
    }
}
