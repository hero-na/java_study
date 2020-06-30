package Grammer.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap{
    public static void main(final String[] args) {
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("이상해씨");
        arrayList.add("이상해풀");
        arrayList.add("이상해꽃");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        final HashMap<String, String> pokedex = new HashMap<>();
        pokedex.put("피카츄","피카츄");
        pokedex.put("이상해씨","이상해씨");
        pokedex.put("이상해풀","이상해풀");
        pokedex.put("이상해꽃","이상해꽃");

        pokedex.remove("이상해꽃");
        System.out.println(pokedex.get("피카츄"));
    }
}