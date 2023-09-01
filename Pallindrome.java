
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 121 , rem, temp,sum=0;
		temp = n;
		while(n >0) {
			rem= n%10;
			sum = (sum*10)+rem;
			n= n/10;
			
		}
		if(temp == sum) {
			System.out.println(" palidropem ");
		}else {
			System.out.println(" Not paindrome");
		}
	}

}
