
package com.ye.tiger;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fun1 extends JFrame {

    /**
     * @description:��Ц1
     * @param:
     * @return:
     */
    public Fun1() {
        ImageIcon[] imgs = {
                new ImageIcon("image/one1.png"),
                new ImageIcon("image/one2.png"),
                new ImageIcon("image/two1.png"),
                new ImageIcon("image/two2.png"),
                new ImageIcon("image/three1.png"),
                new ImageIcon("image/three2.png")
        };
        //JPanel jp = new JPanel();
        Image img = Toolkit.getDefaultToolkit().getImage("image/three1.png");
        JLabel jl = new JLabel();
        this.setIconImage(img);//����ͼƬ
        this.setBounds(800, 200, 1200, 730);
        this.setTitle("ɳ���ֶ�");
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���ֲ���
        AudioClip sound = null;
        try {
            URL soundFile = new URL("file:music/gaoxiao.wav");
            sound = Applet.newAudioClip(soundFile);
            sound.loop();

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
        for (int i = 0; i < 80; i++) {
            if (i < 35) {
                if (i % 2 == 0) {
                    jl.setIcon(imgs[0]);
                } else {
                    jl.setIcon(imgs[1]);
                }
            } else if (i >= 35 && i < 70) {
                if (i % 2 == 0) {
                    jl.setIcon(imgs[2]);
                } else {
                    jl.setIcon(imgs[3]);
                }
            } else {
                if (i % 2 == 0) {
                    jl.setIcon(imgs[4]);
                } else {
                    jl.setIcon(imgs[5]);
                }
            }
            this.add(jl);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sound.stop();
    }
}
