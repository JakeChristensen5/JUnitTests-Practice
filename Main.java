import java.lang.annotation.ElementType;

public class Main {



    public static void main(String[] args) {


        //adds a new list
        var newList = new MyList();

        //inserts a few elements into the list
        newList.add("1");
        newList.add("2");
        newList.add("3");

        //gets those elements from the list
        Object output1 = newList.get(1); //gets 1
        Object output2 = newList.get(2); //gets 2
        Object output3 = newList.get(3); //gets 3


        System.out.println("Outputs of the current list are: " + output1 + " " + output2 + " " + output3);
    }



}
