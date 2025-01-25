import java.util.Scanner;
public class BinarySearch 
{
    public static int Binary(int[] arr,int search,int size)
    {
        int low=0;
        int high=size-1;
        while (low<=high)
        {
            int mid=(low+(high-low))/2;

            if(arr[mid]==search)
                return mid;
            if(search>arr[mid])
                low=mid+1;
            else
                high=mid-1;
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

        int result=Binary(arr, search, arr.length);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "+ result);


        sc.close();
    }
}



        // for (int i=(size/2);i<(size-1);i++)
        // {
        //     if (arr==search)
        //     {
        //         return i;
        //     }
        // }
        // for (int i=(size/2);i>low;i--)
        // {
        //     if (arr==search)
        //     {
        //         return i;
        //     }
        // }
