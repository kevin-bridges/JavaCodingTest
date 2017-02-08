import java.util.TreeSet;

public class FindMiddleElement {
	public int Find(TreeSet<Integer> TSCombinedList){
		int half = TSCombinedList.size()/2;
		int mod = TSCombinedList.size()%2;
		return mod + half;
	}
}
