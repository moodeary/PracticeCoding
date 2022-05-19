import java.util.Scanner;

public class Main {

    public static int countNum;

    public static void main(String[] args) {
        Fibonacci1 fibonacci1 = new Fibonacci1();
        fibonacci1.method1();
    }
}

class Fibonacci1 {
    void method1() {



        Scanner sc = new Scanner(System.in);
        System.out.println("안내: 피보나치 수열 프로그램 Start");
        System.out.println("원하는 수열의 개수를 입력해주세요");
        Main.countNum = sc.nextInt();
        int[] fibonacci = new int[Main.countNum];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        long sum = 0;
        System.out.println("피보나치 수열 출력 시작 : 총 갯수는 (" + Main.countNum + ")개");

        for (int i = 2; i<Main.countNum; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            sum += (fibonacci[i] + 1);
        }

        for (int fibo : fibonacci) {
            System.out.println(fibo);
        }
        System.out.println("==============================================");
        System.out.println("모두 더한 값은" + sum + "이다.");

    }
}