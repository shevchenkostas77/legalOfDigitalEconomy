/*
7. Есть числа - палиндромы (читаются одинаково слева направо,
а также справа налево, например, число 78387).
Сколько существует таких пятизначных чисел (от 10_000 до 99_999)?
ОТВЕТ: 900;
*/

public class Task7 {
    static int howManyPalindromes(int start, int end) {
        int answer = 0;
        for (int i = start; i <= end; i++) {
            int currentNum = i;
            int reverse = 0;
            while(currentNum != 0){
                reverse = reverse * 10 + currentNum % 10;
                currentNum = currentNum / 10;
            }
            if (i ==  reverse) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(howManyPalindromes(10_000, 99_999));
    }
}