
/* Maximum subarray in a given array 
/* solution to "Introduction to Algorithm" - Coreman
/* Author - Sijar Ahmed
/*

public class MaximumSubArray {

private static int maxSumRec(int[] a, int low, int high) {
    int leftSum = 0, rightSum = 0;
    int sum = 0; 

    if (low == high) { // Base case
        return a[low]; 
    }

    int mid = (low + high) >> 1; // (low + high) / 2
    int maxLeftSum = maxSumRec(a, low, mid);
    int maxRightSum = maxSumRec(a, mid + 1, high);

    //max-crossing-subarray
    for (int i = mid; i >= low; i--) {
        sum += a[i];
        if (sum > leftSum) {
            leftSum = sum;
        }
    }
    sum = 0;
    for (int i = mid + 1; i <= high; i++) {
        sum += a[i];
        if (sum > rightSum) {
            rightSum = sum;
        }
    }
    return max3(maxLeftSum, maxRightSum, (leftSum + rightSum));
}

private static int max3(int a, int b, int c) {
    return a > b ? (a > c ? a : c) : (b > c ? b : c);
}

public static void main(String[] args) {
    //INPUT
    int a[] = {
        -5, 71, 23, 41, 34, 1, 3, 6, 2, 91, 312, 42, 31, 67, 12, 10, 18, 56, 90, 21, 45, 47, 89, 1999999990,
        78, -7, 76, 75, 74, 73, 72, 80, 24, 25, 61, 69, 84, 0, -1, 145, 1902, 200, 199, 198, 197, 196, 195, 194,
        78, 77, 76, 75, 74, 73, 72, 80, 24, 25, 61, 69, 84, 0, -1, 145, 1902, 200, 199, 198, 197, 196, 195, 194,
        5, 71, 23, 41, 34, 1, 3, 6, 2, 91, 312, 42, 31, 67, 12, 10, 18, 56, 90, 21, 45, 47, 89, 1999999990
    };

    int maxSum = maxSumRec(a, 0, a.length - 1);
    System.out.println("Max sum is " + maxSum);
}
}
