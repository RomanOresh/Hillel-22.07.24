import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ7 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[15];                  // Создание массива

        for (int i = 0; i < array.length; i++) {
        array[i] = rand.nextInt(1, 100);      // Заполнение массива числами от 1 до 100
        }
        System.out.println("Начальный вид массива: " + Arrays.toString(array));     // Вывод получившегося массива


        for (int i = 1; i < array.length; i++) {           // Сортировка масива с помощью алгоритма сортировки Insertion sort
           int key = array[i];
           int j = i - 1;
              while(j >= 0 && array[j] > key){
                  array[j+1] = array[j];
                  j--;
              }
            array[j+1] = key;
        }
        System.out.println("Отсортированный вид массива: " + Arrays.toString(array)); // Вывод отсортированого массива
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);        // Получение от пользователя числа
        int number = scan.nextInt();
        int left = 0;
        int right = array.length - 1;
        while(left <= right){                         // Алгоритм бинарного поиска
            int mid = left + (right - left)/2;
            if(array[mid] == number){
                System.out.println("Индекс числа " + number + " в отсортированом масиве: " + mid);    // Вывод индекса найденого числа
                return;
            } else if (array[mid] < number) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println("Вы ввели неверное число"); // Вывод в случае неверного ввода

    }
}
