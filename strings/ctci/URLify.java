package arrays.strings.ctci;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceAllSpace("a b  ".toCharArray(),3));

	}
	
	public static String replaceAllSpace(char[] str, int length){
		//First pass to calculate the number of spaces int the string
		
		int spaceCount  = 0;
		int index =0;
		
		for(int i=0 ;i<length;i++){
			if(str[i] == ' ' ){
				spaceCount++;
			}
		}
		
		// calculate the index value for the second pass. 
		index = length + spaceCount * 2;
		
		
		
		
		//Second pass. We go in backward manner.
		//There are two possibilities. if a char exists at i, move that char to the (index-1) position and then decrease the index
		//else if a space is present, replace that space with %20.
		
		for(int i = length-1; i >= 0;i--){
			if(str[i] == ' '){
				str[index -1] = '0';
				str[index -2] = '2';
				str[index -3] = '%';
				index = index -3;
			}else{
				str[index -1] = str[i];
				index--;
			}
		}
		
		 String txt = String.valueOf(str);
		 return txt;
	}

}
