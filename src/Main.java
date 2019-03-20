import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean stop = false;
        Scanner scan = new Scanner(System.in);
        int userInput = -1;

        do {

            System.out.println("Velkommen til Roskilde Frie Børnehaves Online System");
            System.out.println("Tast 1 for at søge efter et barn i systemet.");
            System.out.println("Tast 2 for at registrere et nyt barn i børnehaven.");
            System.out.println("Tast 3 for at redigere personale.");
            System.out.println("Tast 4 for vagtplanen.");
            System.out.println("Tast 5 for ventelisten.");
            System.out.println("Tast 6 for telefonlisten.");
            System.out.println("Tast 7 for at afslutte programmet.");

            userInput = scan.nextInt();

            if(userInput == 1){


            }

            if(userInput == 2){

            }

            if(userInput == 3){


            }

            if(userInput == 4){


            }

            if(userInput == 5){


            }

            if(userInput == 6){


            }

            if(userInput == 7){

                stop = true;
            }

        }while(stop = false);


    }
}
