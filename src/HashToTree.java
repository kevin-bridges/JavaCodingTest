import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashToTree {
	public static TreeSet<Integer> Convert(LinkedHashSet<Integer> myHash) {
	     // Create a HashSet
	     HashSet<Integer> hset = myHash;
	     TreeSet<Integer> ts = new TreeSet<Integer>();
	     //add elements to List
	     for(Integer hs : hset ){
	    	   ts.add(hs);
	     }
	     
	     return ts;
	  }
}
