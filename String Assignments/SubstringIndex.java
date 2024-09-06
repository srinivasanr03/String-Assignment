import java.util.Scanner;

public class SubstringIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();
        scanner.close();

        int index = findSubstringIndex(mainString, substring);
        if (index != -1) {
            System.out.println("Substring '" + substring + "' found at index " + index);
        } else {
            System.out.println("Substring '" + substring + "' not found in the main string.");
        }
    }

    public static int findSubstringIndex(String mainString, String substring) {
        return mainString.indexOf(substring);
    }
}