import java.util.Scanner;
class Pattren02{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        Sc.close();
    }
}
