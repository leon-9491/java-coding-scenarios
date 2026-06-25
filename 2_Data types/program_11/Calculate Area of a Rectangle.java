import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        
        int area = length * breadth;
        
        System.out.print(area);
    }
}