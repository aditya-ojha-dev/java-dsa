public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 3;

        int idx = linearS(arr, key);
        if(idx == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: " + idx);
        }
    }
    
    public static int linearS(int[] arr,int key){
        if(arr == null || arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
