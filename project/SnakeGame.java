import java.awt.*;
import java.awt.event.*;
import javax.management.timer.Timer;
import javax.swing.*;
import java.util.*;

public class SnakeGame extends JPanel implements KeyListener {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final int TILE_SIZE = 20;
    private static final int DELAY = 100;

    private LinkedList<Point> snake;
    private Point fruit;
    private int direction;
    private boolean isRunning;

    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        initGame();
    }

    private void initGame() {
        snake = new LinkedList<>();
        snake.add(new Point(WIDTH / 2, HEIGHT / 2));
        fruit = new Point((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT));
        direction = KeyEvent.VK_RIGHT;
        isRunning = true;
        Timer timer = new Timer();
        timer.start();
    }

    private void gameLoop() {
        if (!isRunning)
            return;

        Point head = snake.getFirst();
        Point newHead = (Point) head.clone();

        switch (direction) {
            case KeyEvent.VK_UP:
                newHead.y--;
                break;
            case KeyEvent.VK_DOWN:
                newHead.y++;
                break;
            case KeyEvent.VK_LEFT:
                newHead.x--;
                break;
            case KeyEvent.VK_RIGHT:
                newHead.x++;
                break;
        }

        if (newHead.equals(fruit)) {
            snake.addFirst(newHead);
            spawnFruit();
        } else {
            snake.removeLast();
            if (snake.contains(newHead) || newHead.x < 0 || newHead.x >= WIDTH || newHead.y < 0 || newHead.y >= HEIGHT)
                gameOver();
            else
                snake.addFirst(newHead);
        }

        repaint();
    }

    private void spawnFruit() {
        fruit.setLocation((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT));
    }

    private void gameOver() {
        isRunning = false;
        JOptionPane.showMessageDialog(this, "Game Over!", "Game Over", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw snake
        g.setColor(Color.GREEN);
        for (Point p : snake)
            g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        // Draw fruit
        g.setColor(Color.RED);
        g.fillRect(fruit.x * TILE_SIZE, fruit.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if ((key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN)
                && Math.abs(direction - key) != 2) {
            direction = key;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new SnakeGame(), BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
