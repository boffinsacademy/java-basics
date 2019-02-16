
public class RemoveAllSpecialCharacter {

	public static void main(String args[]) { 
		String text = "This - text ! has \\ /allot # of % special % characters"; 
		text = text.replaceAll("[^a-zA-Z0-9]", ""); 
		System.out.println(text); 
		String html = "This is bold";
		html = html.replaceAll("[^a-zA-Z0-9\\s+]", "");
		System.out.println(html); } }


