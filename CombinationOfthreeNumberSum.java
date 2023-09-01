
public class CombinationOfthreeNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {-5, 2, 3, 1, -4, 6 };
		int targat = 0;
		
		for(int i = 0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k= j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k] == targat) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k] );
					}
				}
			}
		}
	}

}
