import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {
        // ArrayList Demo
        System.out.println("ArrayList Demo:");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);
        arrayList.add(1, "Date"); // Insert at index 1
        System.out.println("After adding Date at index 1: " + arrayList);
        arrayList.remove(2); // Remove element at index 2
        System.out.println("After removing element at index 2: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));
        System.out.println("Index of 'Banana': " + arrayList.indexOf("Banana"));
        System.out.println("SubList from index 1 to 2: " + arrayList.subList(1, 3));

        // LinkedList Demo
        System.out.println("\nLinkedList Demo:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Lion");
        linkedList.add("Tiger");
        linkedList.add("Elephant");
        System.out.println("LinkedList: " + linkedList);
        linkedList.addFirst("Zebra"); // Add at the beginning
        System.out.println("After adding Zebra at the beginning: " + linkedList);
        linkedList.addLast("Giraffe"); // Add at the end
        System.out.println("After adding Giraffe at the end: " + linkedList);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        linkedList.removeFirst(); // Remove the first element
        System.out.println("After removing first element: " + linkedList);
        linkedList.removeLast(); // Remove the last element
        System.out.println("After removing last element: " + linkedList);

        // Vector Demo
        System.out.println("\nVector Demo:");
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);
        vector.add(1, 15); // Insert at index 1
        System.out.println("After adding 15 at index 1: " + vector);
        vector.remove(2); // Remove element at index 2
        System.out.println("After removing element at index 2: " + vector);
        System.out.println("Element at index 1: " + vector.get(1));
        System.out.println("Capacity of vector: " + vector.capacity());
        vector.addElement(40); // Add element at the end
        System.out.println("After adding 40 at the end: " + vector);

        // Stack Demo
        System.out.println("\nStack Demo:");
        Stack<String> stack = new Stack<>();
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        stack.pop(); // Remove the top element
        System.out.println("After popping top element: " + stack);
        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Position of 'Red' (from top): " + stack.search("Red"));
    }
}
