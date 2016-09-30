/**
 * 
 */
package martin;
import java.util.Scanner;
/**
 * @author 323375980
 *
 */

public class Student {
	private String student;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String province;
	private String postalCode;
	//private String phoneNumber;
	//private int birthday;
	// Add in birthday and phone number
	
	public void setfirstName(String firstName){
		this.firstName=firstName;
	}
	public String getfirstName(){
		return this.firstName;
	}

	public void setlastName(String lastName){		
		this.lastName=lastName;
	}
	public String getlastName(){
		return this.lastName;
	}
	public void setaddress(String address){		
		this.address=address;
		}
	public String getaddress(){
		return this.address;
	}
	public void setcity(String city){		
		this.city=city;
	}
	public String getcity(){
		return this.city;
	}
	public void setprovince(String province){		
		this.province=province;
	}
	public String getprovince(){
		return this.province;
	}
	public void setpostalCode(String postalCode){
		this.postalCode=postalCode;
	}
	public String getpostalCode(){
		return this.postalCode;
		}

}

