package LinkedList;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListLearning {
  public static void main(String[] args) {
    int size = 10;
    LinkedList<Integer> arr = List(size);
    System.out.println(arr);
    System.out.println(findDuplicates(arr));
  }

  // Generating of list
  public static LinkedList<Integer> List(int size) {
    Random random = new Random();
    LinkedList<Integer> arr = new LinkedList<Integer>();
    for(int i=0; i<size; i++) {
      arr.add(random.nextInt(size));
    }
    return arr;
  }

  // Get indexes of all duplicates
  public static LinkedList<Integer> findDuplicates(LinkedList<Integer> linkedList) {
    LinkedList<Integer> duplicates = new LinkedList<>();

    for (int i = 0; i < linkedList.size(); i++) {
        int currentNumber = linkedList.get(i);

        for (int j = i + 1; j < linkedList.size(); j++) {
            int nextNumber = linkedList.get(j);

            if (currentNumber == nextNumber && !duplicates.contains(currentNumber)) {
                duplicates.add(currentNumber);
                break;
            }
        }
    }

    return duplicates;
  }
}