import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.nextLine().charAt(0);
        scanner.close();

        String result = removeCharacter(str, charToRemove);
        System.out.println("String after removing '" + charToRemove + "': " + result);
    }

    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder builder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != charToRemove) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
