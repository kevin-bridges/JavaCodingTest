
import java.util.LinkedHashSet;
import java.util.List;


public class CombineList {
		public static LinkedHashSet<Integer> CombinedIntList(List<Integer> myListOne, List<Integer> myListTwo) {
		LinkedHashSet<Integer> solution = new LinkedHashSet<Integer>();
		solution.addAll(myListOne);
		solution.addAll(myListTwo);
		//System.out.println(" HashSet contains: " + solution.toString());
		//return (LinkedHashSet<Integer>) solution;
		return solution;
	}
}
