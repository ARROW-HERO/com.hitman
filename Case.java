import java.util.Scanner;

public class Case{
	public static void main(String[] args){
		System.out.println("Pleas input lady's age:");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int i;
        i = age / 18;
		switch(i){
			case 0:
			System.out.printf("little lady!");
			break;
			default:
			System.out.printf("big lady!");
			break;
		}
	}
}