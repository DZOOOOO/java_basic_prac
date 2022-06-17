import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        while (true) {
            System.out.println("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            if (num > 9 || num < 2) {
                System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println(num + "단 이 입력되었습니다.");
            for (int i = 1; i <= 9; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }
    }


    public void gugudan(int num) {
        System.out.println("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : " + num);
        System.out.println();
        if (num > 9 || num < 2) {
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
            System.out.println("프로그램을 종료합니다.");
            return;
        }
        System.out.println(num + "단 이 입력되었습니다.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
