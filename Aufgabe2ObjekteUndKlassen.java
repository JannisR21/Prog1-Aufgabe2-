import java.util.*;

public class Aufgabe2ObjekteUndKlassen {

public static void main(String[] args) {
Scanner inputScanner = new Scanner(System.in);

System.out.println("Wie ist ihr Name ?");
 String Name = inputScanner.nextLine(); 
 System.out.println("Herzlich Willkommen " + Name );


 System.out.println("Aufgabe 1.2 for schleife");
 for (int i = 0; i < 3; i++) {

    System.out.println("Herzlich Willkommen: " + Name);
}

System.out.println("While Schleife");

int i = 0;
while (i < 3 ){
    System.out.println("Herzlich Willkommen: " + Name);
    i++;
}



System.out.println(" Aufgabe 1.3 if else ");
for (int p = 0; p < 3; p++) {

    System.out.println("Herzlich Willkommen: " + Name);
}

if (Name.isEmpty()) {
    System.out.println("Bitte geben sie ihren Namen an");
}
else {  
    System.out.println("Herzlich Willkommen: " + Name);
}



 inputScanner.close();
 }

    public class Person{
// +--------------------------------------+
// |                Person                |
// +--------------------------------------+
// | - Name: String                       |
// | - Alter: int                         |
// | - Adresse: String                    |
// +--------------------------------------+
    }



}

