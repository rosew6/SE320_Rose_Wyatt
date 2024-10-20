package se320;

public class GenericStack<E> {
    private E[] elements; 
    private int size; 
    private static final int DEFAULT = 10;

    public GenericStack() {
        this(DEFAULT);
    }

    public GenericStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        elements = (E[]) new Object[initialCapacity]; 
        size = 0; 
    }

    public int getSize() {
        return size;
    }
    
    public E peek() {
        return isEmpty() ? null : elements[size - 1];
    }

    
    public void push(E element) {
        ensureCapacity(); 
        elements[size++] = element; 
    }

    
    public E pop() {
        if (isEmpty()) {
            return null; 
        }
        E topElement = elements[--size]; 
        elements[size] = null; 
        return topElement; 
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    private void ensureCapacity() {
        if (size == elements.length) {
            resize(); 
        }
    }

    private void resize() {
        E[] newArray = (E[]) new Object[elements.length * 2]; 
        System.arraycopy(elements, 0, newArray, 0, size); 
        elements = newArray; 
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("stack [ ");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}