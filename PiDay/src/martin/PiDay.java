/**
 * 
 */
package martin;
import java.util.Scanner;
/**
 * @author 323375980
 *
 */
public class PiDay {
// ask amount of people in line
// ask # of pie available
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number of people in line");
		int k=input.nextInt();
		System.out.println("Enter number of pies");
		int n=input.nextInt();
		System.out.println("The possible outcome(s):");
		System.out.println(n);
		System.out.println(k);
		input.close();
	}

	//n represents the # of pieces of pie
	//k represents the # of people lined up for pie
	// p represents the first persons choice
	//k=n each person gets 1 pie
	//k=1 that person receives all the pie
	
		public static int piDay(int n,int k, int p){
			p=n/k;
			if (k==n||k==1){
				return 1;
			}else{
				return piDay(n-1,k-1,p);
				
			}
				
		}
}

