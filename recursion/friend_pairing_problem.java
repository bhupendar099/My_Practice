package recursion;

public class friend_pairing_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(friend(3));
	}

	public static int friend(int n) {
		// TODO Auto-generated method stub
		if(n==1||n==2) {
			return n;
			}
		int fnms=friend(n-1);
		int fnms1=friend(n-2);
		 int total= fnms+(n-1)*fnms1; 
		 return total;
		}

}
