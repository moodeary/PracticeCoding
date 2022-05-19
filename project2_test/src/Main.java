import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guGuDan gog = new guGuDan();
        gog.go();
    }
}

class guGuDan {

    Scanner sc = new Scanner(System.in);
    public int num1 = sc.nextInt();

    public void go() {
        if (num1 > 9 || num1 < 2) {
            System.out.println(" 프로그램을 종료합니다 ");

        } else {
            for (int num2 = 1; num2 < 10; num2++) {
                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
            }
        }
    }
}