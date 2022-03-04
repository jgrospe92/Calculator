import java.io.EOFException;

public class QueueImp<T> {
    
    private T[] elements;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    private final int DEFAULT_SIZE = 50;

    public QueueImp(){
        elements = (T[])new Object[DEFAULT_SIZE];
        capacity = DEFAULT_SIZE;
        front = 0;
        rear = -1;
        count = 0;

    }

    public QueueImp(int size){
        elements = (T[])new Object[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;

    }

    // return the size of the queue
    public int getSize(){
        return count;
    }

    // check to see if the queue is empty
    public boolean isEmpty(){
        return getSize() == 0;
    }

    // Check to see if the queue is full
    public boolean isFull(){
        return getSize() == capacity;
    }

    // remove the front element
    public T dequeue() throws Exception{
        if (isEmpty()) throw new Exception("Queue is empty");

        T removeEntry = elements[front];

        //print("dequeue " + removeEntry);
        
        front = (front + 1) % capacity;
        count--;
       
        return removeEntry;
    }

    // add an item to the queue
    public void enqueue(T newEntry) throws Exception{

        if(isFull()) throw new Exception("Queue is full");

       // print("enqueue " + newEntry);

        rear = ( rear + 1 ) % capacity;
        elements[rear] = newEntry;
        count++;
    }

    // return the front element of the queue
    public T getFront() throws Exception{
        if (isEmpty()) throw new Exception("Queue is empty");

        return elements[front];
    }

    @Override // delete this
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append('[');
        for (int i = 0; i < count ; i++){
            str.append(elements[i]);
            if (i < count - 1 ){
                str.append(",");

            }

            }

        str.append(']');
        return str.toString();
  
    }

    private static <T> void print(T data){
        System.out.println(data);
    }
    
    public static void main(String[] args) throws Exception {
        QueueImp q = new QueueImp<>(7);
        q.enqueue(3);
        q.enqueue(5);
        print(q.getFront());
        q.dequeue();
        print(q.getFront());
        q.dequeue();
        print(q.isEmpty());

        
    }
    
}
