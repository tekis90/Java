import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
       // Create HashMap
        HashMap<String, String> nameSurname = new HashMap<>();

        // Add value
        nameSurname.put("Marie", "XY");
        nameSurname.put("Bob", "Marr");
        nameSurname.put("Emre", "Mert");

       //Printing values
        System.out.println("Initial HashMap: " + nameSurname);

       // Value update
        nameSurname.put("Marie", "Coris");
        
        System.out.println("Marie's surname: " + nameSurname.get("Marie"));

       // Delete values
        nameSurname.remove("Bob");
        System.out.println("Has Bob's last name been deleted?" + !nameSurname.containsKey("Bob"));
        
        
        
      // Delete HashMap content
        nameSurname.clear();
        
        
       //Do not print content after deletion
        System.out.println("Next HashMap: " + nameSurname);

    }
}

