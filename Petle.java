public class Petle {
    public static void main(String[] args) {
        System.out.println("Początek");
        int x = 0;
        while(x<10){
            System.out.println(x + " .Instrukcja w petli");
            x++;
        }
        do{
            System.out.println(x + " .Instrukcja w petli");
            x++;
        }while(x<10);
        int i = 0;
        for (; i<10;){
            if (i == 5) continue;
            System.out.println(i + " .Instrukcja w petli");
            i++;
        }
        System.out.println("i = "+i);
    }
}