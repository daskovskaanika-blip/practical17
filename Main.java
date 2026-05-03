 public class Main {
    public static void main(String[] args) {

        List myList = new List();

        myList.add("а");
        myList.add("б");
        myList.add("в");

        System.out.println("кількість елементів: " + myList.getSize());
        System.out.println("розмір буфера: " + myList.getCapacity());

        myList.add(1, "а");

        System.out.println("елемент [1]: " + myList.get(1));

        myList.remove(2);

        System.out.println("\nсписок:");
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }
    }
}