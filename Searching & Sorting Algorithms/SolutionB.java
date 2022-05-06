import java.util.*;
public class SolutionB {

    // Binary Search doesn't uses array.length method
    static int binarySearch(int[] array, int left, int right, int Key)
    {
        if (right>=left)
        {
            int mid = left + (right - left)/2;
            if (array[mid] == Key)
                return mid;
            else if (array[mid] > Key)
                return binarySearch(array, left, mid-1, Key);
            else
                return binarySearch(array, mid+1, right, Key);
        }
        return -1;
    }

    static int findIndex(int[] array,int key)
    {
        int l = 0, h = 1;
        int value = array[1];

        while (value < key)
        {   l = h;
            if(2*h < array.length-1) //check that 2*h doesn't exceeds array
                h = 2*h;             //length to prevent ArrayOutOfBoundException
            else
            {h = array.length-1;
            break;}
            value = array[h];
        }
        return binarySearch(array, l, h, key);
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        System.out.println("Enter Key to search");
        int key = scn.nextInt();

        int[] ID_array = new int[n + 1];
        ID_array[0] = -1;
        System.out.println("Enter IDs of users in ascending order");
        for (int i = 1; i <= n; i++) {
            ID_array[i] = scn.nextInt();
        }
        int ans = findIndex(ID_array,key);

        if (ans==-1)
            System.out.println("NOT_FOUND");
        else
            System.out.println("Key found at index "+ans);
    }
}
