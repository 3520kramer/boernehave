import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Child child = new Child();
        ChildHandler handler = new ChildHandler();
        Scanner scan = new Scanner(System.in);

        handler.addFromFile();
        while(true) {
            System.out.println("Roskilde frie børnehaves program");
            System.out.println("Tryk 1 for at registrere et nyt barn\nTryk 2 for at se alle børn eller søge\ntryk 3 for at redigere et barn\n" +
                    "Tryk 4 for at registrere personale\nTryk 5 for at se personale\nTryk 6 for at redigere personale\nTryk 7 for at se venteliste\n" +
                    "Tryk 8 for at redigere venteliste\nTryk 9 for at se vagtplan\nTryk 10 for at redigere vagtplan\nTryk 11 for telefonliste\nTryk 12 for exit");
            int input = scan.nextInt();
            if (input == 1) {
                handler.registerNewChild();
                handler.addToFile();
            }
            if (input == 2) {
                System.out.println("Tast 1 for at se alle børn\nTast 2 for at søge");
                input = scan.nextInt();
                if (input == 1) {
                    handler.displayList();
                }
                if (input == 2) {
                    handler.search();
                }
            }
            if (input == 3) {
                handler.searchToEdit();
                handler.addToFile();
            }
            if (input >= 4 && input <= 11) {
                System.out.println("...");
            }
            if(input == 12) {
                break;
            }
            if(input > 12){
                System.out.println("Tast korrekt, tak! \n");
            }
        }
    }
}
