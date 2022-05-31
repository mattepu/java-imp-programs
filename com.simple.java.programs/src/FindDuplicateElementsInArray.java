import java.util.*;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
       int array[] = {1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8, 10, 10, 11, 12, 13};
        //int array[] = {1, 2, 3, 3};
        List list = new ArrayList();
        Set set = new HashSet();
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                //System.out.println("the element is not existing in list, trying to add into the list " + array[i]);
                list.add(array[i]);
                int count = 1;
                if(map.size() == 0) {
                    map.put(String.valueOf(array[i]), count);
                } else {
                    String arrayElement = String.valueOf(array[i]);
                    if(map.containsKey(arrayElement)){
                        Integer integer = map.get(arrayElement);
                        map.put(arrayElement, integer+1);
                    } else {
                        map.put(arrayElement, count);
                    }

                }
                System.out.println("map " + map);
                //addElements(map, array[i]);
            } else {
                //System.out.println("the element is already added into the list " + array[i]);
                set.add(array[i]);
                int count = 1;
                if(map.size() == 0) {
                    map.put(String.valueOf(array[i]), count);
                } else {
                    String arrayElement = String.valueOf(array[i]);
                    if(map.containsKey(arrayElement)){
                        Integer integer = map.get(arrayElement);
                        map.put(arrayElement, integer+1);
                    } else {
                        map.put(arrayElement, count);
                    }

                }
                System.out.println("map " + map);
                //addElements(map, array[i]);
            }
        }
        System.out.println("List of elements -> " + list);
        System.out.println("Set of elements -> " + set);
    }
    //private static void addElements(Map<String, Integer> map, int i) {

    //}
}
