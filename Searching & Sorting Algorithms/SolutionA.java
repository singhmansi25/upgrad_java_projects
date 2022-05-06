import java.util.*;
public class SolutionA {
    public static int BinarySearch(int[] array,int left, int right, int index ) {

        if (right>=left)
        {
            if (array[left] == index)
                return left;
            if (array[left] < index)
                return BinarySearch(array, left+1, right, index+1);
        }
        return -1;
    }
    static int findIndex(int[] array,int index)
    {
        int low = 1, high = 1;
        int value = array[1];

        while (value <= index)
        {   low = high;
            if(2*high < array.length-1) //check that 2*h doesn't exceeds array
            { //length to prevent ArrayOutOfBoundException
                high = 2*high;
            }
            else
            { high = array.length-1;
                break;
            }
            value = array[high];
        }
        return BinarySearch(array, low, high, low);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        int[] ID_array = new int[n + 1];
        ID_array[0] = -1;
        System.out.println("Enter IDs of users in ascending order");
        for (int i = 1; i <= n; i++) {
            ID_array[i] = scn.nextInt();
        }
        int ans = findIndex(ID_array,1);

        if (ans==-1)
            System.out.println("NOT_FOUND");
        else
            System.out.println("Array element with same index found at "+ans);

    }
}