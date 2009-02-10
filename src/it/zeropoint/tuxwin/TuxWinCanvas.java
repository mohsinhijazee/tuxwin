/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.zeropoint.tuxwin;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;

/**
 *
 * @author mohsinhijazee
 */
public class TuxWinCanvas extends GameCanvas implements Runnable {

    // The paint interval
    private static int paintInterval = 10;

    public TuxWinCanvas()
    {
      super(false);
    }

    /**
     * The Main game loop
     */
    public void run() {

        // The main game loop
        while(true)
        {
            updateScreen(getGraphics());
            
            try
            {
                Thread.sleep(paintInterval);
            }
            catch(Exception e)
            {
            }
        }
        
    }


    // Start the thread
    public void start()
    {
        // load the Sprites

        // Setup the Sprites

        // Run the thread

        Thread runner = new Thread(this);
        runner.start();
    }


    // The main update screen method
    private void updateScreen(Graphics g)
    {
        createBackground(g);
        flushGraphics();
    }

    private void createBackground(Graphics g)
    {
        g.setColor(0xbcbc9c);
        g.fillRect(0, 0, getWidth(), getHeight());
    }



}
