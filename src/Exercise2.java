public class Exercise2 {
    public static void main(String[] args) {
        //* Chu nhat
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print("* ");
//            }
//        System.out.println(" ");
//        }


        //* Tam giac vuong
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//        System.out.println(" ");
//        }

//        for (int i = 0; i < 6; i++) {
//            System.out.print("* ");
//            if (i == 5){
//                System.out.println(" ");
//            }
//        }

        //* Tam giac vuong nguoc
//        for (int i = 5; i >  0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//        System.out.println(" ");
//        }

        //* Tam giac can
//        String arr = "* * * * * * *";
//        System.out.printf("%-6s%.1s", " ", arr);
//        System.out.println(" ");
//        System.out.printf("%-4s%.5s", " ", arr);
//        System.out.println(" ");
//        System.out.printf("%-2s%.9s", " ", arr);

        String kc = "";
        String result = "";
        for (int i = 14; i > 5; i -= 2) {
            for (int j = 0; j < i / 2; j++) {
                kc += " ";
            }
            result += "* ";
            System.out.println(kc + result + kc);
            kc = "";
        }


//        for (int i = 0; i < 5; i++) {
//            System.out.print("     ");
//            for (int j = 0; j < 3; j++) {
//                System.out.print("* ");
//                if ( j == 2) {
//                    System.out.println(" ");
//                }
//            }
//        }
    }
}
