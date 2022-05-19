import java.util.Scanner;

public class Main {

    public static String id;
    public static int password;
    public static String message;

    public static void main(String[] args) {
        IdInfo idinfo = new IdInfo();
        IdInfo2 idinfo2 = new IdInfo2();
        idinfo2.method1();
        idinfo.method1();
    }
}

class IdInfo {
    public void method1() {


        if(Main.message.contains("씨발") || Main.message.contains("킹받네") || Main.message.contains("꺼저") || Main.message.contains("미친") ) {
            Main.message = Main.message.replace("씨발", "에구");
            Main.message = Main.message.replace("킹받네", "화나네");
            Main.message = Main.message.replace("꺼저", "저리가");
            Main.message = Main.message.replace("미친", "충격");

            System.out.println("===================================");
            System.out.println("알림 : 프로그램의 금칙어를 사용하셨습니다.");
            System.out.println("[ 킹, 씨발, 꺼저, 미친 ] ");
            System.out.println("===================================\n");
            System.out.println("알림 : 자막 순화 프로그램 결과입니다.");
            System.out.println(Main.message);
            System.out.println("알림 : 안내 프로그램을 종료합니다. ");

        }
    }
}

class IdInfo2 {
    public void method1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<10; i++) {
            System.out.println(" 유튜브 계정의 아이디를 입력하세요 ");
            Main.id = sc.nextLine();
            System.out.println(" 유튜브 계정의 비밀번호를 입력하세요 ");
            Main.password = Integer.parseInt(sc.nextLine());

            if (!Main.id.equals("ChoonSik") || Main.password != 1234) {
                System.out.println("아이디 또는 비밀번호를 잘못 입력하셨습니다.");
            } else {
                System.out.println("로그인 되었습니다.");
                break;
            }
        }

        System.out.println(" 안녕하세요 " + Main.id + "님");
        sc.nextLine();
        System.out.println(" 유튜브 영상의 자막을 생성해 주세요 ");
        Main.message = sc.nextLine();
        System.out.println();


    }
}

