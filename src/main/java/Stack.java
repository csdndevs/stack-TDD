public class Stack {


    private int element;
    private int size;


    public int size() {
        return size;
    }

    public void push(int element) {
        this.element = element;
        size++;
    }

    public int pop() {
        size--;
        return this.element ;

    }

}
