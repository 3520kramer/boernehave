public class Main {
    public static void main(String[] args) throws Exception{

        Child child = new Child();
        ChildHandler handler = new ChildHandler();

        handler.addFromFile();
        handler.printTest();
        handler.addToFile();
    }

}
