import javax.swing.* ;

public class SnakeGame extends JFrame {

    Board board;

    SnakeGame() {
        board = new Board();
        add(board);
        setVisible(true);
        pack();
        setResizable(false);


    }
    public static void main(String[] args){

        new SnakeGame();
    }
}