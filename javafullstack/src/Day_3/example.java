package Day_3;

public class example {
    public static void main(String[] args) {
        int a[] = {23, 23, 4, 45, 56, 78};
        int arr[] = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            // Check if a[i] appears elsewhere in a
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If no duplicate found, add to arr
            if (!isDuplicate) {
                arr[index++] = a[i];
            }
        }

        if (index == 0) {
            System.out.println("No non-repeated elements");
        } else {
            System.out.println("Non-repeated elements:");
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}