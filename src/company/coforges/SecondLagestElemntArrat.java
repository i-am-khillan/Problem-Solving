package company.coforges;

public class SecondLagestElemntArrat {
    public static void main(String[] args) {
        int [] arr={1};

        int secondLarge=secondLargestArrayElement(arr);
        System.out.println(secondLarge);
    }

    private static int secondLargestArrayElement(int[] arr) {
        int secondL=Integer.MIN_VALUE;
        int larger=Integer.MIN_VALUE;
        if(arr.length>1) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > larger) {
                    secondL = larger;
                    larger = arr[i];
                } else if (secondL < arr[i] && arr[i] != larger) {
                    secondL = arr[i];
                }
            }
        }
        else {
            System.out.println("largest and second largest is same please enter value value");

        }
    return  secondL;
    }
}
