package refactoring;

public class BannerAfter {
	private final String content;							//책에서는_content
	public BannerAfter(String content) {
		this.content =content;
	}
	public void print(int times) {
		printBorder();
		printContent(times);
		printBorder();
	}
	
	private void printBorder() {
		System.out.print("+");
		for (int i = 0; i < content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");		
	}
	
	private void printContent(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("|"+content+"|");			
		}		
	}
}
