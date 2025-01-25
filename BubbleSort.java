import java.util.Scanner;

public class BubbleSort 
{
    public static int Bubble(int[] arr,int size)
    {   
        int temp;
        for (int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if (arr[i]>=arr[j+1])
                {

                }
            }
        }
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

        int result=Bubble(arr,arr.length);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "+ result);


        sc.close();
    }
}
