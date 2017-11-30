package arrays.strings.ctci;

public class isUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isUnique1("rohitr"));

	}
	
	public static boolean isUnique1(String str){
		if(str.length() > 128){
			return false;
		}else{
			boolean[] set = new boolean[128];
			
			for(int i=0;i<str.length();i++){
				int val = str.charAt(i);
				if(set[val]){
					return false;
				}else{
					set[val] = true;
				}
			}
			return true;
		}
	}

}
