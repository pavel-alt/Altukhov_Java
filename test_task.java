import java.util.Scanner;
import java.util.Random;

public class Main {
    
    /** Метод, создающий массив и заполняющий его случайными числами */
    protected static int[] rnd() {
        Random random = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    
    /** Метод, проверяет элементы массива на кратность трём и выводит на печать кратные */
    public static void multiplicityOfThree() {
        int[] arr;
        arr = rnd();
        for (int el = 0; el < arr.length; el++){
            if (arr[el] % 3 == 0) {
                System.out.println(arr[el]);
            }
        }
    }
    
    /** Запрашивает у пользователя ввод целого числа и если введенное число больше 7, то выводит “Привет” */
    public static void moreThanSeven(){
        System.out.println("Введите число");
        Scanner num = new Scanner (System.in);
        int number;
        number = num.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
    
    /** Запрашивает у пользователя ввод имени, если введенное имя совпадает с Вячеслав, 
     * то выводит “Привет, Вячеслав”, если нет, то выводит "Нет такого имени" */
    public static void vyacheslav(){
        System.out.println("Введите имя");
        Scanner str = new Scanner (System.in);
        String i;
        i = str.nextLine();
        if (i.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void main(String[] args) {
        moreThanSeven();
        vyacheslav();
        multiplicityOfThree();
    }
}
