package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		Hero h1 = new Hero();
		h1.name = "みなと";
		list.add(h1);
		System.out.println("要素数" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数" + list.size());
		
	}
}