package Evaluation1;

import java.util.*;

public class DescendingOrderFrequency {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of the array");
            arr[i]= scanner.nextInt();
        }
        new DescendingOrderFrequency().frequencySort(arr);
    }

    private void frequencySort(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (Map.Entry<Integer, Integer> entry : entryList) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                System.out.print(element);
            }
        }
    }


}
