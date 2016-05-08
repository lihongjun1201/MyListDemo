package com.newtalent.www;

public class TestMyList {

	public static void main(String[] args) {

		MyArrayList<String> namesArrayList = new MyArrayList<String>();
		
		namesArrayList.add("A");
		System.out.println("1: " + namesArrayList);
		
		namesArrayList.add(0, "C");
		System.out.println("2: " + namesArrayList);
	
		namesArrayList.add("R");
		System.out.println("3: " + namesArrayList);
		
		namesArrayList.add("F");
		System.out.println("4: " + namesArrayList);
		
		namesArrayList.add(2,"G");
		System.out.println("5: " + namesArrayList);
		
		namesArrayList.add(5,"N");
		System.out.println("6: " + namesArrayList);
		
		namesArrayList.remove("C");
		System.out.println("7: " + namesArrayList);
		
		namesArrayList.remove(2);
		System.out.println("8: " + namesArrayList);
		
		namesArrayList.remove(namesArrayList.size()-1);
		System.out.println("9: " + namesArrayList);
		
		namesArrayList.clear();
		System.out.println("10: " + namesArrayList);
		
	}

}
