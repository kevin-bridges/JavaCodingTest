import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// Circle
		Shape circle = new Circle(5);
		System.out.println("Circle Area: "+circle.getArea());
		System.out.println("Circle Perimeter: "+circle.getPerimeter());
		
		// Rectangle
		Shape rectangle = new Rectangle(5, 6);
		System.out.println("Rectangle Area: "+rectangle.getArea());
		System.out.println("Rectangle Perimeter: "+rectangle.getPerimeter());
		
		// Triangle
		Shape triangle = new Triangle(5, 6, 7);
		System.out.println("Triangle Area: "+triangle.getArea());
		System.out.println("Triangle Perimeter: "+triangle.getPerimeter());
		
		
		// Define 2 collections
		List<Integer> ListOne = RandomIntList.ThisRandomIntList(10, 1);
		System.out.println("Size of ListOne: "+ ListOne.size());
		System.out.println(" ListOne contains: " + ListOne.toString()); 
		
		List<Integer> ListTwo = RandomIntList.ThisRandomIntList(15, 6);
		System.out.println("Size of ListTwo: "+ ListTwo.size());
		System.out.println(" ListTwo contains: " + ListTwo.toString());
		
		//Combine the above two collections into a third collection 
		LinkedHashSet<Integer> MyCombinedIntList = CombineList.CombinedIntList(ListOne, ListTwo);
		System.out.println("HashSet contains: " + MyCombinedIntList.toString());
		
		//Convert to TreeSet for Sorting Purpose
		TreeSet<Integer> TSCombinedList= HashToTree.Convert(MyCombinedIntList);
		System.out.println("------------------------------");
		System.out.println("TreeSet contains: " + TSCombinedList.toString());
		
		//Remove Middle Element
		//Removing 8 from the TreeSet now manually until I build the class for this later
		System.out.println("Remove 8: "+TSCombinedList.remove(8)); 
		System.out.println("TreeSet contains: " + TSCombinedList.toString());
		
		//Print in descending order
		System.out.println("TreeSet reverse order: " + TSCombinedList.descendingSet().toString());
		
		//Print size of TreeSet
		System.out.println("Size of TreeSet: " + TSCombinedList.size());
		
		
		//Define a collection that contains a key/value pair
		//TODO
	}



}
