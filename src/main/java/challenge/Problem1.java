package challenge;



public class Problem1 {

    /*

    Weekly Coding Challenge:

Problem 1: Find the Contiguous Subarray with Sum to a Given Value in an array.

Given an array of positive integer and given value X, find Contiguous sub array whose sum is equal to X.
For example:

1
2
3
4
5
6
arr[]={14, 12, 70, 15, 99, 65, 21, 90};
X =97.
Sum found between index 1 to 3
Elements are 12, 17 and 15 //I changed 17 to 70 because 12+17+15 != 97

     */

    public static void main(String[] args){
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        int solution[] = solve(97, arr);
        System.out.println("Size of solution: "+ solution.length);



    }
    public static int[] solve(int goal, int arr[]){
        for (int i = 0; i<arr.length; i++){
            int tempSum = 0;
            int startIndex = i;
            int endIndex = i;
            for (int j = i; j< arr.length; j++){
                tempSum +=arr[j];
                if (tempSum == goal){
                    endIndex = j;
                    int solSize = (j-i+1); //solution Size
                    int newArray[]= new int[solSize];
                    for (int k = 0; k<solSize;k++){
                        newArray[k] = arr[i+k];
                        System.out.println(newArray[k]);
                    }
                    return newArray; //seems to work
                }
                else if (tempSum >goal){
                break; //test this, might need continue here
                }
            }

//
        }// this doesnt do anything of value yet

        //what should this return if no answer found?
        return arr;
    }



}
