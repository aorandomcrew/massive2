import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("сумма трат за месяц: " + sum);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        Arrays.sort(arr);
        System.out.println("минимальная трата за месяц: " + arr[0]);
        System.out.println("максимальная трата за месяц: " + arr[29]);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index< arr.length; index++){
            sum=sum+arr[index];
        }
        double average = sum/30.0;
        System.out.println("средняя трата в день за месяц: " + average);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = 0; index<reverseFullName.length/2; index++){
            int tmp=reverseFullName[index];
            reverseFullName[index]=reverseFullName[reverseFullName.length-index-1];
            reverseFullName[reverseFullName.length-index-1]= (char) tmp;
        }
        System.out.println(reverseFullName);
    }
}