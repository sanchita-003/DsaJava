public class Max {
    public static void main(String[] args){
        int[] arr = {24,37,83,12,90,213,46};
        int maxval=max(arr);
        int Rmax=rangeMax(arr,0,3);
         System.out.println(maxval);
         System.out.println(Rmax);
    }

    //to find max number within given range:
    static int rangeMax(int[] arr , int start , int end){
        int maxval=arr[start];
        if(start>end){
            return -1;
        }
        else{
            for(int i = start; i<=end ; i++){
                if(arr[i]>maxval){
                    maxval=arr[i];
                }
            }
            return maxval;
        }
    }

    //created function to find the max number from the whole array
    static int max(int[] arr){
        
       // int maxval=0; wrong because what if the elements of array are all negative then it will return 0 so starting from 1st element of array

         int maxval=arr[0];

        if(arr.length==0){
            return -1;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]>maxval){
                    maxval=arr[i];
                }
            }
        }
        return maxval;
    }
}
