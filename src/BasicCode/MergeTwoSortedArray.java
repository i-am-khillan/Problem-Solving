package BasicCode;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int a1[]={1,2,5,7,9};int a2[]={3,4,5,6,9};
        //Both array should be sorted array.
        int n1= a1.length;;
        int n2=a2.length;
        int a3[]=new int[n1+n2];
       // public static int[] mergeSortedArray(int a1[],int a2[],int n1,int n2,int a3[]){
            int i=0,j=0,k=0;
            while(i<n1 && j <n2){
                if(a1[i]<a2[j]){
                    a3[k++]=a1[i++];
                }
                else {
                    a3[k++]=a2[j++];
                }
            }
            while(i<n1) a3[k++]=a1[i++];
            while(j<n2) a3[k++]=a2[j++];

            //print the element:-
            for(int a:a3){
                System.out.println(a);
            }

        }

    }
  /*  public static int[] mergeSortedArray(int a1[],int a2[],int n1,int n2,int a3[]){
        int i=0,j=0,k=0;
        while(i<n1 && j <n2){
            if(a1[i]<a2[j]){
                a3[k++]=a1[i++];
            }
            else {
                a3[k++]=a1[j++];
            }
        }
        while(i<n1) a3[k++]=a1[i++];
        while(j<n2) a3[k++]=a2[j++];
    return a3;*/

