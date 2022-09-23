import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static int[] RND() {
        Random random = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    
    public static void multiplicityOfThree() {
        int[] arr = new int[10];
        arr = RND();
        for (int el = 0; el < arr.length; el++){
            if (arr[el] % 3 == 0) {
                System.out.println(arr[el]);
            }
        }
    }
    
    public static void moreThanSeven(){
        Scanner num = new Scanner (System.in);
        int number;
        number = num.nextInt();
        if (number > 7) {
            System.out.print("Привет");
        }
    }
    
    public static void vyacheslav(){
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
