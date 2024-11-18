/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertsort;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class InsertSortAscending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i, key, j;
        int[] arr = {5, 10, 2 , 9, 3};
        for(i = 1; i < 5; i++){
            key = arr[i];
            j = i - 1;
            
        while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        System.out.println("Sorted Array: ");
        System.out.println(arr);
    }
}
    
   
    
