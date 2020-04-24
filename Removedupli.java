import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removedupli {


	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("TestVal1");
		l.add("TestVal2");
		l.add("TestVal1");
		l.add("TestVal2");
		l.add("TestVal2");
		l.add("TestVal3");
		Set<String>s = new LinkedHashSet<String>(l);
		System.out.println(s);
		
	}

}


/*
 * output: [TestVal1, TestVal2, TestVal3]
 */