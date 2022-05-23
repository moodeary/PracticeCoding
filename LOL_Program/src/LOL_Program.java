import java.util.Scanner;

class LoL_char {
    private String name;
    private String ad;
    private String def;
    private String hp;

    void user_info(String name, String ad, String def, String hp) {
        this.name = name;
        this.ad = ad;
        this.def = def;
        this.hp = hp;

    }


    String[] user_create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[시스템] 유닛 [이름]을 입력해 주세요:");
        String name = sc.next();
        System.out.println("[시스템] 유닛 [공격력]을 입력해 주세요:");
        String ad = sc.next();
        System.out.println("[시스템] 유닛 [방어력]을 입력해 주세요:");
        String def = sc.next();
        System.out.println("[시스템] 유닛 [체력]을 입력해 주세요:");
        String hp = sc.next();


        user_info();
    }
}


public class LOL_Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}