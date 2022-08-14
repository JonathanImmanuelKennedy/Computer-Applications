package RecordPrograms;
class q14
{
    int[] bubble (int[] arr, int i, int j) {
        int swap = 0;
        
        if (i < arr.length) {
            if (j > i) {
                if (arr[j] < arr[j-1]) {
                    swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                }
                bubble(arr, i, --j);
            }
            bubble(arr, ++i, (arr.length - 1));
        }
        return arr;
    }
    int[] selection (int[] arr, int minimum, int i, int j) {
        int swap = 0;
        if(i < arr.length) {
            minimum = i;
            if (j < arr.length) {
                if (arr[j] < arr[minimum]) 
                minimum = j;
                selection(arr, minimum, i, ++j);
            }
            swap = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = swap;
            selection(arr, minimum, ++i, j);
        }
        return arr;
    }
}
