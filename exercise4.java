
package Exercise1901;
import java.util.Scanner;
public class exercise4{
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
    public static int xoavt(int[] a,int n,int vt){
        for(int i=vt;i<n-1;i++){
            a[i]=a[i+1];
        }
        return n-1;
    }
    public static int xoatrung(int[] a,int n){
        for(int i=0; i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    n=xoavt(a,n,j);
                    j--;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        int n =nhap.nextInt();
        int[] a = new int[n];
        nhapmang(a,n);
        n=xoatrung(a,n);
        xuatmang(a,n);
    }
}
