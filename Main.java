package Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
	Button button = new Button();	
	
	List<String> text = new ArrayList<>();
	text.add(button.setAction("Start"));
	text.add(button.setName("Enter"));
	text.add(button.setAction("Select"));
	text.add(button.setName("List"));
	
	System.out.println(text.size());
	System.out.println(text.toString());
	text.set(0, "Triple");
	System.out.println(text.toString());
	text.remove("Enter");
	text.remove(2);
	System.out.println("Result Arraylist  "+ text.toString());
	System.out.println();
	
	LinkedList<Field> list = new LinkedList<Field>();
	list.add(new Field (0, "Sring"));
	list.addFirst(new Field (0, "Double"));
	list.addLast(new Field(0, "Integer"));
	
	for(Field s : list) {
	System.out.println("LinkedList stock " +  s.getValue());
	}
	System.out.println();
	list.set(0, new Field (1, "Iterator"));
	list.remove(2);
	System.out.println();
	for(Field s : list) {
		System.out.println("LinkedList change " + s.getValue());
		}
	
		System.out.println(list.size());
	
	
	
	HashSet<Label> lab = new HashSet<Label>();
	lab.add(new Label("Icon"));
	lab.add(new Label("Massage"));
	lab.add(new Label("Picture"));
	
	for(Label s : lab)
		System.out.println("Hash Set " + s.getName());
	System.out.println(lab.size());
	
	
	
	//Dropdown dropdown = new Dropdown();
	
		//Map<String, List<String>> key  = new HashMap <String, List<String>>();
	
	//System.out.println(key);
	System.out.println();
	
	Map <String , String> map = new HashMap <String,String>();
	map.put("Key1", "Volvo");
	map.put("Key2", "Ford");
	map.put("Key3", "BMW");
	map.put("Key4", "Merceses");
	map.put("Key5", "Opel");
	map.put("Key6", "Jaguar");
	
	System.out.println("Size Collection" + map);
	System.out.println();
	map.remove("Key5");
	map.replace("Key3", "Porshe");
	
	System.out.println("Size Collection change" + map);
	}
	}
	
	
	
	


