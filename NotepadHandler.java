import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;


public class NotepadHandler implements ActionListener
{
	Notepad note;

	public NotepadHandler(Notepad notepad) 
	{
		note=notepad;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==note.cut)
		{
			note.txt.cut();
		}
		
		if(e.getSource()==note.copy)
			note.txt.copy();
		
		if(e.getSource()==note.paste)
			note.txt.paste();
		
		if(e.getSource()==note.open)
		{
			JFileChooser jc=new JFileChooser(".");
			jc.showOpenDialog(note);
		
		}
		
	}

}
