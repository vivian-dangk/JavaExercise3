
package Exercise1901;
import java.util.Scanner;
public class exercise5 {
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
    public static void sapxeptang(int[] a,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(a[i]>a[j]){
                    int tam=a[i];
                    a[i]=a[j];
                    a[j]=tam;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        int n =nhap.nextInt();
        int[] a = new int[n];
        nhapmang(a,n);
        sapxeptang(a,n);
        xuatmang(a,n);
    }
}
