package arrays.strings.ctci;
import java.util.*;

public class isPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermutation1("rohiT","tihor"));
	

	}
	
	public  static boolean isPermutation1(String inp1, String inp2){
		if(inp1.length() !=inp2.length()){
			return false;
		}else{
			Hashtable<Integer,String> table = new Hashtable<Integer, String>();
			
			for(int i=0;i<inp1.length();i++){
				table.put(new Integer(i), Character.toString(inp1.charAt(i)));
			}
			
			for(int j = 0; j<inp2.length();j++){
				if (!table.containsValue(Character.toString(inp2.charAt(j)))) {
					return false;
				}
			}
		}
		
		
		
		
		return true;
	}

}
