import java.util.*;
import java.io.*;

public class ChildHandler {

    LinkedList<Child> childList = new LinkedList<Child>();

    public void addFromFile () throws Exception {
        Scanner scanread = new Scanner(new File("src/memberFile.txt"));
        scanread.useDelimiter("-|\\n");

        while (scanread.hasNext()){
            Child kid = new Child();

            String text = scanread.next();
            kid.setFirstName(text);

            text = scanread.next();
            kid.setLastName(text);

            text = scanread.next();
            kid.setBirthDate(text);

            text= scanread.next();
            kid.setStreetName(text);

            int num = scanread.nextInt();
            kid.setStreetNumber(num);

            num = scanread.nextInt();
            kid.setPostalCode(num);

            text = scanread.next();
            kid.setCity(text);

            num = scanread.nextInt();
            kid.setContactPerson1(num);

            num = scanread.nextInt();
            kid.setContactPerson2(num);

            childList.add(kid);
        }
    }
    
    public void addToFile() throws FileNotFoundException{
        PrintStream output = new PrintStream(new File("src/memberFile.txt"));
        for (Child ch : childList){
            output.print(ch.getFirstName() + "-" + ch.getLastName() + "-" + ch.getBirthDate() + "-" + ch.getStreetName() + "-" + ch.getStreetNumber() + "-"
                    + ch.getPostalCode() + "-" + ch.getCity() + "-" + ch.getContactPerson1() + "-" + ch.getContactPerson2() + "\n");
        }
    }

    public void displayList() {
        for(Child ch : childList) {
            System.out.println("Fornavn: " + ch.getFirstName());
            System.out.println("Efternavn: " + ch.getLastName());
            System.out.println("Fødselsdato: "+ ch.getBirthDate());
            System.out.println("Gadenavn: "+ch.getStreetName());
            System.out.println("Nummer: "+ch.getStreetNumber());
            System.out.println("Postnummer: "+ch.getPostalCode());
            System.out.println("By: "+ch.getCity());
            System.out.println("Kontakt Person 1: "+ch.getContactPerson1());
            System.out.println("Kontakt Person 2: "+ch.getContactPerson2() + "\n\n");
        }
    }

    public void searchToEdit() throws Exception{
        Scanner scan = new Scanner(System.in);

        System.out.println("Hvem vil du søge efter?");
        String input = scan.next();

        //opretter et midlertidigt objekt til at holde vores Child-objekt som vi kan ændre på
        Child tempChild = new Child();
        int count = 0;
        int pos = 0;

        //loop som tjekker om input fra bruger matcher fornavn, efternavn eller fødselsdag
        for (Child ch : childList) {
            if (input.equalsIgnoreCase(ch.getFirstName()) || input.equalsIgnoreCase(ch.getLastName())
                    || input.equalsIgnoreCase(ch.getBirthDate())) {
                tempChild = ch;

                //fjerner objektet fra arraylisten
                pos = count;
            }
            count++;
        }
        //fjerner objektet fra arraylisten
        childList.remove(pos);

        System.out.println("\nDu har valgt " + tempChild.getFirstName() + " " + tempChild.getLastName() + "\n");

        System.out.println("Tryk 1 for at ændre fornavn\nTryk 2 for at ændre efternavn\ntryk 3 for at ændre fødselsdato\n" +
                "Tryk 4 for at ændre adresse\nTryk 5 for at ændre kontaktperson 1\nTryk 6 for at ændre kontaktperson 2\n");

        int numInput = scan.nextInt();
        String oldInfo = tempChild.getFirstName();

        switch (numInput){
            case 1:
                System.out.println("indtast fornavn:");
                input = scan.next();
                tempChild.setFirstName(input);
                System.out.println("\n" + oldInfo + "'s fornavn er ændret til " + tempChild.getFirstName() + "\n\n");
                break;
            case 2:
                System.out.println("Indtast efternavn:");
                input = scan.next();
                tempChild.setLastName(input);
                System.out.println("\n" + oldInfo + "'s efternavn er ændret til " + tempChild.getLastName() + "\n\n");
                break;
            case 3:
                System.out.println("Indtast fødselsdato (DD/MM/ÅÅÅÅ)");
                input = scan.next();
                tempChild.setBirthDate(input);
                System.out.println("\n" + oldInfo + "'s fødselsdato er ændret til " + tempChild.getBirthDate() + "\n\n");
                break;
            case 4:
                System.out.println("Indtast gadenavn:");
                input = scan.next();
                tempChild.setStreetName(input);

                System.out.println("Indtast nummer:");
                numInput = scan.nextInt();
                tempChild.setStreetNumber(numInput);

                System.out.println("Indtast by:");
                input = scan.next();
                tempChild.setCity(input);

                System.out.println("Indtast postnummer:");
                numInput = scan.nextInt();
                tempChild.setPostalCode(numInput);
                System.out.println("\n" + oldInfo + "'s adresse er ændret til: " + tempChild.getStreetName() + " " + tempChild.getStreetNumber() + "," + tempChild.getCity() + " " + tempChild.getPostalCode() + "\n\n");
                break;
            case 5:
                numInput = scan.nextInt();
                tempChild.setContactPerson1(numInput);
                break;
            case 6:
                numInput = scan.nextInt();
                tempChild.setContactPerson2(numInput);
                break;
        }
        //gemmer det nye redigerede barn i arraylisten
        childList.add(tempChild);
    }

