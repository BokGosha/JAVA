package ru.mirea.lab5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationWindow extends JFrame {
    private ImageIcon[] frames;
    private JLabel animationLabel;
    private int currentFrameIndex;

    public AnimationWindow(ImageIcon[] frames) {
        this.frames = frames;
        this.currentFrameIndex = 0;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(frames[0].getIconWidth(), frames[0].getIconHeight());
        setLocationRelativeTo(null);

        animationLabel = new JLabel(frames[0]);
        getContentPane().add(animationLabel);

        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAnimation();
            }
        });
        timer.start();
    }

    private void updateAnimation() {
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
        animationLabel.setIcon(frames[currentFrameIndex]);
    }

    public static void main(String[] args) {
        ImageIcon[] frames = new ImageIcon[7];
        frames[0] = new ImageIcon("C:\\Users\\goshi\\OneDrive\\Изображения\\Снимки экрана\\Снимок экрана 2023-09-20 154405.png");
        frames[1] = new ImageIcon("C:\\Users\\goshi\\OneDrive\\Изображения\\Снимки экрана\\Снимок экрана 2023-09-20 154436.png");
        frames[2] = new ImageIcon("C:\\Users\\goshi\\OneDrive\\Изображения\\Снимки экрана\\Снимок экрана 2023-09-20 154441.png");
        frames[3] = new ImageIcon("C:\\Users\\goshi\\OneDrive\\Изображения\\Снимки экрана\\Снимок экрана 2023-09-20 154436.png");
        frames[4] = new ImageIcon("C:\\Users\\goshi\\OneDrive\\Изображения\\Снимки экрана\\Снимок экрана 2023-09-20 154405.png");
        frames[5] = new ImageIcon("C:\\Users\\goshi\\OneDrive\\Изображения\\Снимки экрана\\Снимок экрана 2023-09-20 154436.png");
        frames[6] = new ImageIcon("C:\\Users\\goshi\\OneDrive\\Изображения\\Снимки экрана\\Снимок экрана 2023-09-20 154441.png");

        AnimationWindow window = new AnimationWindow(frames);
        window.setVisible(true);
    }
}