class LinkedList<T> {
    private LinkedList next = null;
    private  T data;

    LinkedList() {

    }

    LinkedList(T data, LinkedList next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
