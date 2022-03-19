

public class StackImp <T> {

    private int top;
    private final int DEFAULT_SIZE = 20;
    private T [] elements;
    private int capacity;

    // Default constructor
    StackImp(){
        elements =  (T[]) new Object[DEFAULT_SIZE];
        capacity = DEFAULT_SIZE;
        top = -1;
    }

    // Initiating the stack
    StackImp(int size){
        elements = (T[]) new Object[size];
        capacity = size;
        top = -1;
        
    }

    // check if Stack is empty
    public boolean isEmpty(){
        return top == -1 ;
    }
    // Check if the stac is full
    private boolean isFull(){
        return top == capacity - 1;
    }
    // check the size of the Stack
    public int getSize(){
        return top + 1;
    }
    // clear the stack
    public void clear(){
        top = -1;
    }
  

    // Add an element on to the stack
    public void push(T newEntry) throws Exception{
        if (isFull()){
            throw new Exception("Stack is full");
        }
        elements[++top] = newEntry;

    }

    // Remove the top element on the stack.
    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return elements[top--];
    }

    // Return the top element of the stack without removing it.
    public T peek() throws Exception{

        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return elements[top];
    }


    // print method
    private static <T> void print(T data){
        System.out.println(data);
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append('[');
        for (int i = 0; i <= top; i++){
            str.append(elements[i]);
            if (i < top ){
                str.append(",");

            }

            }

        str.append(']');
        return str.toString();
  
    }
}
