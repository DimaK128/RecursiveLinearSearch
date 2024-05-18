import java.util.ArrayList;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");
        list.add("kiwi");

        String key = "orange";
        int result = recLinearSearch(list, key, 0, list.size() - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the list.");
        }
    }

    public static int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx) {
        if (list.isEmpty() || beginIdx > endIdx) {
            return -1;
        }

        if (list.get(beginIdx).equals(key)) {
            return beginIdx;
        }

        return recLinearSearch(list, key, beginIdx + 1, endIdx);
    }
}
