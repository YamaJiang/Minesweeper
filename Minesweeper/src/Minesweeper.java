import java.awt.*;
import javax.swing.*;

public class Minesweeper{
    private class MineTile extends JButton{
        int r;
        int c;

        public MineTile(int r, int c){
            this.r=r;
            this.c=c;
        }
    }

    int tileSize=70;
    int numRows= 8;
    int numCols= numRows;
    int boardWidth= numCols * tileSize;
    int boardHeight= numRows*tileSize;

    JFrame frame = new JFrame("Minesweeper");
    JLabel textLabel= new JLabel();
    JPanel textPanel= new JPanel();
    JPanel boardPanel= new JPanel();
    //2D array to store mine tiles
    MineTile[][] board= new MineTile[numRows][numCols];


    Minesweeper(){
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); 

        textLabel.setFont(new Font("Arial", Font.BOLD,25));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Minesweeper");
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel); 
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(numRows, numCols));
        //boardPanel.setBackground(Color.red);
        frame.add(boardPanel);

        for(int r=0; r<numRows; r++){
            for(int c=0; c<numCols; c++){
                MineTile tile= new MineTile(r, c);
                board[r][c]=tile;
                tile.setFocusable(false);
                tile.setMargin(new Insets(0,0,0,0));

                tile.setFont(new Font("Arial Unicode MS", Font.PLAIN, 45));
                tile.setText("1");
                boardPanel.add(tile);
            }
        }
    }
}