package com.oops.pll;

import com.oops.bll.InvoiceItem;

public class TestInvoiceItem {

	public static void main(String[] args) 
	{
	      // Test constructor and toString()
	  
	      InvoiceItem obj=new InvoiceItem("BMIG2207300040","MIGRATION ID",2, 321);
	      
	      System.out.println("ID : " + obj.getId());
	      System.out.println("Description : " + obj.getDesc());
	      System.out.println("Quantity : " + obj.getQty());
	      System.out.println("Unit Price : " + obj.getUnitPrice());
	      System.out.println("Total : " + obj.getTotal());
	      System.out.println("***************************" );
	      obj.setUnitPrice(500);
	      System.out.println("Total : " + obj.getTotal());
	      System.out.println("*******************************" );
	      System.out.println(obj);	     
	 }
}
