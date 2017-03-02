import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

//import calculator.Calc;


public class Notepad extends JFrame
{
		JMenuBar bar;
		JMenu edit,file,help;
		JMenuItem cut,copy,paste,exit,search,open,save;
		JTextArea txt;
		
		public Notepad() 
		{
			bar=new JMenuBar();
		    txt=new JTextArea();
			
			edit=new JMenu("Edit");
			file=new JMenu("File");
			help=new JMenu("Help");
		
			cut=new JMenuItem("Cut");
			copy=new JMenuItem("Copy");
			paste=new JMenuItem("Paste");
			exit=new JMenuItem("Exit");
			search=new JMenuItem("Search");
			open=new JMenuItem("Open");
			save=new JMenuItem("Save");
			
			
			edit.add(copy);
			edit.add(cut);
			edit.add(paste);
			
			file.add(exit);
			file.add(open);
			file.add(save);
			
			help.add(search);
			
			bar.add(file);
			bar.add(edit);
			bar.add(help);
			
			
			NotepadHandler h=new NotepadHandler(this);
			cut.addActionListener(h);
			copy.addActionListener(h);
			paste.addActionListener(h);
			open.addActionListener(h);
			
			setJMenuBar(bar);
			add(txt);
			setTitle("Notepad");
			setSize(600,600);
		    setVisible(true);
			
		}
		public static void main(String[] args) {
			new Notepad();
		}
		
		
	
}
