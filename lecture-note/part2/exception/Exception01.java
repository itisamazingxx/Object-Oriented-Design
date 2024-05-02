package exception;

public class Exception01 {

    public static void main(String[] args) {
        try {
            String string = "awesome";
            int a = Integer.parseInt(string);
            System.out.println("Nums: " + a);
        } catch (NumberFormatException e) {
            System.out.println("Prints exception: ");
        } finally {
            System.out.println("Finally code execute..");
        }
    }

}
