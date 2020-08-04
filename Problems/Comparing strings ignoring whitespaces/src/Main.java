import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String stripped1 = str1.replaceAll("\\s","");
        String stripped2 = str2.replaceAll("\\s", "");
        boolean areSame = stripped1.equals(stripped2);

        System.out.println(areSame);
    }
}