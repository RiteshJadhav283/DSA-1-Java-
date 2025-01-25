import java.util.Scanner;

public class LinearSearch 
{
    public static int Linear(int arr[], int search,int Size) 
    {
        for (int i=0;i<=Size;i++)
        {
            if (arr[i]==search)
                {
                    return i;
                } 
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entter the size of the array:");
        int b=sc.nextInt();
        int[] arr=new int[b];
        System.out.print("Enter the number you want to find in the aray:");
        int search=sc.nextInt();

        System.out.print("Enter the array:");
        for (int i=0;i<b;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.print("The Array is:");

        for (int i=0;i<b;i++)
        {
            System.out.print(arr[i] + " ");
        }

        int result=Linear(arr, search, arr.length);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "+ result);


        sc.close();
    }
}



//int[] arr=new int[b];