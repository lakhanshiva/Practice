import java.util.*;
import java.io.*;
//import java.util.Arrays;

class RemoveDuplicates
{	
	public static void removeDuplicates(int[] array){
        //assuming all the elements in an array as unique
        int noOfUniques;
        noOfUniques = array.length;
        
        System.out.println("Printing array with duplicates");
        for (int i =0; i<noOfUniques; i++){
        		System.out.print(array[i]+"\t");
        }
        System.out.println("\n");
        
       	//comparing each element with other element
       	for (int i =0; i< noOfUniques-1; i++){
       		for (int j=i+1; j< noOfUniques; j++){
       			if (array[i]==array[j]){
       				array[j]=array[noOfUniques-1];
       				//decrement number of uniques
       				noOfUniques--;
       				j--;
       			}
       		}
        }
        
        System.out.println("Printing array without duplicates");
        for (int i =0; i<noOfUniques; i++){
        		System.out.print(array[i]+"\t");
        }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {1,2,3,4,5,6,6,2,10,6,10,3};
		removeDuplicates(arr);
	}
}