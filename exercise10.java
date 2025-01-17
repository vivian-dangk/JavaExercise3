
package Exercise1901;
import java.util.Scanner;
public class exercise10 {
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
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        int n =nhap.nextInt();
        int[] a = new int[n];
        nhapmang(a,n);
        xuatmang(a,n);
        int demchan=0;
        int demle=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                demchan++;
            }else{
                demle++;
            }
        }
        System.out.println("Mang co "+demchan+" so chan va "+demle+" so le.");
    }
}
