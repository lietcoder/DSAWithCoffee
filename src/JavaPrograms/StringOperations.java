package JavaPrograms;

public class StringOperations {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(str.matches("\\n+"));
        System.out.println(str.matches("\\d+"));
        System.out.println(str.matches("\\e+")); // Output: true
// Output: true
// Output: true

    }
}
