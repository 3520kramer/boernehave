import java.util.*;
import java.io.*;

public class ChildHandler {

    LinkedList<Child> childList = new LinkedList<Child>();

    public void addFromFile () throws Exception {
        Scanner scanread = new Scanner(new File("src/memberFile.txt"));
        scanread.useDelimiter("-");

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
                    + ch.getPostalCode() + "-" + ch.getCity() + "-" + ch.getContactPerson1() + "-" + ch.getContactPerson2() + "-");
        }
    }

    public void displayList() {
        for(Child ch : childList) {
            System.out.println("Fornavn: " + ch.getFirstName());
            System.out.println("Efternavn: " + ch.getLastName());
            System.out.println("Fødselsdato: "+ ch.getBirthDate());
            System.out.println("Adresse\nGadenavn:"+ch.getStreetName());
            System.out.println("Nummer: "+ch.getStreetNumber());
            System.out.println("Postnummer: "+ch.getPostalCode());
            System.out.println("By: "+ch.getCity());
            System.out.println("Kontakt Person 1: "+ch.getContactPerson1());
            System.out.println("Kontakt Person 2: "+ch.getContactPerson2() + "\n\n");
        }
    }

    public void searchToEdit() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hvem vil du søge efter?");
        String input = scan.next();

        Child child = new Child();
        int count = 0;
        int pos = 0;

        for (Child ch : childList) {
            if (input.equalsIgnoreCase(ch.getFirstName()) || input.equalsIgnoreCase(ch.getLastName())
                    || input.equalsIgnoreCase(ch.getBirthDate())) {
                child = ch;
                count++;
                childList.remove(pos);
            }
            pos++;
        }
        
        System.out.println("Tryk 1 for at ændre fornavn:\nTryk 2 for at ændre efternavn\ntryk 3 for at ændre fødselsdato\n" +
                "Tryk 4 for at ændre adresse\nTryk 5 for at ændre kontaktperson 1\nTryk 6 for at ændre kontaktperson 2\n");

        int numInput = scan.nextInt();
        switch (numInput){
            case 1:
                System.out.println("Fornavn:");
                input = scan.next();
                child.setFirstName(input);
                break;
            case 2:
                System.out.println();
                input = scan.next();
                child.setLastName(input);
                break;
            case 3:
                input = scan.next();
                child.setBirthDate(input);
                break;
            case 4:
                System.out.println("Gadenavn:");
                input = scan.next();
                child.setStreetName(input);

                System.out.println("Nummer:");
                numInput = scan.nextInt();
                child.setStreetNumber(numInput);

                System.out.println("By:");
                input = scan.next();
                child.setCity(input);

                System.out.println("Postnummer:");
                numInput = scan.nextInt();
                child.setPostalCode(numInput);
                break;
            case 5:
                numInput = scan.nextInt();
                child.setContactPerson1(numInput);
                break;
            case 6:
                numInput = scan.nextInt();
                child.setContactPerson2(numInput);
                break;
        }
        childList.add(child);
    }

    public void search(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hvem vil du søge efter?");
        String input = scan.next();

        int count = 0;
        for(Child ch : childList) {
            if (input.equalsIgnoreCase(ch.getFirstName()) || input.equalsIgnoreCase(ch.getLastName())
                    || input.equalsIgnoreCase(ch.getBirthDate())) {
                count++;
                System.out.println(count + " resultater fundet");
            }
        }

        count = 0;
        for(Child ch : childList){
            if(input.equalsIgnoreCase(ch.getFirstName()) || input.equalsIgnoreCase(ch.getLastName())
                    || input.equalsIgnoreCase(ch.getBirthDate())){
                count++;
                System.out.println("Resultat nr." + count + ":");
                System.out.println("Fornavn: " + ch.getFirstName());
                System.out.println("Efternavn: " + ch.getLastName());
                System.out.println("Fødselsdato: "+ ch.getBirthDate());
                System.out.println("Adresse\nGadenavn: "+ch.getStreetName());
                System.out.println("Nummer: "+ch.getStreetNumber());
                System.out.println("Postnummer: "+ch.getPostalCode());
                System.out.println("By: "+ch.getCity());
                System.out.println("Kontakt Person 1: "+ch.getContactPerson1());
                System.out.println("Kontakt Person 2: "+ch.getContactPerson2());
            }
        }
    }

    public void registerNewChild() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);

        Child child = new Child();

        System.out.println("Indtast fornavn: ");
        String text = input.next();
        child.setFirstName(text);

        System.out.println("Indtast efternavn:");
        text = input.next();
        child.setLastName(text);

        System.out.println("Indtast fødselsdagsdato: ");
        text = input.next();
        child.setBirthDate(text);

        System.out.println("Indtast vejnavn: ");
        text = input.next();
        child.setStreetName(text);

        System.out.println("Indtast husnummer: ");
        int num = input.nextInt();
        child.setStreetNumber(num);

        System.out.println("Indtast postnummer: ");
        num = input.nextInt();
        child.setPostalCode(num);

        System.out.println("Indtast by: ");
        text = input.next();
        child.setCity(text);

        System.out.println("Indtast kontaktperson nr. 1s telefonnummer: ");
        num = input.nextInt();
        child.setContactPerson1(num);

        System.out.println("Indtast kontaktperson nr. 2s telefonnummer: ");
        num = input.nextInt();
        child.setContactPerson2(num);

        childList.add(child);
    }
}
