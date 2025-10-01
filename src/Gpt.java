public class Gpt  {
    public static void main(String[] args) {
        // Исходный массив от 1 до 100
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Новый массив для четных чисел
        int[] evens = new int[numbers.length / 2];
        int index = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evens[index] = num;
                index++;
            }
        }

        // Выводим результат
        System.out.println("Четные числа:");
        for (int even : evens) {
            System.out.println(even);
        }
    }
}


