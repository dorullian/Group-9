/* Dustin Orullian
 * CSIS 1400
 * Spring Semester 2020
 * Lab Class Arrays
 */
import java.util.Arrays;

public class LabArraysClass 
{
	public static void main(String[] args)
	{
		int[] iArray1 = {6, 12, 3, 9};
		int[] iArray2 = new int[5];
		
		// fill iArray2 with 7	
		for(int i= 0; i < iArray2.length; i++) {
			iArray2[i]= 7;
		}
		// print iArray1 and iArray2 (toString)
		System.out.println(Arrays.toString(iArray1));
		System.out.println(Arrays.toString(iArray2));
		// search for number 9 in iArray1 and print the value returned:
		System.out.println("9 in iArray1: " + Arrays.binarySearch(iArray1, 9));
		// sort iArray1 and print it
		Arrays.parallelSort(iArray1);
		System.out.println(Arrays.toString(iArray1));
		// search for number 9 in iArray1 and print the value returned:
		System.out.println("9 in iArray1: " + Arrays.binarySearch(iArray1, 9));
		// create iArray3 and assign it the first 3 elements of iArray1; print it
		int[] iArray3= new int[3];
		for(int i= 0; i < iArray3.length; i++) {
			iArray3[i]= iArray1[i];
			
		}
		System.out.println(Arrays.toString(iArray3));
		// test equality of new int[] {3, 6, 9} and iArray3; print result
		int[] iArray4= {3, 6, 9};
		System.out.println("iArray3 equals [3, 6, 9]: " + Arrays.equals(iArray3, iArray4));
		System.out.println("Reason: to use binary search algorithm correctly the array must be sorted.\n The first time we searched"
				+ "for 9 in the array it was not sorted which is why we got -2.\n After the array was sorted the correct index number"
				+ "was displayed in the output.");
	}
}