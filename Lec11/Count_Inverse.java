package Lec11;
public class Count_Inverse {
        private static int inversionCount = 0;
        public static void main(String[] args) {
            int arr[] = {2, 4, 1, 3, 5};
            int sortedArr[] = Sort(arr, 0, arr.length - 1);
            System.out.println("Sorted array: ");
            for (int i = 0; i < sortedArr.length; i++) {
                System.out.print(sortedArr[i] + " ");
            }
            System.out.println();
            System.out.println("Inversion count: " + inversionCount);
        }

        public static int[] Sort(int arr[], int si, int ei) {
            if (si == ei) {
                int newArray[] = new int[1];
                newArray[0] = arr[si];
                return newArray;
            }
            int mid = (si + ei) / 2;
            int fa[] = Sort(arr, si, mid);
            int sa[] = Sort(arr, mid + 1, ei);
            return Merge(fa, sa);
        }

        public static int[] Merge(int arr1[], int arr2[]) {
            int m = arr1.length;
            int n = arr2.length;
            int arr[] = new int[m + n];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < m && j < n) {
                if (arr1[i] <= arr2[j]) {
                    arr[k] = arr1[i];
                    i++;
                } else {
                    arr[k] = arr2[j];
                    j++;
                    inversionCount += (m - i); // Count inversions
                }
                k++;
            }
            while (i < m) {
                arr[k++] = arr1[i++];
            }
            while (j < n) {
                arr[k++] = arr2[j++];
            }
            return arr;
        }
    }

