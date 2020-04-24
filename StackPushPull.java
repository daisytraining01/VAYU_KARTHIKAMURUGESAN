import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPushPull {

	public static void main(String[] args) {
		Stack<String>person=new Stack<>();
		person.push("a");
		person.push("a1");
		person.push("a2");
		System.out.println("The persons are :" +person);
		String element=person.pop();
		System.out.println("Removed elements :" +element);
		
	}
	}
/*
 * output: The persons are :[a, a1, a2] Removed elements :a2
 */