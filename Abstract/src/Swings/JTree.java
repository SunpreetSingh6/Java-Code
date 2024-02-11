package Swings;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTree {
	
	JFrame f;
	JTree()
	{
		f = new JFrame("JTree");
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
		DefaultMutableTreeNode colour = new DefaultMutableTreeNode("colour");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
		style.add(colour);style.add(font);
		DefaultMutableTreeNode balck = new DefaultMutableTreeNode("Black");
		DefaultMutableTreeNode brown = new DefaultMutableTreeNode("Brown");
		DefaultMutableTreeNode orange = new DefaultMutableTreeNode("Orange");
		DefaultMutableTreeNode yellow = new DefaultMutableTreeNode("Yellow");
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
		colour.add(balck);colour.add(brown);colour.add(orange);colour.add(yellow);colour.add(blue);
		JTree t = new JTree(style);
		f.add(t);
		f.setSize(400, 400);
		f.setLayeredPane(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new JTree();
	}

}
