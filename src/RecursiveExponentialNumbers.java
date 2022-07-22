import java.util.Scanner;

public class RecursiveExponentialNumbers {

    static int exp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int sub = scanner.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        int sup = scanner.nextInt();
        int result = 1;
        double resultD = 1 ;
        if (sub == 0){
            System.out.println("Tanımsız!");
        }
        if (sup >= 0) {
            for (int i = 1; i <= sup; i++) {
                result *= sub;
            }
            System.out.println(result);
        }else{
            for (int i = -1; i >= sup; i-- ){
                resultD /= sub;
            }
            System.out.println(resultD);
        }
        System.out.print("Yeni Bir İşlem Yapmak İçin 1'e Basınız: ");
        int exit = scanner.nextInt();
        if (exit == 1){
            return exp();
        }

        return exit ;
    }

    public static void main(String[] args) {
        exp();
    }
}
