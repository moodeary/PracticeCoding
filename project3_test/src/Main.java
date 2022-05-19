import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AI1 a1 = new AI1();
        AI2 a2 = new AI2();
        AI3 a3 = new AI3();

        a1.method1();
        System.out.println("=====================================================================================");
        a2.method1();
        System.out.println("=====================================================================================");
        a3.method1();
    }
}

class AI1 {
    public void method1 () {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println(" 광고비를 입력해 주세요. ");
        int A = sc1.nextInt();

        System.out.println(" 예측 클릭수를 입력해 주세요.");
        int B= sc2.nextInt();


        System.out.println(" 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) " + A);
        System.out.println(" 입력된 광고비는 " + A + "원 입니다.");
        System.out.println(" AI의 예측(클릭 수)는 " + B + "회 입니다");
        System.out.println(" 총 수익은 " + A * B + "입니다.");
    }
}

class AI2 {

    public void method1 (){


        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println( " A의 값을 입력해 주세요 ");
        int A = sc1.nextInt();
        System.out.println( " B의 값을 입력해 주세요 ");
        int B = sc2.nextInt();

        System.out.println( "=====================");
        System.out.println( " 입력된 A 값 = " + A );
        System.out.println( " 입력된 B 값 = " + B );
        System.out.println( "=====================");

        double[] realData = {580.0, 700.0, 810.0, 840.0};
        double[] clickCount = {1161.0, 1401.0, 1621.0, 1681.0};

        System.out.println( " 입력된 '광고비'는 다음과 같습니다. ");
        System.out.printf(" 1 번째) %.1f원 2 번째) %.1f원 3 번째) %.1f원 4 번째) %.1f원 ", realData[0],realData[1],realData[2],realData[3]);
        System.out.println();
        System.out.println();
        System.out.println( " AI의 '웹 페이지 방문자' 예측 결과는 다음과 같다 ");
        System.out.printf(
                "  1 번째 예측) %.1f회 방문%n " +
                " 2 번째 예측) %.1f회 방문%n " +
                " 3 번째 예측) %.1f회 방문%n " +
                " 4 번째 예측) %.1f회 방문%n ",clickCount[0],clickCount[1],clickCount[2],clickCount[3] );

    }
}

class AI3 {

    public void method1 () {
        double[] comPeo = {374.0, 385.0, 375.0, 401.0};
        double[] aiCal = {1161.0, 1401.0, 1621.0, 1681.0};
        double[] def = new double[4];

        for (int i =0; i<4; i++) {
            System.out.printf( i + " 번째 데이터) [실제 값]웹 페이지 방문자 수 : %.1f [인공지능 예측값] 웹 페이지 방문자 수 : %.1f%n", comPeo[i],aiCal[i]);
        }
        System.out.println();

        for (int i =0; i<4; i++) {
            def[i] = comPeo[i] - aiCal[i];
            System.out.printf( i + " 번째 데이터] 실제 값과 예측값의 오차 : %.1f%n [안내] 오차의 제곱 : %.1f%n", def[i],Math.pow(def[i],2));
        }
    }
}