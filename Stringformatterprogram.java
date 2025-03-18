import java.util.Scanner;

public class Stringformatterprogram {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                while (true) {
                        System.out.print("\nEnter a text to format (or type 'N' to quit): ");
                        String text = scanner.nextLine().trim();

                        if (text.equalsIgnoreCase("N")) {
                                System.out.println("Exiting the program. Goodbye!");
                                break;
                        }

                        if (text.isEmpty()) {
                                System.out.println("Input cannot be empty. Try again.");
                                continue;
                        }


                        int length;
                        while (true) {
                                System.out.print("Enter alignment length: ");
                                if (!scanner.hasNextInt()) {
                                        System.out.println("Please enter a valid integer.");
                                        scanner.nextLine();
                                        continue;
                                }
                                length = scanner.nextInt();
                                scanner.nextLine();


                                if (length <= text.length()) {
                                        System.out.println("Alignment length must be greater than the text length.");
                                        continue;
                                }
                                break;
                        }


                        System.out.println("Formatted Outputs:");
                        System.out.println("Left  : " + text + "-".repeat(length - text.length()));
                        System.out.println("Right : " + "-".repeat(length - text.length()) + text);
                        int leftPadding = (length - text.length()) / 2;
                        int rightPadding = length - text.length() - leftPadding;
                        System.out.println("Center: " + "-".repeat(leftPadding) + text + "-".repeat(rightPadding));
                }

                scanner.close();
        }
}
