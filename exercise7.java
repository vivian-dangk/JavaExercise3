
package Exercise1901;
import java.util.Scanner;
public class exercise7 {
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
    public static int maxlonthuhai(int[] a, int n){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }else if(a[i]!=max1&&a[i]>max2){
                max2=a[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        int n =nhap.nextInt();
        int[] a = new int[n];
        nhapmang(a,n);
        xuatmang(a,n);
        System.out.println("Phan tu lon thu hai cua mang la: "+maxlonthuhai(a,n));
    }
}
