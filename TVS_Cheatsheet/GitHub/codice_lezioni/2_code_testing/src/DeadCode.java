import java.util.Scanner;

public class DeadCode {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x * x < 0) {
			System.out.println("deadcode");
		}
		sc.close();
	}

}
