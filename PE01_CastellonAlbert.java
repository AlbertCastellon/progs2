import java.util.Scanner; // Importo l'escaner
import java.time.LocalDate; // Aqui importem la classe per poder accedir a la data.
import java.time.Period; // Amb això importo el mètode period per trobar el temps entre dos dates.

public class PE01_CastellonAlbert {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in); //Declaro l'escaner.

        //Totes aquestes variables son conjunts de caràcters, encara que el codi postal sigui numèric a 
        //Espanya ho poso com a string perquè a altres països conté lletres. La variable de la data de naixement 
        //la recollirem com a string pero la canviarem més endavant

        String name, surnames, birthdateString, city, postCode, userName, password; 

        //La variable student ha de ser boolean ja que al mateix enunciat ens planteja 2 possibles valors: si o no (true o false).
        
        boolean student;

        //Fem el registre i li demanem les dades utilitzant l'escaner amb un missatge que li diu la dada que estem demanant.

        System.out.println("Comença el registre...");
        System.out.println("Quin es el teu nom?");
        name = escaner.nextLine();

        System.out.println("Quin són els teus cognoms?");
        surnames = escaner.nextLine();

        System.out.println("Introdueix la teva data de naixement (AAAA-MM-DD)"); // Demanem un format concret per poder canviar-ho després.
        birthdateString = escaner.nextLine();

        System.out.println("A quina ciutat vius?");
        city = escaner.nextLine();

        System.out.println("Quin és el teu codi postal?");
        postCode = escaner.nextLine();

        System.out.println("Quin serà el teu nom d'usuari?");
        userName = escaner.next();

        System.out.println("Guarda la contrasenya");
        password = escaner.next();

        System.out.println("Estàs estudiant actualment?");
        student = escaner.nextBoolean();


        System.out.println("Inicia Sessió.");

        //Declarem dues noves variables per poder comparar-les a les que tenim guardades.

        String checkUserName, checkPassword;

        System.out.println("Introdueix el teu nom d'usuari.");
        checkUserName = escaner.next();

        System.out.println("Introdueix la teva contrasenya.");
        checkPassword = escaner.next();

        // Comprovem si el log in s'ha pogut efectuar.

        boolean logIn = (userName.equals(checkUserName)) && (password.equals(checkPassword));
        System.out.println("El resultat d'inici de sessió és " + logIn);

        LocalDate birthdate = LocalDate.parse(birthdateString); // Convertim la data de naixement que em recollit en string a date.
        LocalDate currentDate = LocalDate.now(); // Aquí guardem la data del moment en el qual el programa s'executa

        Period age = Period.between(birthdate, currentDate); // Aquesta instrucció ens dóna el periode de temps entre dues dates, és a dir l'edat
        
        // Mostrem les dades.

        System.out.println("Nom Complet: " + name + " " + surnames);
        System.out.println("Edat: " + age.getYears());  // Mostrem per consola els anys de l'edat que em calculat abans.
        System.out.println("Major d'edat: " + (age.getYears() >= 18)); // Comprovem si l'edat és major o igual a 18 i per tant major d'edat.
        System.out.println("Estudiant: " + student);

        // Tanquem l'escaner.

        escaner.close();
    }
}



