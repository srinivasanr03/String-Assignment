import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String converted = convertCase(input);
        System.out.println("Converted string: " + converted);
    }

    public static String convertCase(String str) {
        StringBuilder converted = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                converted.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                converted.append(Character.toUpperCase(c));
            } else {
                converted.append(c); // If the character is neither uppercase nor lowercase, keep it unchanged
            }
        }
        return converted.toString();
    }
}

