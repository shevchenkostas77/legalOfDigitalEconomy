/*
2. Четырехзначное число назовем "в тренде",
если оно натуральное и в его записи есть только нечетные цифры.
Сколько существует четырехзначных чисел “в тренде”?
ОТВЕТ: 625;
*/

public class Task2 {
    static void inTrend(int start, int end) {
        int answer = 0;
        for (int i = start; i <= end; i++) {
            int countDigit = 0;
            int currentNum = i;
            while (currentNum != 0) {
                int currentDigitNum = currentNum % 10;
                if (currentDigitNum % 2 != 0) {
                    countDigit++;
                }
                currentNum /= 10;
            }
            if (countDigit == 4) {
                answer++;
            }
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        inTrend(1000, 9999);
    }
}