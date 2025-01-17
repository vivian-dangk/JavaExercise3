
package Exercise1901;
import java.util.Scanner;
public class exercise3 {
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
    public static boolean doixung(int[] a, int n){
        for(int i=0;i<n/2;i++){
            if(a[i]!=a[n-1-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        int n =nhap.nextInt();
        int[] a = new int[n];
        nhapmang(a,n);
        xuatmang(a,n);
        if(doixung(a,n)){
            System.out.println("Mang doi xung.");
        }else{
            System.out.println("Mang khong doi xung.");
        }
    }   
}