    public void search(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hvem vil du søge efter?");
        String input = scan.next();

        int count = 0;
        //loop som tjekker hvor mange af det givne navn som findes
        for(Child ch : childList) {
            if (input.equalsIgnoreCase(ch.getFirstName()) || input.equalsIgnoreCase(ch.getLastName())
                    || input.equalsIgnoreCase(ch.getBirthDate())) {
                count++;
            }
        }
        System.out.println(count + " resultat(er) fundet\n");
        count = 0;

        
        //loop som printer de fundne navne
        for(Child ch : childList){
            if(input.equalsIgnoreCase(ch.getFirstName()) || input.equalsIgnoreCase(ch.getLastName())
                    || input.equalsIgnoreCase(ch.getBirthDate())){
                count++;
                System.out.println("Resultat nr." + count + ":");
                System.out.println("Fornavn: " + ch.getFirstName());
                System.out.println("Efternavn: " + ch.getLastName());
                System.out.println("Fødselsdato: "+ ch.getBirthDate());
                System.out.println("Gadenavn: "+ch.getStreetName());
                System.out.println("Nummer: "+ch.getStreetNumber());
                System.out.println("Postnummer: "+ch.getPostalCode());
                System.out.println("By: "+ch.getCity());
                System.out.println("Kontakt Person 1: "+ch.getContactPerson1());
                System.out.println("Kontakt Person 2: "+ch.getContactPerson2() + "\n\n");
            }
        }
    }

    public void registerNewChild() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);

        Child child = new Child();

        System.out.println("Indtast fornavn:");
        String text = input.nextLine();
        child.setFirstName(text);

        System.out.println("Indtast efternavn:");
        text = input.nextLine();
        child.setLastName(text);

        System.out.println("Indtast fødselsdagsdato:");
        text = input.nextLine();
        child.setBirthDate(text);

        System.out.println("Indtast vejnavn:");
        text = input.nextLine();
        child.setStreetName(text);

        System.out.println("Indtast husnummer:");
        int num = input.nextInt();
        child.setStreetNumber(num);

        System.out.println("Indtast postnummer:");
        num = input.nextInt();
        child.setPostalCode(num);

        //Da nextInt ikke læser \n bliver vi nødt til at sætte en ind, så den næste linje vil blive læst efter næste spørgsmål
        input.nextLine();

        System.out.println("Indtast by:");
        text = input.nextLine();
        child.setCity(text);

        System.out.println("Indtast kontaktperson nr. 1s telefonnummer:");
        num = input.nextInt();
        child.setContactPerson1(num);

        System.out.println("Indtast kontaktperson nr. 2s telefonnummer:");
        num = input.nextInt();
        child.setContactPerson2(num);

        childList.add(child);
    }
}
