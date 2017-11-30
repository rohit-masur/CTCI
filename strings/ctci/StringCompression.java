package arrays.strings.ctci;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compressString("aabcccccaaa"));

	}
	public static String compressString(String s){
		int count =1;
		StringBuilder sb = new StringBuilder();
		char[] a = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			if(i+1 < s.length()){
				if(a[i] == a[i+1]){
					count++;
				}else{
					sb.append(a[i]);
					sb.append(count);
					count =1;
				}
			}else{
				sb.append(a[i]);
				sb.append(count);
			}
		}
		
		if(sb.length() <= s.length()){
			return sb.toString();
		}else{
			return s;
		}
	}

}
