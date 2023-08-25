package recursion;

public class tilling_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(tilling( 5) );
	}
	public static int  tilling(int n) {
		if(n==0||n==1) {
			return 1;
		}
		 int fnm1=tilling(n-1);
		 int fnms2=tilling(n-2);
		 int totalway=fnm1+fnms2;
		 return totalway;
	}

}
