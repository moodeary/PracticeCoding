import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(25));
        Fee a = new Fee();
        a.method1();

    }
}


class Fee {

    Scanner sc = new Scanner(System.in);

    double Total;  //  총 사용요금

    int input = sc.nextInt(); // 전기 총 사용량

    double Fee1 = 100 * 60.7; // 0~100까지 총 요금
    double Fee2 = Fee1 + 100 * 125.9; // 0~200까지 총 요금
    double Fee3 = Fee2 + 100 * 187.9; // 0~300까지 총 요금
    double Fee4 = Fee3 + 100 * 280.6; // 0~400까지 총 요금
    double Fee5 = Fee4 + 100 * 417.7; // 0~500까지 총 요금



    public void method1() {

        while (input > 0) {
            if (input <= 100) {
                Total += (input) * 60.7;
                break;
            } else if (input <= 200) {
                Total += Fee1 + (input - 100) * 125.9;
                break;
            } else if (input <= 300) {
                Total += Fee2 + (input - 200) * 187.9;
                break;
            } else if (input <= 400) {
                Total += Fee3 + (input - 300) * 280.6;
                break;
            } else if (input <= 500) {
                Total += Fee4 + (input - 400) * 417.7;
                break;
            } else if (input > 500) {
                Total += Fee5 + (input - 500) * 670.6;
                break;
            }
        }

        System.out.println("총 Total 요금은 = " + Total + "입니다.");
    }
}


