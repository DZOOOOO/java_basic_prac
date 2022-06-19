import java.util.Scanner;

/**
 * 해당 프로그램은 예측에 필요한 a, b를 사용자가 입력하도록 합니다.
 * 해당 프로그램은 하나의 값이 아닌 다수의 값을 입력받고 다수의 예측을 수행하도록 합니다.
 */
public class Ai_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("==============================");
        System.out.println("[System] a 값을 입력하여 주세요 : ");
        int a = scanner.nextInt();
        System.out.println("[System] b 값을 입력하여 주세요 : ");
        int b = scanner.nextInt();
        System.out.println("==============================");

        float[] addFees = new float[4];
        addFees[0] = 580.0f;
        addFees[1] = 700.0f;
        addFees[2] = 810.0f;
        addFees[3] = 840.0f;

        System.out.println();
        System.out.println("[안내] 입력된 '광고비'는 다음과 같습니다.");
        System.out.printf("1 번째) %.1f원   2 번째) %.1f원   3 번째) %.1f원   4 번째) %.1f원",
                addFees[0], addFees[1], addFees[2], addFees[3]);

        double[] y_list = new double[4];
        for (int i = 0; i < addFees.length; i++) {
            y_list[i] = a * addFees[i] + b;
        }

        System.out.println("");
        System.out.println("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.");
        for (int i = 0; i < y_list.length; i++) {
            System.out.printf("%d 번째 예측) %.1f회 방문", i, y_list[i]);
            System.out.println();
        }
    }
}
