
package Exercise1901;
import java.util.Scanner;
public class exercise9 {
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
    public static int minlonthuhai(int[] a, int n){
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<min1){
                min2=min1;
                min1=a[i];
            }else if(a[i]!=min1&&a[i]<min2){
                min2=a[i];
            }
        }
        return min2;
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        int n =nhap.nextInt();
        int[] a = new int[n];
        nhapmang(a,n);
        xuatmang(a,n);
        System.out.println("Phan tu nho thu hai cua mang la: "+minlonthuhai(a,n));
    }
}
