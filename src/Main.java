import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		
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
		System.out.println("TreeSet contains: " + TSCombinedList.toString());
		
		//Remove Middle Element
		//Removing Middle Element from the TreeSet
		FindMiddleElement finder = new FindMiddleElement();
		int removeItem = finder.Find(TSCombinedList);
		System.out.println("Remove middle: "+TSCombinedList.remove(removeItem));
		System.out.println("TreeSet contains: " + TSCombinedList.toString());
		
		//Print in descending order
		System.out.println("TreeSet reverse order: " + TSCombinedList.descendingSet().toString());
		
		//Print size of TreeSet
		System.out.println("Size of TreeSet: " + TSCombinedList.size());
		
		
		//Define a collection that contains a key/value pair
		//•	Add 5 key/value pairs to the collection
		//
		// I'm using a LinkedHashMap because it doesn't allow duplicates
		// and it is sort-able
		//
		// Map representing (Subject, grades) as (key, value) pair
		Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();
		linkedHashMap.put("History", new Double(97.98));
		linkedHashMap.put("Science", new Double(89.76));
		linkedHashMap.put("Math", new Double(90.47));
		linkedHashMap.put("PE", new Double(95.00));
		linkedHashMap.put("English", new Double(81.55));
		linkedHashMap.put("English", new Double(81.55));
		
		// Displaying the contents of the LinkedHashMap
		System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
		System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());

	}



}
