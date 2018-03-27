public class BubbleSort {
    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    private void swapping(int[] arr, int i, int j){
        if(i == j){
            return;
        }else{
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void sort(){
        for(int lastUnsortedIndex = arr.length-1;lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i=0;i < lastUnsortedIndex;i++){
                if(arr[i] > arr[i+1]){
                    swapping(arr, i, i+1);
                }
            }
        }
    }

}
