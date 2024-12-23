// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
    *
  * * *
* * * * *
Day 1 of Learning Pattern in Java

*/
class Main {
    public static void patternThree(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(' ');
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void patternFour(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(' ');
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print('*');
            }
            
            for(int j=0;j<i;j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void patternTwo(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(' ');
            }
            for(int j=0;j<2*n-(2*i-1);j++){
                System.out.print('*');
            }
            for(int j=0;j<i;j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void patternOne(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(' ');
            }
            
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            
            for(int j=0;j<n-i-1;j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // patternOne(3);
        // patternTwo(5);
        patternThree(5);
        patternFour(5);
        System.out.println("Try programiz.pro");
    }
}