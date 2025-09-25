import java.util.Scanner;

public class condicionals {
    public static void main(String[] args) {
        int nota;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introdueix la teva nota");
        nota = escaner.nextInt();
        if (nota >= 5) {
            System.out.println("Estàs aprovat");
        }else {
            System.out.println("Estàs suspès");
        }

        //-----------------------

        int nota2;
        System.out.println("Introdueix la teva nota");
        nota2 = escaner.nextInt();
        if (nota2 < 5) {
            System.out.println("Estàs suspès");
        }else if (nota < 10) {
            System.out.println("Estàs aprovat");
        }else {
            System.out.println("Perfecte!");
        }

        //----------------------

        int nota3;
        System.out.println("Introdueix la teva nota");
        nota3 = escaner.nextInt();
        if (nota3 < 0 || nota3 > 10) {
            System.out.println("la nota introduida és invàlida");
        } else if (nota3 < 5) {
            System.out.println("Estàs suspès");          
        }else {
            System.out.println("Estàs aprovat");
        }

        //-----------------------


        escaner.close();
    }
    
}
