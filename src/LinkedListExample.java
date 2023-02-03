import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main (String args[]) {

        //must traverse through all elements from pointer to pointer
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1ll");
        linkedList.add("Element 2ll");
        System.out.println(linkedList.getFirst());

        //much faster access by direct index access
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1al");
        arrayList.add("Element 2al");
        System.out.println(arrayList.toString());

        //simple Array fixed size
        String [] singleArray = new String[2];
        singleArray[0] = "Element 1a";
        singleArray[1] = "Element 2a";
        System.out.println(Arrays.toString(singleArray));

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element 1hm");
        hashSet.add("Element 2hm");
        System.out.println(hashSet.toString());


    }
}
