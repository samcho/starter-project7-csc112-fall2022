import java.util.ArrayList;

public class Project7 {

    // Method declarations
    public static void quickSort(ArrayList<Object> a, int left, int right){
        // Fix Me
    }

    public static int partition (ArrayList<Object> a, int left, int right){
        // Fix Me
    }

    public static int bubbleSort(ArrayList<Object> a, int size){
        // Fix Me
    }

    public static int transpositionSort(ArrayList<Object> a, int size){
        // Fix Me
    }

    public static void main(String [] args){
        //...
        // Fix Me
        //...
        ArrayList<Object> origList=new ArrayList<Object>();   // original list
        ArrayList<Object> quickList=new ArrayList<Object>();   // list to be sorted via quick sort
        ArrayList<Object> bubbleList=new ArrayList<Object>();   // list to be sorted via bubble sort
        ArrayList<Object> transpositionList=new ArrayList<Object>();   // list to be sorted via transposition sort
        // Fill list
        //...
        // Fix Me
        //...
        // Create a copy from list for bubble sort
        for(int i=0;i<origList.size();i++)
            quickList.add(origList.get(i));


        // sort list using quick sort
        quickSort(quickList, 0, quickList.size());

        // sort list using quick sort
        int bubbleSort(bubbleList, bubbleList.size());
        // sort list using bubble sort
        int transpositionSort(transpositionList, transpositionList.size());
    }
}
