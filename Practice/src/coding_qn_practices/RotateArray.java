package coding_qn_practices;
import java.util.Scanner;
import java.util.Arrays;

interface StringToInt{
	public int stringToInt(String s);
}
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String inputNums[]= scan.nextLine().split(" ");
		int k = scan.nextInt();
//	    StringToInt a = (p)->{
//			return Integer.parseInt(p);
//		};
//		inputNums.forEach((p)->{ 
//		     System.out.print(p);
//		});
		int inputNumsInt [] = new int[inputNums.length];
		for(int i=0;i<inputNums.length;i++) {
			inputNumsInt[i] = Integer.parseInt(inputNums[i]);
		}
	    int res [] = rotateArray(inputNumsInt, k);
        for(int a:res) {
        	System.out.print(a+" ");
        }

	}
	
	public static int[] rotateArray(int []nums,int k) {
		int len = nums.length;
		int res[] = new int[len];
		for(int i=0; i<len;i++) {
			res[i] = nums[(len-k+i)%len];
		}
		return res;
	}
}
