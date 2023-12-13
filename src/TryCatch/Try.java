package TryCatch;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		
		System.out.println("Program Başladı!!!");
		
		int x = 0, y;
		int[] array = new int[3];
		Scanner scan = new Scanner(System.in);
		
		
		try {
			x = 2 / 1;
			array[0] = 10;
			y = scan.nextInt();
		}catch(ArithmeticException e ) {
			System.out.println("0'a Bölünme Hatası!!");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Boyut Htası!!");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Bir Hata Var!!");
			System.out.println(e.toString());
		}finally {
			System.out.println("Finally Kısmı!!");
		}
		System.out.println("Program Bitti!!");

	}

}
