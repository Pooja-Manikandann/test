import java.util.*;
public class TraillingZeros {
	public static long fact(long n) {
		if (n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long result=fact(num);
		//System.out.println("fact "+result);
		int count=0;
		while(result%10==0) {
			result=result/10;
			count++;
		//	System.out.println(result);
		}
		System.out.println(count);
	}

}
