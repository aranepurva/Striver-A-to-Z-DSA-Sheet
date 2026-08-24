import java.util.Scanner;
class Pattern01{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        Sc.close();
    }
}
