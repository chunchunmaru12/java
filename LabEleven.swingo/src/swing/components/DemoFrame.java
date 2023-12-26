package swing.components;
import java.awt.Color;
import java.awt.PopupMenu;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class DemoFrame extends JFrame
{
    public DemoFrame(){
        //otherwise we have to create object of JFrame and set properties by object
        //here 500 is width 300 is height 
        this.setSize(500,300);
        //static attribute can be invoked via direct class name
        //eg. RED is static attribute of class Color
        this.setBackground(Color.RED);
        //setting layout manager of JFrame. here we are using BoxLayout
        this.setLayout(new BoxLayout(this, 0));
        //creating JButton
        JButton btnl = new JButton();
        btnl.setText("CLICK ME");
        //creating button with text
        JButton btn2=new JButton("Button Two");
        PopupMenu btn1 = null;
        this.add(btn1);
        this.add(btn2);
        
    }
    public static void main(String[] args) {
        DemoFrame df=new DemoFrame();
        df.setVisible(true);
    }
}
