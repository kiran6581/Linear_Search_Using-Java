package packs;
import java.util.Scanner;
public class LinearSearch {

//    function find the element in array or not!
    static int Search(int [] arr,int x)
    {
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int [5];

//        taking array element from user
      System.out.println("enter the elements of an array:");
        for(int i=0; i< arr.length; i++)
        {
           arr[i] = in.nextInt();
        }

        int x;

//        taking input to find the element in present in array or not
        System.out.println("Enter the Element");
        x = in.nextInt();

        int result = Search(arr,x);
        if(result==-1)
        {
            System.out.println("Element is not found!!");
        }
        else {
            System.out.println("Element is found at Index:" + result);
        }
        }




    }


