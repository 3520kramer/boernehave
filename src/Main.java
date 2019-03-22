import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Child child = new Child();
        ChildHandler handler = new ChildHandler();
        Scanner scan = new Scanner(System.in);


        handler.addFromFile();
        System.out.println("Roskilde Frie Børnehave\n");

        while(true) {
            //System.out.println("Tryk 1 for at finde et barn \nTryk 2 for at se søge efter et barn\ntryk 3 for at redigere et barn\n" +
                    //"Tryk 4 for at registrere personale\nTryk 5 for at se personale\nTryk 6 for at redigere personale\nTryk 7 for at se venteliste\n" +
                    //"Tryk 8 for at redigere venteliste\nTryk 9 for at se vagtplan\nTryk 10 for at redigere vagtplan\nTryk 11 for telefonliste\nTryk 12 for exit");
            System.out.println("Tryk 1 for børn\nTryk 2 for personale\nTryk 3 for venteliste\nTryk 4 for vagtplan\nTryk 5 for telefonliste\nTryk 6 for exit");
            int input = scan.nextInt();

            if (input == 1) {
                handler.displayList();
                System.out.println("Tast 1 for at tilføje et barn\nTast 2 for at redigere et barn");
                input = scan.nextInt();

                if (input == 1) {
                    handler.registerNewChild();
                    handler.addToFile();
                }
                if (input == 2) {
                    handler.searchToEdit();
                    handler.addToFile();
                }
            }else if (input > 1 && input < 6) {
                System.out.println("Kommer snart\n");
            }else if (input == 6) {
                break;
            }
        }
    }
}
