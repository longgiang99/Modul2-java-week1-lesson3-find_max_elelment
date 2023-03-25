import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang: ");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i <array.length ; i++) {
                if(array[i] > max){
                    max =  array[i];
                    index = i +1 ;
                }
        }
        System.out.println("gia tri lon nhat  cua mang la: " + max + " vi tri thu: " + index);
    }
}