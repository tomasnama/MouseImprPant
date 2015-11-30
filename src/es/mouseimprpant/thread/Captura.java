package es.mouseimprpant.thread;

import java.awt.*;
import java.awt.image.*;

import java.io.*;

import javax.imageio.ImageIO;

public class Captura extends Thread {
	public String fileName;
	
    public Captura(String fileName) {
		super();
		this.fileName = fileName;
	}

	static public void captureScreen(String fileName) throws Exception {
        Dimension screenSize =
            java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRectangle = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        ImageIO.write(image, "png", new File(fileName));
    }

	@Override
	public void run() {
		try {
			captureScreen(fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    
}
