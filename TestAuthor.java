package com.oops.pll;
import com.oops.bll.Author;

public class TestAuthor {
 public static void main(String[] args) {
	 Author A1 = new Author();
	 Author A2 = new Author("Rakesh", "Yadav");
	 Author A3 = new Author("Ramanujan", "Sir", "MATHS BY RAMANUJAN");
	
	 System.out.println("FirstName: "+ A2.getFirstName());
	 System.out.println("LastName: "+ A2.getLastName());
	 System.out.println("BookName: "+ A2.getBookName());
	 System.out.println("******************************");
	 System.out.println(A3.toString());
	 System.out.println("FirstName: "+ A1.getFirstName());
	 System.out.println("LastName: "+ A1.getLastName());
	 System.out.println("BookName: "+ A1.getBookName());
	 System.out.println("*********************************");
	 Author A4 = new Author();
	 System.out.println(A4);
	 Author A5;
	// System.out.println(A5);
	 A5 = A2;
	 System.out.println(A5);
 }
 

 
 
}
