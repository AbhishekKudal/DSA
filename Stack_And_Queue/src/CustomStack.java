public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    private  boolean isEmpty(){
        return ptr == -1;
    }
    public boolean push(int item){
        if(isFull()){
            System.out.print("Stack is full");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws CustomStackException {
        if(isEmpty()){
            throw new CustomStackException("Cannot pop from empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws CustomStackException {
        if(isEmpty()){
            throw new CustomStackException("cannot peek from an empty stack");
        }
        return data[ptr];
    }

}
