public class Butterfly {
    public static void main(String [] args){
        int n=4;
        for(int i=1;i<=n;i++){
            
            //1st part of butterfly
            //upper-half

            for(int j=1;j<=i;j++){
                System.out.print("*");  
            }

            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //2nd part of butterfly
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //
        for(int i=n;i>=1;i--){
            //3rd part of butterfly
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //2nd part of butterfly
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
