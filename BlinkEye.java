/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
/*<applet code=ColorBoxes width=300 height=300></applet>*/

/**
 *
 * @author kumar
 */
public class BlinkEye extends Applet {
            
    public void paint(Graphics g){
    // String tempDelay="10";
     //int finalDelay=Integer.parseInt(tempDelay);
     //int rval,gval,bval;
    g.drawOval(100, 300, 500, 500);//face
    for(int k=1;k<1000;k++){
       g.setColor(Color.black);
        g.fillOval(180, 400, 100, 100);//left eye
        g.fillOval(430, 400, 100, 100);//right eye
        try {
            // delay(finalDelay);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BlinkEye.class.getName()).log(Level.SEVERE, null, ex);
        }
       g.setColor(Color.WHITE);
       g.fillOval(180, 400, 100, 100);//left eye
        g.fillOval(430, 400, 100, 100);//right eye
    }
    
}
}
