public class Example {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add items with descriptions
        list.add("Item 1", "Description for Item 1");
        list.add("Item 2", "Description for Item 2");
        list.add("Item 3", "Description for Item 3");
        list.add("Item 4", "Description for Item 4");

        // Display the list of items with descriptions
        System.out.println("List of items with descriptions:");
        list.display();
    }
}