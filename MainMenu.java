import javax.swing.*;

public class Main {
   public static void main(String[] args) {
       JFrame scene = new JFrame();
       scene.setBounds(10, 10, 700, 600);
       scene.setTitle("Brick crash");
       scene.setResizable(false);
        scene.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game();
        scene.add(game);
        
       scene.setVisible(true);
   }
}