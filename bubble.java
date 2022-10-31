public class bubble{
    public static void arrPrint(int[] arr){
        int n=arr.length;
        for (int j = 0; j < n-1; j++) {
            System.out.print(arr[j]+", ");
        }
        System.out.println(arr[n-1]);
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,4,3,2,1,0};
        System.out.println("Before Sort:");
        arrPrint(arr);
        
        //bubble Sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    //swap
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        System.out.println("After Sort(Acend):");
        arrPrint(arr);
    }
}
