public class OperationsOnArrays {

  static void traverseArray(int[] arr, int size) {
    // Time Complexity = O(n), Space (Auxiliary) Complexity = O(1)

    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void insertAtBeginning(int[] arr, int size, int value) { // Worst Case
    // Time Complexity = O(n), Space (Auxiliary) Complexity = O(1)
    for (int i = size; i > 0; i--)
      arr[i] = arr[i - 1];
    arr[0] = value;

  }

  static void insertByIndex(int[] arr, int size, int value, int idx) {
    // Time Complexity = O(n), Space (Auxiliary) Complexity = O(1)
    for (int i = size; i > idx; i--)
      arr[i] = arr[i - 1];
    arr[idx] = value;

  }

  static void insertAtEnding(int[] arr, int size, int value) { // Best Case
    // Time Complexity = O(1), Space(Auxiliary) Complexity = O(1)
    arr[size] = value;

  }

  public static void main(String[] args) {
    int[] arr = new int[10];
    int size = 5;

    arr[0] = 10;
    arr[1] = 5;
    arr[2] = 16;
    arr[3] = 19;
    arr[4] = 1;

    traverseArray(arr, size);
    System.out.println();
    insertAtBeginning(arr, size, 2);
    size++;
    traverseArray(arr, size);
  }
}