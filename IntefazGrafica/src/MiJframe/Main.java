
package MiJframe;
import java.awt.*;
import javax.swing.*;

public class Main extends JPanel{
    int y = 0;
    int x = 0;
    
    private void moveBall(){
        x = x + 1;
        y = y + 1;
}
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
  g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		Game game = new Game();
		//frame.add(game);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			game.moverBola();
			game.repaint();
			Thread.sleep(10);
                        
		}
	}
}