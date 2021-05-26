package atomicDemo5;

public class PX {
    public static void main(String[] args) {
        int a[]={1,5,3,4,9,2,6,7,8,0};
        quick(a,0,a.length-1);
        for (int temp:a
             ) {
            System.out.print(temp+" ");
        }
    }
    static void quick(int[] a,int left,int right){
        if(right<left){
            return;
        }
        int l=left;
        int r=right;
        int base=a[l];

        while(left!=right){
            while(a[right]>=base&&right>left)
                right--;
            while(a[left]<=base&&right>left)
                left++;
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        a[l]=a[left];
        a[left]=base;

        quick(a,l,left-1);
        quick(a,left+1,r);
    }
}
