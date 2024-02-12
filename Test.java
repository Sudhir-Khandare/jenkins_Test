import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        int a[] = { 1, 2, 1, 3, 5, 6, 7 };
        int n = a.length;
        Arrays.sort(a);
        int b[] = new int[n];

        m1(a, b, n);
    }

    public static void m1(int a[], int b[], int n) {
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                b[j] = a[i];
                j++;
            }
            b[j] = a[n - 1];
        }

        System.out.println(Arrays.toString(b));
    }
}