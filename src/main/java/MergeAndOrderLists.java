import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeAndOrderLists {

    public static void main(String args[]) {
        List<Integer> list1 = Arrays.asList(1,4,6);
        List<Integer> list2 = Arrays.asList(2,3,5);

        List<Integer> list3 = mergeAndOrderTwoLists(list1, list2);

        System.out.println(list3);
    }

    public static List mergeAndOrderTwoLists(List list1, List list2) {

        List<Integer> listToReturn = new ArrayList<Integer>();

        for (int i =0; i<99999; i++) {
            if (list1.contains(i))  {
            listToReturn.add(i);
            }
            if (list2.contains(i))  {
            listToReturn.add(i);
            }
        }

        return listToReturn;
    }

}
