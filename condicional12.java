import java.util.Scanner;

public class condicional12 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int c1, c2;

        System.out.println("introdueix la primera carta");
        c1 = escaner.nextInt();
        System.out.println("introodueix la segona carta");
        c2 = escaner.nextInt();

        if((c1 < 1 || c1 > 10)|| (c2 < 1 || c2 > 10)) {
            System.out.println("-1");
        }else{
            if(c1 == c2){
                System.out.println("0");
            }else{
                if((c1 +1 == c2)|| (c1 -1 == c2)) {
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }
            }
        }

        escaner.close();
    }
}
