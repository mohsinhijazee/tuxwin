/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.zeropoint.tuxwin;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author mohsinhijazee
 */
public class TuxWinMidlet extends MIDlet {

    private static TuxWinCanvas canvas;

    public TuxWinMidlet()
    {
        canvas = new TuxWinCanvas();
    }

    public void startApp() {
        Display display = Display.getDisplay(this);
        canvas.start();
        display.setCurrent(canvas);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
