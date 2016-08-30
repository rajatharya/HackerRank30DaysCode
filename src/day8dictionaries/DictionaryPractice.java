package day8dictionaries;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		// English to Spanish dictionary

/*		Map<String,String> englishSpanishDictionary = new HashMap<String,String>();
		// Putting things inside our dictionary
		englishSpanishDictionary.put("Monday", "Lunes");
		englishSpanishDictionary.put("Tuesday", "Martes");
		englishSpanishDictionary.put("Wednesday", "Miercoles");
		englishSpanishDictionary.put("Thursday", "Jueves");
		englishSpanishDictionary.put("Friday", "Viernes");
		// Retrieve things from our dictionary
		System.out.println(englishSpanishDictionary.get("Monday"));
		System.out.println(englishSpanishDictionary.get("Tuesday"));
		System.out.println(englishSpanishDictionary.get("Wednesday"));
		System.out.println(englishSpanishDictionary.get("Thursday"));
		System.out.println(englishSpanishDictionary.get("Friday"));
		// Print all keys
		System.out.println(englishSpanishDictionary.keySet());
		// Print all Values
		System.out.println(englishSpanishDictionary.values());
		// Print the size of the dictionary
		System.out.println("The size of our dictionary is "+englishSpanishDictionary.size());
		// Print key-value pairs
		System.out.println(englishSpanishDictionary.toString());*/
		
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		// Put some items in Shopping List
		shoppingList.put("Rice", Boolean.TRUE);
		shoppingList.put("Dal", Boolean.TRUE);
		shoppingList.put("Rava", false);
		shoppingList.put("Ragi", true);
		shoppingList.put("Wheat", Boolean.TRUE);
		shoppingList.put("Tea Powder", Boolean.FALSE);
		// Print key value pairs
		System.out.println(shoppingList.toString());
		// Replace some values
		shoppingList.replace("Dal", Boolean.FALSE);
		shoppingList.replace("Rava", Boolean.TRUE);
		// Print key value pairs
		System.out.println(shoppingList.toString());
		// Print only the items which are true
		/*for (Map.Entry<String, Boolean> entry : shoppingList.entrySet()) {
			if (entry.getValue().equals(Boolean.TRUE)) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}*/
		// Print items to shop separate than items not to shop
		Map<String, Boolean> shopNowList = new HashMap<String, Boolean>();
		Map<String, Boolean> doNotShopNowList = new HashMap<String, Boolean>();
		for (Map.Entry<String, Boolean> entry : shoppingList.entrySet()) {
			if (entry.getValue().equals(Boolean.TRUE)) {
				shopNowList.put(entry.getKey(), entry.getValue());
			}
			else {
				doNotShopNowList.put(entry.getKey(), entry.getValue());
			}
		}
		// Items to shop now
		System.out.println("Items to shop now:");
		System.out.println(shopNowList.keySet());
		// Items not to shop now
		System.out.println("Items not to shop now");
		System.out.println(doNotShopNowList.keySet());
	}

}
