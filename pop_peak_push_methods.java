package Collection;

import java.util.Stack;

public class pop_peak_push_methods {

	public static void main(String[] args) {
		Stack s1= new Stack();
		/*s1.push("Orange");
		s1.push("Yellow");
		s1.push("Red");
		s1.push("pink");
		s1.push("Black");
		System.out.println(s1);*/
		
		s1.push(10);
        s1.push(15);
        s1.push(30);
        s1.push(20);
        s1.push(5);
       // System.out.println("Popped element->"+ s1.pop());
        System.out.println("Popped element->"+ s1.pop());
        System.out.println("Peeked element->"+ s1.peek());
        System.out.println(s1);
			
	}

}
