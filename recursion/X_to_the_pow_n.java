package recursion;

public class X_to_the_pow_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power( 2, 2));
	}

	

	public static int power(int x, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}
		int fn= power(x,n-1);
		int xn= x*fn;
		return xn;
	
	}

	

}
