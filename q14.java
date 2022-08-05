package RecordPrograms;
class q14
{
    int[] bubble (int[] arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j-1]) {
                    swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                }
            }
        }
        return arr;
    }
    int[] selection (int[] arr) {
        int swap = 0, minimum = 0;
        for (int i = 0; i < arr.length; i++) {
            minimum = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) minimum = j;
            }
            swap = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = swap;
        }
        return arr;
    }
}
