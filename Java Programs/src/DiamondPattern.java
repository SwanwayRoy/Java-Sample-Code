import java.util.Scanner;

public class DiamondPattern
{

	public static void diamond(int num)
	{

		int space = num / 2 + 1;
		int star = 1;
		for (int rcount = 0; rcount < num; rcount++) {

			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}
			System.out.println("");

			if (rcount < (num / 2)) {
				star += 2;
				space -= 1;
			}

			else {
				star -= 2;
				space += 1;
			}

		}

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int row;
		
		System.out.print("Enter the number of rows : ");
		row = sc.nextInt();
		
		DiamondPattern.diamond(row);
		
		sc.close();
	}
}