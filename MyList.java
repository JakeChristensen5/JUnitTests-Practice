
/**
 * An implementation of the ListADT interface using arrays internally.
 */
public class MyList<ElementType> implements ListADT<ElementType> {

    // the array that represents our list
    private Object[] _listArray = null;
    // the number of elements in the list
    private int _size;

    /**
     * The no-parameter constructor for the list class.
     */
    public MyList() {
        // initialize the array with a capacity of 100
        _listArray = new Object[100];
        // initialize this._size to 0
        _size = 0;
    }

    @Override
    public void add(ElementType element) {
        // check if we need to resize
        if (_listArray.length <= _size) {
            // create a new list that is double in size
            Object[] newArray = new Object[_size * 2];


            for (int i = 0; i < _size; i++) {
                // copy every element from the old to the new list
                newArray[i] = _listArray[i];
            }
            _listArray = newArray;
        }
        // add new element at the end of the list
        _listArray[_size] = element;
        // increment element counter
        _size++;
    }

    @Override
    public ElementType get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ElementType remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }
}
