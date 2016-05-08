package com.newtalent.www;

public class TestMyList {

	public static void main(String[] args) {
		
		
		MyLinkedList<String> countryLinkedList = new MyLinkedList<String>();
		
		countryLinkedList.add("America");
		System.out.println("1: " + countryLinkedList);
		
		countryLinkedList.add(0,"Canada");
		System.out.println("2: " + countryLinkedList);
		
		countryLinkedList.add("Russia");
		System.out.println("3: " + countryLinkedList);
		
		countryLinkedList.addLast("France");
		System.out.println("4: " + countryLinkedList);
		
		countryLinkedList.add(2,"German");
		System.out.println("5: " + countryLinkedList);
		
		countryLinkedList.add(5,"Norway");
		System.out.println("6: " + countryLinkedList);
		
		countryLinkedList.add(0,"Portland");
		System.out.println("7: " + countryLinkedList);
		
		countryLinkedList.remove(0);
		System.out.println("8: " + countryLinkedList);
		
		countryLinkedList.remove(2);
		System.out.println("9: " + countryLinkedList);
		
		countryLinkedList.remove(countryLinkedList.size()-1);
		System.out.println("10: " + countryLinkedList);
		
		countryLinkedList.add("Norway");
		countryLinkedList.add("America");
		countryLinkedList.add("china");
		
		System.out.println(countryLinkedList);
		System.out.println(countryLinkedList.lastIndexOf("Norway"));
		System.out.println(countryLinkedList.lastIndexOf("America"));

//		MyArrayList<String> namesArrayList = new MyArrayList<String>();
//		
//		namesArrayList.add("A");
//		System.out.println("1: " + namesArrayList);
//		
//		namesArrayList.add(0, "C");
//		System.out.println("2: " + namesArrayList);
//	
//		namesArrayList.add("R");
//		System.out.println("3: " + namesArrayList);
//		
//		namesArrayList.add("F");
//		System.out.println("4: " + namesArrayList);
//		
//		namesArrayList.add(2,"G");
//		System.out.println("5: " + namesArrayList);
//		
//		namesArrayList.add(5,"N");
//		System.out.println("6: " + namesArrayList);
//		
//		namesArrayList.remove("C");
//		System.out.println("7: " + namesArrayList);
//		
//		namesArrayList.remove(2);
//		System.out.println("8: " + namesArrayList);
//		
//		namesArrayList.remove(namesArrayList.size()-1);
//		System.out.println("9: " + namesArrayList);
//		
//		namesArrayList.clear();
//		System.out.println("10: " + namesArrayList);
		
		
	}

}
