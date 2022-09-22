public class Main {
    public static void main(String[] args) {

        //task 1
        int [] payment = generateRandomArray();
        int sum = 0;
        for (int element : payment) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task 2
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : payment) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей");

        //task 3
        double averagePayment = (double) sum / payment.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " рублей");

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}