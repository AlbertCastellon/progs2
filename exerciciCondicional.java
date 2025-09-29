import java.util.Scanner;

public class exerciciCondicional {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int edat;
        boolean soci;

        System.out.println("Quina edat tens?");
        edat = escaner.nextInt();

        if(edat < 18) {

            System.out.println("No pots accedir a la discoteca per edat");

        }else {

            System.out.println("Ets soci?");
            soci = escaner.nextBoolean();

            if (soci) {

                System.out.println("Pots accedir gratuitament a la discoteca perquè tens el carnet");

            }else if (edat >= 35) {

                System.out.println("Pots accedir gratuitament a la discoteca perquè ets més gran de 35");

            }else {

                System.out.println("Pots accedir a la discoteca i cal que paguis 20 euros");
                    
            }
        }
           


        escaner.close();
    }
}
