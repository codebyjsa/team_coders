// implement the Matrix class 
// check if the matrix is symmetric
// compute trace 
// compute transpose
import java.util.Scanner;

public class Matrix{
    double arr[][];
    Matrix(double arr[][]){
        this.arr = arr;
    }
   
    double trace(){
        double trace = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i == j){
                    trace += arr[i][j];
                }
            }
        }
        return trace;
    }
    
    void transpose(){
        // swap i,j with j,i
        // NOTE: we are actually transposing the matrix and NOT fetching its transpose
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                double temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    double[][] getTranspose(){
        // swap i,j with j,i
        // NOTE: we are returning a transposed copy
        double [][] a = arr;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                double temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a;
    }

    boolean isSymmetric(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] != arr[j][i])
                    return false;
            }
        }
        return true;
    }

    void display(){
        for(double x[]: arr){
            for(double y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns in the matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        double a[][] = new double[rows][cols];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                arr[i][j] = sc.nextDouble();
            }
        }
        this.arr = a;
    }
    public static void main(String args[]){
        // input or define a 2d array
        double arr[][] = {
            {1,2,4},
            {2,3,0},
            {4,2,9},
        };
        Matrix x = new Matrix(arr);

        System.out.println(x.trace());
        

        System.out.println("Original Matrix: ");
        x.display();

        System.out.println("Transposed Matrix: ");
        x.transpose();
        x.display();

        System.out.println("Trace of transposed Matrix: " + x.trace());

        System.out.println("Is the Matrix Symmetric: " + (x.isSymmetric()?"yes":"no"));

        for(int i=0; i<5; i++) System.out.println(); // spacing for readablity in cui
        System.out.println("Enter your own matrix: ");
        x.input();

        x.display();
        x.transpose();
        x.isSymmetric();
        x.display();

    }
}