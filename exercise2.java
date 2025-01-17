
package Exercise1901;
import java.util.Scanner;
public class exercise2 {
    public static void nhapmang(int[] a, int n){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        for(int i=0;i<n;i++){
            a[i]=nhap.nextInt();
        }
    }
    public static void xuatmang(int[] a,int n){
        System.out.println("Mang la: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"   ");
        }
        System.out.println();
    }
    public static int max(int[] a, int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static int min(int[] a,int n){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        int n =nhap.nextInt();
        int[] a = new int[n];
        nhapmang(a,n);
        xuatmang(a,n);
        System.out.println("Gia tri lon nhat mang la: "+max(a,n));
        System.out.println("Gia tri nho nhat mang la: "+min(a,n));
    }
}

