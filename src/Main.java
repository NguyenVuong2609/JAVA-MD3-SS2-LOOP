import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //* TH1: Tìm số nguyên tố
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        int number = sc.nextInt();
//        if (number < 2) {
//            System.out.println(number + " is not a prime!");
//        } else {
//            int i = 2;
//            boolean check = true;
//            while (i < number) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if (check) {
//                System.out.println(number + " is a prime!");
//            } else {
//                System.out.println(number + " is not a prime!");
//            }
//        }

        //* TH2 Tính số tiền lãi
//        System.out.println("Nhập số tiền gửi:");
//        int sent = sc.nextInt();
//        System.out.println("Nhập số tháng gửi:");
//        int month = sc.nextInt();
//        System.out.println("Nhập lãi suất:");
//        double interests = sc.nextDouble();
//        double totalInterests = 0;
//        for (int i = 0; i < month; i++) {
//            totalInterests += (sent * interests) / (12 * 100);
//        }
//        System.out.println("Tổng tiền lãi sau khi bạn gửi " + month + " tháng là: " + totalInterests);

        //* TH3 Tìm ước chung lớn nhất
        System.out.println("Nhập số A:");
        int a = sc.nextInt();
        System.out.println("Nhập số B:");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Một số bằng 0 thì ước chung lớn nhất là số còn lại.");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                    System.out.println("a= " + a);
                } else {
                    b = b - a;
                    System.out.println("b= " + b);
                }
            }
        }
        if (a != 0 || b != 0) {
            System.out.println("Ước chung lớn nhất là: " + a);
        }
    }
}