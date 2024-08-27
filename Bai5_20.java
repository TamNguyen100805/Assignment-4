package Assignment_4;
public class Bai5_20 {
    public static void main(String[] args) {
        int n = 91;
        int factor = 2;
        while (n % factor !=0){
            factor++;
        }
        System.out.println("First factor is  " + factor);
    }
}
