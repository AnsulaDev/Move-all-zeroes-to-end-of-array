

class MoveAllZeroToEnd {
    static void moveAll(int a[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                int tem = a[count];
                a[count] = a[i];
                a[i]=tem;
                count++;
            }

        }

    }
    public static void main(String args[]){
        int a[] = {10, 5, 0, 8, 0, 9};
        int n = 6;
        moveAll(a,n);
        for(int i =0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
