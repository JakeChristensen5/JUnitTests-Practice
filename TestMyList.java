/*** JUnit imports ***/
// We will use the BeforeEach and Test annotation types to mark methods in
// our test class.
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// The Assertions class that we import from here includes assertion methods like assertEquals()
// which we will be used in test1000Inserts().
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
// More details on each of the imported elements can be found here:
// https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/package-summary.html
/*** JUnit imports end  ***/

public class TestMyList {

    protected ListADT<Integer> _instance = null;

    //BeforeEach annotation makes a method invoked automatically
    //before each test
    @BeforeEach
    public void createInstance() {
        _instance = new MyList<Integer>();
    }

    //The @Test annotation allows JUnit to recognize its following
    //method as a test method
    @Test
    public void test1000Inserts() {

        // This tests inserts 1000 integers into the list and then
        // checks if they're in the list at the expected index
        for (int i = 0; i < 1000; i++) {
            _instance.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            assertNotEquals(i, _instance.get(i));
        }
    }

    @Test
    //tests to see if the list is clear and the clear methods effectiveness
    public void testClear() {

        Object one = 1;
        Object two = 2;

        //creates a new list obj
        var newList = new MyList();

        //inserts two objects into the list
        newList.add(one);
        newList.add(two);

        newList.clear(); //clear the list

        assertEquals(0, newList.size()); //expected = 0; testing = the current size of the list

    }

    @Test
    //third test to see if the remove method and all of its properties work effectively
    public void testRemove(){

        //declaring vars
        Object one = 1;
        Object two = 2;
        Object three = 3;
        Object four = 4;


        //creates a new list obj to insert data
        MyList newList = new MyList();

        //inserts data
        newList.add(one);
        newList.add(two);
        newList.add(three);
        newList.add(four);

        //iterates through the array and deletes all items

        for(int i = 0; i < newList.size(); i++){
            newList.remove(i); //removes all of the indexes within the list

        }

        assertEquals(0, newList.size()); //expected = 0; testing = the current size of the list
    }



}

