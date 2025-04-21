public class CWH_29_ps6 {
    public static void main(String[] args) {
//        Question 1
//        float[] arr={20.3f, 1.2f, 99};
//        float sum = 0;
//        for (int i=0; i<arr.length; i++){
//            sum+=arr[i];
//        }
//        System.out.println(sum);

//        Question 4
//        int [][] mat1 = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//        int [][] mat2 = {
//                {7, 8, 9},
//                {10, 11, 12}
//        };
//
//        int [][] result = {
//                {0, 0, 0},
//                {0, 0, 0}
//        };
//
//        for (int i = 0; i<mat1.length; i++){
//            for (int j=0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j]+mat2[i][j];
//            }
//        }
//        for (int i=0; i< result.length; i++){
//            for (int j =0; j<result[i].length; j++){
//                System.out.print(result[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

//        Question 5
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for (int i=0; i<n; i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int element:arr){
//            System.out.println(element);
//        }

//        Question 8
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        boolean isSorted=true;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted!");
        }else {
            System.out.println("The array is not sorted!");
        }
    }
}
