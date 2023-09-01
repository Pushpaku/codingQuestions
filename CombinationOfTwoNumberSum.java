
public class CombinationOfTwoNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {8,7,3,1,9,5,2,4,6};
int target = 10;

for(int i=0;i<arr.length-1;i++) {
	for(int j =i+1;j<arr.length;j++) {
		if(arr[i]+arr[j] == target) {
			System.out.println("Combination of number"+arr[i]+ " "+arr[j]);
		}
	}
}

	}

}
