import java.util.Scanner;

class Abc{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int rows  = scr.nextInt();
        for( int i=1; i<= rows; i++){
            for( int j= rows; j>= i; j--){
                System.out.print(" ");
            }
            for ( int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}