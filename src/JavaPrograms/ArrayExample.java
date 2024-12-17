package JavaPrograms;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Accessing elements of array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying an element of the array
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // Iterating over the array using a for loop
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        String[] strings = {"nani", "teja","bhavana", "sanjana"};
        System.out.println("first element: "+ strings[0]);
        System.out.println("last element: "+ strings[strings.length-1]);

    }

}
