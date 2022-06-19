public class Ai_V3 {
    public static void main(String[] args) {
        float[][] xy_lists = new float[4][2];
        xy_lists[0][0] = 374.0f;
        xy_lists[0][1] = 1161.0f;
        xy_lists[1][0] = 385.0f;
        xy_lists[1][1] = 1401.0f;
        xy_lists[2][0] = 375.0f;
        xy_lists[2][1] = 1621.0f;
        xy_lists[3][0] = 401.0f;
        xy_lists[3][1] = 1681.0f;

        System.out.println("[인공지능 프로그램 V3]");
        System.out.println("==============================");
        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");
        for (int i = 0; i < xy_lists.length; i++) {
            System.out.printf("%d번 째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f [인공지능 예측값] 웹 페이지 방문자 수 : %.1f",
                    i + 1, xy_lists[i][0], xy_lists[i][1]);
            System.out.println();
        }
        System.out.println();

        double sum_diff_pow = 0.0;

        for (int i = 0; i < xy_lists.length; i++) {
            float diff = xy_lists[i][0] - xy_lists[i][1];
            double diff_pow = (double)(diff * diff);
            float diff_pow_float = diff * diff;
            System.out.printf("[%d 번째 데이터] 실제 값과 예측값의 오차 : %.1f", i+1, diff);
            System.out.println();
            System.out.printf("[안내] 오차의 제곱 : %.1f", diff_pow);
            System.out.println();
            System.out.println();
            sum_diff_pow += diff_pow;
        }

        System.out.println("==============================");
        System.out.printf("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : %.1f", sum_diff_pow);
    }
}
