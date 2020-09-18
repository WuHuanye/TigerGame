/**
 *
 */
package com.ye.tiger;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @function��ѭ������������ñ�ǩʵ��ͼƬ�Ĳ���
 * @author��Mr��
 * @Data:4.21
 */
public class PhotoPlay extends JFrame {
    public PhotoPlay() {
        Image img2 = Toolkit.getDefaultToolkit().getImage("image/2.jpg");
        ImageIcon[] imgs = {new ImageIcon("image/a.jpg"), new ImageIcon("image/b.jpg"), new ImageIcon("image/c.jpg"),
                new ImageIcon("image/d.jpg"), new ImageIcon("image/e.jpg"), new ImageIcon("image/f.jpg"),
                new ImageIcon("image/g.jpg"), new ImageIcon("image/h.jpg"), new ImageIcon("image/i.jpg"),
                new ImageIcon("image/j.jpg"), new ImageIcon("image/k.jpg"), new ImageIcon("image/1.jpg"),
                new ImageIcon("image/2.jpg"), new ImageIcon("image/3.jpg"), new ImageIcon("image/4.jpg"),
                new ImageIcon("image/5.jpg"), new ImageIcon("image/6.jpg"), new ImageIcon("image/7.jpg"),
                new ImageIcon("image/8.jpg"), new ImageIcon("image/9.jpg"),};

        JFrame jf = new JFrame("˭�ֽ��������������~~");
        jf.setBounds(0, 0, 1920, 1080);
        jf.setLayout(null);
        JLabel jl = new JLabel();
        jl.setBounds(450, 100, 1000, 800);

        // ���ֲ���
        AudioClip sound = null;
        try {
            URL soundFile = new URL("file:music/tian.wav");
            sound = Applet.newAudioClip(soundFile);
            sound.loop();
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            // �������ʵ��ͼƬ���������
            int random = (int) (Math.random() * 20);
            imgs[random].setImage(imgs[random].getImage().getScaledInstance(1000, 750, Image.SCALE_DEFAULT));
            jl.setIcon(imgs[random]);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            jf.add(jl);
            jf.setIconImage(img2);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
