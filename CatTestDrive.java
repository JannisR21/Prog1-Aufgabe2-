public class CatTestDrive {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Carlson";
        cat1.leben = 7;
        cat1.fellfarbe = "Schwarz";

        System.out.print("Die Katze hat den Namen " + cat1.name + " sie hat die Fellfarbe " + cat1.fellfarbe + " und sie hat noch "+ cat1.leben + " übrig " );
        cat1.miau();

        cat2.name = "Freddy";
        cat2.leben = 9;
        cat2.fellfarbe = "Schawrz weiß gepunket";

        System.out.print("Die Katze hört auf den Namen " + cat2.name + "und hat die Fellfarbe "+ cat2.fellfarbe + " und sie hat noch ihre " + cat2.leben + "übrig");

        cat2.miau();

        
    }
}
