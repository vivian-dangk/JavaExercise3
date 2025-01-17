
package Exercise1901;
import java.util.Scanner;
public class exercise8 {
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
    public static void demtrung(int[] a,int n){
        
        boolean[] trung=new boolean[n];
        
        for(int i=0; i<n;i++){
            int dem=1;
            if(trung[i]) continue;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    dem++;
                    trung[j] = true;  
                }
            }
            System.out.println(a[i]+" xuat hien: "+dem+" lan.");
        }
    }
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Hay nhap phan tu cua mang: ");
        int n =nhap.nextInt();
        int[] a = new int[n];
        nhapmang(a,n);
        xuatmang(a,n);
        demtrung(a,n);
    }
}
