//Program to demonstrate on class,object and Constructor
package org.stjohn.classobject;
public class Customer {

	
		//private data members
		private int customerID;
		private String customerName;
		private String city;
		
		//default constructor
		
		
		/*to access all the private data member*/
		public int getCustomerID() {
			return customerID;
		}
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		

	}

}
