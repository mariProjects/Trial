import javax.swing.JOptionPane;
public class BasicGUI {
	public static void main (String[] args) {
	
	String name = JOptionPane.showInputDialog("Hello, what is your name?");
	JOptionPane.showMessageDialog(null, "Hello "+name);
	JOptionPane.showConfirmDialog(null, "Are you available today for an interview?");
	}
}
