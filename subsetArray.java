public class subsetArray {
    public static void main(String[] args) {
        int arr1[] = new int[] { 11, 1, 13, 21, 3, 7 };
        int arr2[] = new int[] { 11, 3, 7, 1 };
        int n = arr1.length;
        int m = arr2.length;
        Boolean ans = subsetarray(arr1, arr2, n, m);
        if (ans)
            System.out.println("Subset Found");
        else
            System.out.println("Subset not found");

    }

    private static Boolean subsetarray(int[] arr1, int[] arr2, int n, int m) {

        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break;
            if (j == m)
                return false;
        }
        return true;
    }
}
