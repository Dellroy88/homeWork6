public class Main {
     {
        int[] arr = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int generateRandomArray : arr) {
            sum += generateRandomArray;
        }
        System.out.println("Месячный доход составил " + sum);
        System.out.println();
        System.out.println("Задание 2");
        int maxExpenses = 100_000;
        int minExpenses = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minExpenses) {
                minExpenses = arr[i];
            }
            if (arr[i] > maxExpenses) {
                maxExpenses = arr[i];
            }
        }
        System.out.println("Максимальная трата за день " + maxExpenses + " рублей");
        System.out.println("Минимальная трата за день " + minExpenses + " рублей");

        System.out.println();
        System.out.println("Задание 3");
        System.out.println("Среднее потрачено за месяц " + (float) sum / 30 + " рублей");
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}




