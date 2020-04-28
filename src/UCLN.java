import java.util.Scanner;
public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên a: ");
        int numA = scanner.nextInt();
        System.out.println("Nhập số nguyên b");
        int numB = scanner.nextInt();
        if (numA==0&&numB==0){
            System.out.println("2 số bạn nhập ko có UCLN");
        }
        int i = 0;
        if (numA < numB) {
            i = numA;
        } else {
            i = numB;
        }
        while (i > 0) {
            if (numA % i == 0 && numB % i == 0) {
                System.out.println(i + " là UCLN của " + numA + " và " + numB);
                break;
            }
            i--;
        }

        //cach 2: -----------------------------------------------------------------------------------
//        int a,b;
//        System.out.println("Enter the first number: ");
//        a = scanner.nextInt();
//        System.out.println("Enter the second number: ");
//        b = scanner.nextInt();
//
//        a = Math.abs(a);
//        b = Math.abs(b);
//
//        if (a == 0 || b == 0)
//            System.out.println("No greatest common factor");
//
//        while (a != b) {
//            if (a > b) a = a - b;
//            else b = b - a;
//        }
//
//        System.out.println("Greatest common factor: " + a);
    }
}
