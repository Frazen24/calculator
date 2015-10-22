//usig pane GUI...
package calculator;
import javax.swing.JOptionPane;
public class interfaces {
    public static void main(String[] args)
	{
    String f=JOptionPane.showInputDialog("Enter Nber 1:");  
    String n=JOptionPane.showInputDialog("Enter Nber 2:"); 
    //convert strings into integers
    int nber1=Integer.parseInt(f);
    int nber2=Integer.parseInt(n);
    int sum=nber1+nber2;
    JOptionPane.showMessageDialog(null, "the answer" +sum, "title show answer:", JOptionPane.PLAIN_MESSAGE);
}
}