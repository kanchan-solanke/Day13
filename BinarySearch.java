import java.util.Arrays;

class BinarySearch {
    public static void BinarySearch() {
        String arr[] = {"A", "B", "C", "D"};
        String key = "B";
        int result = Arrays.binarySearch(arr, key);
        if (result < 0) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is found at index" + result);
        }
    }
    public static void main(String[] args) {
        BinarySearch();
    }
    }
