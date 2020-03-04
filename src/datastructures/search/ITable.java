package datastructures.search;

/**
 *
 */
public interface ITable<E> {
    
    /**
     * 
     * @param e - what to search
     * @return the position of the searched element.
     */
    public int search(E e);
    
    /**
     * Display all the records in the table.
     */
    public void display();
    
}
