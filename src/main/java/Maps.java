import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,String> mapBully1 = new HashMap<>();
        mapBully1.put("a", "candy");
        mapBully1.put("b", "dirt");
        System.out.println("Test mapBully1");
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

        Map<String,String> topping1Map1 = new HashMap<>();
        topping1Map1.put("ice cream", "peanuts");
        System.out.println("Test topping1");
        System.out.println("{\"ice cream\": \"peanuts\"}) → {\"bread\": \"butter\", \"ice cream\": \"cherry\"}");
        System.out.println("Result: " + topping1(topping1Map1));  //-->{"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
        System.out.println("************");
        Map<String,String> topping1Map2 = new HashMap<>();
        System.out.println("{} → {\"bread\": \"butter\"}");
        System.out.println("Result: " + topping1(topping1Map2));//--> ({}) → {"bread": "butter"}
        System.out.println("************");
        Map<String,String> topping1Map3 = new HashMap<>();
        topping1Map3.put("pancake", "syrup");
        System.out.println("{\"pancake\": \"syrup\"}) → {\"bread\": \"butter\", \"pancake\": \"syrup\"}");
        System.out.println("Result: " + topping1(topping1Map3)); //--> {"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
        System.out.println("______________");

        Map<String,String> mapABMap1 = new HashMap<>();
        mapABMap1.put("a", "aaa");
        mapABMap1.put("b", "aaa");
        mapABMap1.put("c", "cake");
        System.out.println("Test mapAB2");
        System.out.println("{\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"}) → {\"c\": \"cake\"}");
        System.out.println("Result: " + mapAB2(mapABMap1)); //-->{"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
        System.out.println("************");
        Map<String,String> ABMap2 = new HashMap<>();
        ABMap2.put("a", "aaa");
        ABMap2.put("b", "bbb");
        System.out.println("{\"a\": \"aaa\", \"b\": \"bbb\"}) → {\"a\": \"aaa\", \"b\": \"bbb\"}");
        System.out.println("Result: " + mapAB2(ABMap2)); //--> {"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
        System.out.println("************");
        Map<String,String> ABMap3 = new HashMap<>();
        ABMap3.put("a", "aaa");
        ABMap3.put("b", "bbb");
        ABMap3.put("c", "aaa");
        System.out.println("{\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"}) → {\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"}");
        System.out.println("Result: " + mapAB2(ABMap3)); //-->{"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
        System.out.println("______________");

        Map<String,String> shareMap1 = new HashMap<>();
        shareMap1.put("a", "aaa");
        shareMap1.put("b", "bbb");
        shareMap1.put("c", "ccc");
        System.out.println("Test mapShare");
        System.out.println("{\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"ccc\"}) → {\"a\": \"aaa\", \"b\": \"aaa\"}");
        System.out.println("Result: " + mapShare(shareMap1)); //-->{"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
        System.out.println("************");
        Map<String,String> shareMap2 = new HashMap<>();
        shareMap2.put("b", "xyz");
        shareMap2.put("c", "ccc");
        System.out.println("{\"b\": \"xyz\", \"c\": \"ccc\"}) → {\"b\": \"xyz\"}");
        System.out.println("Result: " + mapShare(shareMap2)); //-->{"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
        System.out.println("************");
        Map<String,String> shareMap3 = new HashMap<>();
        shareMap3.put("a", "aaa");
        shareMap3.put("c", "meh");
        shareMap3.put("d", "hi");
        System.out.println("{\"a\": \"aaa\", \"c\": \"meh\", \"d\": \"hi\"}) → {\"a\": \"aaa\", \"b\": \"aaa\", \"d\": \"hi\"}");
        System.out.println("Result: " + mapShare(shareMap3)); //-->{"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
        System.out.println("______________");

        Map<String,String> topping2Map1 = new HashMap<>();
        topping2Map1.put("ice cream", "cherry");
        System.out.println("Test topping2");
        System.out.println("{\"ice cream\": \"cherry\"}) → {\"yogurt\": \"cherry\", \"ice cream\": \"cherry\"}");
        System.out.println("Result: " + topping2(topping2Map1));  //-->{"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
        System.out.println("************");
        Map<String,String> topping2Map2 = new HashMap<>();
        topping2Map2.put("spinach", "dirt");
        topping2Map2.put("ice cream", "cherry");
        System.out.println("{\"spinach\": \"dirt\", \"ice cream\": \"cherry\"}) → {\"yogurt\": \"cherry\", \"spinach\": \"nuts\", \"ice cream\": \"cherry\"}");
        System.out.println("Result: " + topping2(topping2Map2)); //-->{"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
        System.out.println("************");
        Map<String,String> topping2Map3 = new HashMap<>();
        topping2Map3.put("yogurt", "salt");
        System.out.println("{\"yogurt\": \"salt\"}) → {\"yogurt\": \"salt\"}");
        System.out.println("Result: " + topping2(topping2Map3)); //-->{"yogurt": "salt"}) → {"yogurt": "salt"}
        System.out.println("______________");

        Map<String,String>  mapAB3Map1= new HashMap<>();
        mapAB3Map1.put("a", "aaa");
        mapAB3Map1.put("c", "cake");
        System.out.println("Test mapAB3");
        System.out.println("{\"a\": \"aaa\", \"c\": \"cake\"}) → {\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"}");
        System.out.println("Result: " + mapAB3(mapAB3Map1)); //--> {"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
        System.out.println("************");
        Map<String,String>  mapAB3Map2= new HashMap<>();
        mapAB3Map2.put("b", "bbb");
        mapAB3Map2.put("c", "cake");
        System.out.println("{\"b\": \"bbb\", \"c\": \"cake\"}) → {\"a\": \"bbb\", \"b\": \"bbb\", \"c\": \"cake\"}");
        System.out.println("Result: " + mapAB3(mapAB3Map2)); //--> {"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
        System.out.println("************");
        Map<String,String>  mapAB3Map3= new HashMap<>();
        mapAB3Map3.put("a", "aaa");
        mapAB3Map3.put("b", "bbb");
        mapAB3Map3.put("c", "cake");
        System.out.println("{\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}) → {\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}");
        System.out.println("Result: " + mapAB3(mapAB3Map3)); //-->{"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
        System.out.println("______________");

        Map<String,String>  mapAB1= new HashMap<>();
        mapAB1.put("a", "Hi");
        mapAB1.put("b", "There");
        System.out.println("Test mapAB");
        System.out.println("{\"a\": \"Hi\", \"b\": \"There\"}) → {\"a\": \"Hi\", \"ab\": \"HiThere\", \"b\": \"There\"}");
        System.out.println("Result: " + mapAB(mapAB1)); //-->{"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
        System.out.println("************");
        Map<String,String>  mapAB2= new HashMap<>();
        mapAB2.put("a", "Hi");
        System.out.println("{\"a\": \"Hi\"}) → {\"a\": \"Hi\"}");
        System.out.println("Result: " + mapAB(mapAB2)); //-->{"a": "Hi"}) → {"a": "Hi"}
        System.out.println("************");
        Map<String,String>  mapAB3= new HashMap<>();
        mapAB3.put("b", "There");
        System.out.println("{\"b\": \"There\"}) → {\"b\": \"There\"}");
        System.out.println("Result: " + mapAB(mapAB3)); //-->{"b": "There"}) → {"b": "There"}
        System.out.println("______________");

        Map<String,String>  topping3Map1= new HashMap<>();
        topping3Map1.put("potato", "ketchup");
        System.out.println("Test topping3");
        System.out.println("{\"potato\": \"ketchup\"}) → {\"potato\": \"ketchup\", \"fries\": \"ketchup\"}");
        System.out.println("Result: " + topping3(topping3Map1)); //-->"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
        System.out.println("************");
        Map<String,String>  topping3Map2= new HashMap<>();
        topping3Map2.put("potato", "butter");
        System.out.println("{\"potato\": \"butter\"}) → {\"potato\": \"butter\", \"fries\": \"butter\"}");
        System.out.println("Result: " + topping3(topping3Map2)); //-->{"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
        System.out.println("************");
        Map<String,String>  topping3Map3= new HashMap<>();
        topping3Map3.put("salad", "oil");
        topping3Map3.put("potato", "ketchup");
        System.out.println("{\"salad\": \"oil\", \"potato\": \"ketchup\"}) → {\"spinach\": \"oil\", \"salad\": \"oil\", \"potato\": \"ketchup\", \"fries\": \"ketchup\"}");
        System.out.println("Result: " + topping3(topping3Map3)); //-->{"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
        System.out.println("______________");

        Map<String,String>  mapAB4Map1= new HashMap<>();
        mapAB4Map1.put("a", "aaa");
        mapAB4Map1.put("b", "bb");
        mapAB4Map1.put("c", "cake");
        System.out.println("Test mapAB4");
        System.out.println("{\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"cake\"}) → {\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"aaa\"}");
        System.out.println("Result: " + mapAB4(mapAB4Map1)); //-->{"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
        System.out.println("************");
        Map<String,String>  mapAB4Map2= new HashMap<>();
        mapAB4Map2.put("a", "aa");
        mapAB4Map2.put("b", "bbb");
        mapAB4Map2.put("c", "cake");
        System.out.println("{\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"cake\"}) → {\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"bbb\"}");
        System.out.println("Result: " + mapAB4(mapAB4Map2)); //-->{"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
        System.out.println("************");
        Map<String,String>  mapAB4Map3= new HashMap<>();
        mapAB4Map3.put("a", "aa");
        mapAB4Map3.put("b", "bbb");
        System.out.println("{\"a\": \"aa\", \"b\": \"bbb\"}) → {\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"bbb\"}");
        System.out.println("Result: " + mapAB4(mapAB4Map3)); //-->{"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
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

    /*
        Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
     */
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if(map.get("a") != null && map.get("b") != null && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    /*
        Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
        In all cases remove the key "c", leaving the rest of the map unchanged.
     */
    public static Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    /*
        Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value,
        set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
     */
    public static Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream", map.get("ice cream"));
            map.put("yogurt", map.get("ice cream"));
        } if(map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    /*
        Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both),
        set the other to have that same value in the map.
     */
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if(!map.containsKey("a") && map.containsKey("b")){
            map.put("a", map.get("b"));
        }
        return map;
    }
/*
        Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
        If both keys are present, append their 2 string values together and store the result under the key "ab".
 */
public static Map<String, String> mapAB(Map<String, String> map) {
    if(map.containsKey("a") && map.containsKey("b")) {
        map.put("ab", map.get("a") + map.get("b"));
    }
    return map;
}

/*
        Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries".
        If the key "salad" has a value, set that as the value for the key "spinach".
 */
public static Map<String, String> topping3(Map<String, String> map) {
    if(map.containsKey("potato")) {
        map.put("fries", map.get("potato"));
    }
    if(map.containsKey("salad")) {
        map.put("spinach", map.get("salad"));
    }
    return map;
}

/*
        Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value.
        If the values exist and have the same length, change them both to the empty string in the map.
 */
public static Map<String, String> mapAB4(Map<String, String> map) {
    if(map.get("a") != null && map.get("b") != null) {
        if( map.get("a").length() != map.get("b").length()) {
            if(map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            } else
                map.put("c", map.get("b"));
        }
        if(map.get("a").length() == map.get("b").length()) {
            map.put("a", "");
            map.put("b", "");
        }
    }
    return map;
}

}


