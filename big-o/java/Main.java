public class Main
{
    public static void main(String args[])
    {

        int[] test = {1,2,3,4,5};
        calcSumAndProduct(test);

    }

    /**
     * Function which calculates the sum and product of elements of array
     */

     public static void calcSumAndProduct(int arr[])
     {
         int sum = 0;
         int prod = 1;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            prod *= arr[i];
        }

        System.out.println("SUM: " + sum);
        System.out.println("PROD: " + prod);
     }
}