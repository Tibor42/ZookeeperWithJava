import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i = 1;
        int sum = 0;
        do {
            i = scanner.nextInt();
            sum +=i;
        } while (scanner.hasNext() && i !=0);

        System.out.println(sum);
    }
}