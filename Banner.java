package refactoring;

public class Banner {
	private final String content;							//å������_content
	public Banner(String content) {
		this.content =content;
	}
	
	public void print(int times) {
		// �׵θ� ���
		System.out.print("+");
		for (int i = 0; i < content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
		// ���� ���
		for (int i = 0; i < times; i++) {
			System.out.println("|"+content+"|");			
		}
		
		// �׵θ� ���
		System.out.print("+");
		for (int i = 0; i < content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
