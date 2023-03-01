import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //* BT1: In 20 số nguyên tố đầu tiên.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố cần in");
        int num = sc.nextInt();
        int count = 0;
        int N = 2;
        String result = "Dãy số nguyên tố của bạn là:";
//        boolean check = true;
        int check = 0;
        while (count < num) {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = 1;
                }
            }
            if (check == 0) {
                result += " " + N;
                count++;
            }
            N++;
            check = 0;
        }
        System.out.println(result);
    }
}
