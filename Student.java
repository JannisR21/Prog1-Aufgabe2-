import java.util.Scanner;

public class Student{
   
    public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Welchen Studiengang studieren sie?");
    String Studiengang = inputScanner.nextLine();
    System.out.println("Wie ist ihr Name ");
    String NameDesStudenten = inputScanner.nextLine();
    System.out.println("Kennen sie ihre Matrikelnummer? Antworten sie mit ja oder nein");
    String Antwort = inputScanner.nextLine();

    
    if (Antwort.equalsIgnoreCase("Ja") ){
        System.out.println("Dann geben sie bitte ihre Matrikelnummer ein");
        int matrikelnummer = Integer.parseInt(inputScanner.nextLine());
        System.out.println("Hallo ich heiße" + NameDesStudenten + " und studiere " + Studiengang  + "und meine Matrikelnummer ist " + matrikelnummer);
    }
    else if (Antwort.equalsIgnoreCase("nein")) {
        System.out.println("Hallo ich heiße" + NameDesStudenten + " und studiere " + Studiengang + "Meine Matrikelnummer ist mir noch nicht bekannt");
    }
    



    inputScanner.close();
}
}