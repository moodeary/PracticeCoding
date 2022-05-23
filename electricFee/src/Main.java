import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("사용한 전기량을 입력해 주세요");
        Fee a = new Fee();
        a.method1();

    }
}


class Fee {

    Scanner sc = new Scanner(System.in);
    public double feeTotal, feeTotal1, feeTotal2, feeTotal3, feeTotal4, feeTotal5 = 0;

    double usingTotal, Total;

    int input = sc.nextInt();


    public void method1() {
        for (usingTotal = input; usingTotal >= 0; usingTotal -= 100) {


            if (usingTotal > 0 && usingTotal <= 100) {
                feeTotal += (usingTotal) * 60.7;
                break;
            } else if (usingTotal > 100 && usingTotal <= 200) {
                feeTotal1 += (usingTotal - 100) * 125.9;
            } else if (usingTotal > 200 && usingTotal <= 300) {
                feeTotal2 += (usingTotal - 200) * 187.9;
            } else if (usingTotal > 300 && usingTotal <= 400) {
                feeTotal3 += (usingTotal - 300) * 280.6;
            } else if (usingTotal > 400 && usingTotal <= 500) {
                feeTotal4 += (usingTotal - 400) * 417.7;
            } else if (usingTotal > 500) {
                feeTotal5 += (usingTotal - 500) * 670.6;
                usingTotal -= (usingTotal - 600) + 1;

            }
        }
        Total = (feeTotal + feeTotal1 + feeTotal2 + feeTotal3 + feeTotal4 + feeTotal5);

        System.out.println(
                " 0 ~ 100 구간의 전기요금은 = " + feeTotal + "\n" +
                        " 100 ~ 200 구간의 전기요금은 = " + feeTotal1 + "\n" +
                        " 200 ~ 300 구간의 전기요금은 = " + feeTotal2 + "\n" +
                        " 300 ~ 400 구간의 전기요금은 = " + feeTotal3 + "\n" +
                        " 400 ~ 500 구간의 전기요금은 = " + feeTotal4 + "\n" +
                        " 500 ~  구간의 전기요금은 = " + feeTotal5 + "\n" +
                        "총 Total 요금은 = " + Total + "입니다.");

    }
}