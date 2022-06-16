public class ElectricityBill {
    public double electricBill(int kwh) {
        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(25));

        // 전기사용량 나누기
        double result = 0.0;
        int divKwh = kwh / 100;
        int restKwh = kwh % 100;

        // 사용량 계산하기
        if (divKwh < 1) {
            result = kwh * 60.7;
        } else if (divKwh == 1) {
            result = (100 * 60.7) + (restKwh * 125.9);
        } else if (divKwh == 2) {
            result = (200 * 125.9) + (restKwh * 187.9);
        } else if (divKwh == 3) {
            result = (300 * 187.9) + (restKwh * 280.6);
        } else if (divKwh == 4) {
            result = (400 * 280.6) + (restKwh * 417.7);
        }

        return result;
    }
}
