import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,String> mapBully1 = new HashMap<>();
        mapBully1.put("a", "candy");
        mapBully1.put("b", "dirt");
        System.out.println("{\"a\": \"candy\", \"b\": \"dirt\"}) → {\"a\": \"\", \"b\": \"candy\"}"); //-->{"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        System.out.println("Result: " + mapBully(mapBully1));
        System.out.println("************");
        Map<String,String> mapBully2 = new HashMap<>();
        mapBully2.put("a", "candy");
        System.out.println("{\"a\": \"candy\"}) → {\"a\": \"\", \"b\": \"candy\"}");
        System.out.println("Result: " + mapBully(mapBully2));  //--> {"a": "candy"}) → {"a": "", "b": "candy"}
        System.out.println("************");
        Map<String,String> mapBully3 = new HashMap<>();
        mapBully3.put("a", "candy");
        mapBully3.put("b", "carrot");
        mapBully3.put("c", "meh");
        System.out.println("{\"a\": \"candy\", \"b\": \"carrot\", \"c\": \"meh\"}) → {\"a\": \"\", \"b\": \"candy\", \"c\": \"meh\"}");
        System.out.println("Result: " + mapBully3); //--> {"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
        System.out.println("______________");

        Map<String,String> toppingMap1 = new HashMap<>();
        toppingMap1.put("ice cream", "peanuts");
        System.out.println("{\"ice cream\": \"peanuts\"}) → {\"bread\": \"butter\", \"ice cream\": \"cherry\"}");
        System.out.println("Result: " + topping1(toppingMap1));  //-->{"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
        System.out.println("************");
        Map<String,String> toppingMap2 = new HashMap<>();
        System.out.println("{} → {\"bread\": \"butter\"}");
        System.out.println("Result: " + topping1(toppingMap2));//--> ({}) → {"bread": "butter"}
        System.out.println("************");
        Map<String,String> toppingMap3 = new HashMap<>();
        toppingMap3.put("pancake", "syrup");
        System.out.println("{\"pancake\": \"syrup\"}) → {\"bread\": \"butter\", \"pancake\": \"syrup\"}");
        System.out.println("Result: " + topping1(toppingMap3)); //--> {"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
        System.out.println("______________");


    }
    /*
        Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
        Basically "b" is a bully, taking the value and replacing it with the empty string.
     */
    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    /*
    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry".
    In all cases, set the key "bread" to have the value "butter".
     */
    public static Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

}


