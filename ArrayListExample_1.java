import java.util.ArrayList;
public class ArrayListExample_1 {
    public static void  main(String args[])
    {
        ArrayList<Integer> number=new ArrayList<>();
        
        // Adding elements in the list .
        
        number.add(12); // index:0
        number.add(34); // index:1
        number.add(21); // index:2
        number.add(88); // index:3
        
       
        number.add(4,90); // adding element with index.
        number.add(5,45);
        
        System.out.print("Elements present in the array  :-" );
        for(Integer y : number){
            System.out.print(y+" ");
        }
        System.out.println("");
         
        // Removing the element at the index 2 .
         number.remove(2);
         System.out.print("After removing the array contains :-" );
        for(Integer y : number){
            System.out.print(y+" ");
        }
        System.out.println(""); 
        
        // Remove all elements in the array using removeAll().
        number.removeAll(number);
        System.out.print("After removing all elements the array contains :-" );
        for(Integer y : number){
            System.out.print(y+" ");
        }
        System.out.println("");
        
        // Remove all elements in the array using clear().
        number.clear();
        System.out.print("After removing all elements using clear() the array contains :-" );
        for(Integer y : number){
            System.out.print(y+" ");
        }
        System.out.println("");
    }
}
