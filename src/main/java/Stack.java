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
}
