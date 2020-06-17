import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetAlgorithm {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// Question 1
		Scanner inFile1 = new Scanner(new File("q1input.txt"));
		HashSet<String> hashSet1 = new HashSet<String>(10);

		while (inFile1.hasNextLine()) {
			hashSet1.add(inFile1.nextLine());
		}
		Iterator<String> iterator = hashSet1.iterator(); 
		int j = 1;
        while (iterator.hasNext())  {
            System.out.println("String" + j + " : " + iterator.next()); 
            j++;
        }
        
        //Question 2 
        
        
    } 

}
