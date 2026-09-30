import java.util.*;

public class first
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int rest = X - 100;
	    int popcorn = rest/50;
		
		System.out.println(popcorn);
        sc.close();
	}
}
