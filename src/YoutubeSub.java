import java.util.Arrays;
import java.util.Scanner;

public class YoutubeSub {
    //TODO:
    static final String ID = "admin";
    static final String PW = "0000";

    static String[] banLetter = new String[]{"킹", "시발", "꺼저", "미친"};
    static String[] okLetter = new String[]{"열", "사랑", "용기", "희망"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
        String ID = scanner.nextLine();
        System.out.println("[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : ");
        String PW = scanner.nextLine();

        if (ID.equals("admin") && PW.equals("0000")) {
            System.out.println("[안내] 안녕하세요 " + ID + "님");
            System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");

            String sub = scanner.nextLine();
            System.out.println("========================================");
            System.out.println("[알림] 프로그램의 금칙어 리스트입니다.");
            System.out.println("[킹, 시발, 꺼져, 미친]");
            System.out.println("========================================");

            String[] split = sub.split(" ");
            for (int i = 0; i < split.length; i++) {
                for (int j = 0; j < banLetter.length; j++) {
                    if (split[i].contains(banLetter[j])) {
                        split[i] = split[i].replace(banLetter[j], okLetter[j]);
                    }
                }
            }

            System.out.println("[알림] 자막 순화 프로그램 결과입니다.");
            System.out.println(">>>" + Arrays.toString(split)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "")
            );

            System.out.println("[안내] 프로그램을 종료합니다.");
        } else {
            System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
        }
    }
}
