import java.util.Arrays;

/**
 * Our very own deque collection class!  
 * @param <Item> We use a "generic" so that it can be a list of any object type
 */
public class Deque<Item> {
    
    
    /**
     * Add an item to the end of the deque
     * This method should run in constant time
     * @param value Item to add
     */
    public void addLast(Item value) {
        // TODO: Fill this in
    }
    
    /**
     * Add an item to the beginning of the deque
     * This method should run in constant time
     * @param value 
     */
    public void addFirst(Item value) {
        // TODO: Fill this in
    }
    
    /**
     * Remove and return the first item from the deque, or return
     * null if nothing is there
     * This method should run in constant time
     * @return The first item in the deque, or null if empty
     */
    public Item removeFirst() {
        // TODO: Fill this in
        return null;
    }
    
    /**
     * Remove and return the last item from the deque, or return null
     * if nothing is there
     * This method should run in constant time
     * @return The last item in the deque, or null if empty
     */
    public Item removeLast() {
        // TODO: Fill this in
        return null;
    }
    
    /**
     * Remove and return the first occurrence of an item from the 
     * deque, if it exists.  Otherwise, return null
     * (This method does not have to run in constant time, and should
     * probably use a while or do while loop)
     * @param value The value to remove
     * @return The value if found, or null if not found
     */
    public Item remove(Item value) {
        // TODO: Fill this in
        return null;
    }
    
    /**
     * Return how many elements are currently stored in the deque.
     * This method should run in constant time
     * @return Number of elements stored in the deque
     */
    public int size() {
        // TODO: Fill this in
        return 0;
    }
    
    /**
     * Return an array representation of the items in the deque.
     * If there are N elements, the array should be of length N.
     * Because of some Java weirdness, we have to return an array of
     * type Object instead of type Item, but everything is a subclass
     * of Object, so the cast will happen automatically upon assignment
     * @return An array of items in this deque
     */
    public Object[] toArray() {
        // TODO: Fill this in
        return null;
    }
    
    /**
     * Clear the entire deque
     * This should run in constant time
     */
    public void clear() {
        // TODO: Fill this in
    }
    
    public static void main(String[] args) {
        // Put some code in here to test your method
        // implementations as you're going along
    }
}
