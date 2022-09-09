// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack stack_shirt = new Stack(5);
  
      // Insert new elements into the stack
      stack_shirt.push("Grey Shirt");
      stack_shirt.push("Blue Shirt");
      stack_shirt.push("Red Shirt");
      stack_shirt.push("Black Shirt");
      stack_shirt.push("Green Shirt");
      
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + stack_shirt.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + stack_shirt.peek());
  
      // Remove top element in the stack
      stack_shirt.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      stack_shirt.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + stack_shirt.peek());
    }
  }
