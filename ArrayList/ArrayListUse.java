
//Include the ArrayList class in the program
import java.util.ArrayList;

class ArrayListUse {
    
    public static void main(String[] args) {

       //Creating an ArrayList object
       ArrayList<String> list = new ArrayList<>();

       //Adding elements to the list
       list.add("Java");
       list.add("Python");
       list.add("C++");
       
       //Printing the values in ArrayList
       print(list);
       
       //Removing elements from the list
       list.remove("Python");
       
       System.out.println("*******************");
     
       //Printing the values in ArrayList
       print(list);
       
      //accessing value with index
       String firstElement = list.get(0);
       
       System.out.println("First Element:"+firstElement);
       
       //number of elements
       int size = list.size();
       System.out.println("Size:"+size);

      //checking if a particular element is in the ArrayList

       if(list.contains("Java"))
       {
            System.out.println("There is the value sought....");
       }
       else
       {
           System.out.println("There is no value sought....");
       }
       
       //find the index value of the element
       System.out.println("Index Value:"+list.indexOf("C++"));
       
       //Adding the given element to the specified index
       list.add(0, "JavaScript");
       print(list);
       
       //Replace the element at the specified index with the specified element
       list.set(1, "C");
       print(list);
       
    }
    
    private static void print(ArrayList<String> l)
    {
       
       for(String i : l)
       {
           System.out.println(i);
       }
    }
      
    
}
