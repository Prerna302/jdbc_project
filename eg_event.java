/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project;

/**
 *
 * @author kumar
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class eg_event extends Applet implements KeyListener
{
	public void init()
	{
		addKeyListener(this);
	}
	public void keyTyped(KeyEvent KB){}
	public void keyReleased(KeyEvent KB)
	{
		showStatus("Key on the Keyboard is released");
	}
	public void keyPressed(KeyEvent KB)
	{
		showStatus("A key on the keyboard is pressed");
	}
	Font f1 = new Font("Courier New",Font.BOLD,20);
	public void paint(Graphics GA)
	{
		GA.setFont(f1);
		GA.setColor(Color.blue);
		GA.drawString("This applet sense the up/down motion of keys",20,120);
	}
}