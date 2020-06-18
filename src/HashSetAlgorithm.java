import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

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
		System.out.println("Question 1: ");
        while (iterator.hasNext())  {
            System.out.println("String" + j + " : " + iterator.next()); 
            j++;
        }
        
        //Question 2 
        System.out.println("Question 2 :");
        Scanner inFile2 = new Scanner(new File("q1input.txt"));
        TreeSet<String> treeSet1 = new TreeSet<String>();

		while (inFile2.hasNextLine()) {
			treeSet1.add(inFile2.nextLine());
		}
		Iterator<String> iterator2 = treeSet1.iterator(); 
		j = 1;
        while (iterator2.hasNext())  {
            System.out.println("String" + j + " : " + iterator2.next()); 
            j++;
        }
        
        //Question 3
        Scanner inFile3 = new Scanner(new File("q1input.txt"));
		HashSet<String> hashSet2 = new HashSet<String>(10);

		boolean distinct = true;
		while (inFile3.hasNextLine()) {
			String word = inFile3.nextLine();
			if (hashSet2.contains(word))
				distinct = false;
			hashSet2.add(word);
		}
		System.out.println("Question 3: ");
        if (distinct) {
        	System.out.println("DISTINCT");
        } else {
        	System.out.println("NOT DISTINCT");
        }
        
        
        
    } 

}
