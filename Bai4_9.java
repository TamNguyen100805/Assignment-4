package pheptinh;

import java.util.Scanner;

public class Bai4_9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap xep hang: ");
        int place = scanner.nextInt();
        if (place == 1){
            System.out.println("Gold medal");
        }else if (place == 2){
            System.out.println("Silver medal");
        }else if (place == 3){
            System.out.println("Bronze medal");
        }
    }
}
