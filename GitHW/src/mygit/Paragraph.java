package mygit;

public class Paragraph {
	
	public static String catWhiteSpace(String orig) {
		if (orig == null)
			return null;	
	
		StringBuilder result = new StringBuilder();
		int length = orig.length();
		int i = 0;
		
		while (i < length) {		
			char ch = orig.charAt(i);
		
			if (isWhiteSpace(ch))
				result.append(' ');
			
			while (isWhiteSpace(ch)) {
				i++;
				if (i >= length)
					break; 
				ch = orig.charAt(i);
			}
			
			if (!isWhiteSpace(ch))
				result.append(ch);
			
			i++;
		}
		
		return result.toString();
	}
	
	static boolean isWhiteSpace(char ch) {
		if (ch == ' ' || ch == '\t')
			return true;
		else
			return false;
	}
}
