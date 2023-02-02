import javax.swing.JOptionPane;

public class BookDemo2 {

	public static void main(String[] args) {
	
		/*String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String book = JOptionPane.showInputDialog("Input book title:");
		String page = JOptionPane.showInputDialog("Input book page:");
		
		int correct = JOptionPane.showConfirmDialog(null, "is the page correct?","Confirm",JOptionPane.YES_NO_OPTION);
		
		if(correct == JOptionPane.NO_OPTION) {
			page = JOptionPane.showInputDialog("Input book page,again:");
		}
		
		
		JOptionPane.showMessageDialog(null,"Book Title : "+book+""
				+ "\nAuthor name : "+name+" ("+page+"page)"+""
						+ "\nAuthor e-mail : "+email,"Message", correct, null);
		*/
		
		//Test Author()
		
		
		
		String name   = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String book  = JOptionPane.showInputDialog("Input book title:");
		int page  = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		
		int correct  = JOptionPane.showConfirmDialog(null, "is the page correct?","Confirm",JOptionPane.YES_NO_OPTION);
		
		if(correct == JOptionPane.NO_OPTION) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again:"));
		}
		
		Book book1 = new Book(book,new Author (name,email),page);
		JOptionPane.showMessageDialog(null,"Book Title : "+book1.getTitle()+""
				+ "\nAuthor name : "+book1.getAuthor().getName()+" ("+book1.getPage()+" page)"+""
						+ "\nAuthor e-mail : "+book1.getAuthor().getEmail());
		
		
	}
}
