import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomIntList {
	public static List<Integer> ThisRandomIntList(int myInt, int startValue) {
		List<Integer> solution = new ArrayList<>();
		for (int i = startValue; i <= myInt; i++) {
		    solution.add(i);
		}
		Collections.shuffle(solution);
		List<Integer>  returnSolution = solution;
		return returnSolution;
		
	}

}
