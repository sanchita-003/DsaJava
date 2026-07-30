public class main {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);

      //  pattern4(5);
      //notriangle(4);

    //   diamond(4);
    //   nodiamond(4);

   // noPyramid(4);
   AdvSqaure(4);
    }

    //for sqare pattern
    static void pattern1(int n){
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= n ; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    //for triangle pattern
    static void pattern2(int n){
        for(int row = 0 ; row <= n ; row++){
            for(int col = 0 ; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    //for inverted triangle pattern
    static void pattern3(int n){
        int i = 0;
        for(int row = 0 ; row <= n ; row++){
            for(int col = 0 ; col <= n-i ; col++){
                System.out.print("* ");
            }
            i++;
            System.out.println(" ");
        }
    }

    //pyramid pattern
    static void pattern4(int n){
        for(int row = 0 ; row < n ; row++){
            for(int col = 0 ; col < n ; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    //number traingle
    static void notriangle(int n){
        for (int row = 0 ; row < n ; row++){
            for(int col = 0 ; col <= row ; col++){
                System.out.print((col+1)+" ");
            }
            System.out.println(" ");
        }
    }

    //hald diamond
     static void halfdiamond(int n){
        for(int row = 0 ; row < 2*n ; row++){
            int totalColsInRow = row > n ? 2*n - row : row;
            for(int col = 0 ; col < totalColsInRow ; col++){    
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    //full diamond
   static void diamond(int n){
        for(int row = 0 ; row < n*2 ; row++){
            int totalColsInRow = row > n ? 2*n - row : row;
            int spaces = n - totalColsInRow;
            for(int s = 0 ; s < spaces ; s++){
                System.out.print(" ");
            }

            for(int col = 0 ; col < totalColsInRow ; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
   }

   //nodiamond
   static void nodiamond(int n){
    for(int row = 0 ; row <= n*2 ; row++){
        int totalColInRow = row > n ? n*2-row : row;
        int spaces = n - totalColInRow;
        for(int s = 0 ; s < spaces ; s++){
            System.out.print(" ");
        }
        for(int col = 0 ; col < totalColInRow ; col++){
            System.out.print(col+" ");
        }
        System.out.println(" ");
    }
   }

   //nopyramid
   static void noPyramid(int n){
        for(int row = 0 ; row <= n ; row++){
            for(int spaces = 0 ; spaces < n-row ; spaces++){
                System.out.print( " ");
            }
            for(int col = row ; col >= 1 ; col--){
                System.out.print(col+" ");
            }

            System.out.println(" ");
        }
   }

   //advanced sqaure
   static void AdvSqaure(int n){
    for(int row = 0 ; row <= n ; row++){
        for(int col = 0 ; col <= n ; col++){
            int index = Math.min(Math.min(col , row) , Math.min(n-row , n-col));
           // int rev = n-Math.min(Math.min(col , row) , Math.min(n-row , n-col));
            System.out.print(index+" ");
            //System.out.print(rev+" ");
        }
        System.out.println(" ");
    }
   }
}