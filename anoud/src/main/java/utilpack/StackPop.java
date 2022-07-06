package utilpack;
import java.util.Stack;
public class StackPop {
	
	
	    public static void main(String[] args) {
	        Stack<String> animals= new Stack<>();

	       
	        animals.push("Dog");
	        animals.push("Horse");
	        animals.push("Cat");
	        System.out.println("Initial Stack: " + animals);

	        
	        String element = animals.pop();
	        System.out.println("Removed Element: " + element);
	    }
	}



