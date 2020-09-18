package com.ye.tiger;

import java.awt.Color;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.ye.tiger.*;

/**
 * @author Mr.Ye
 * @function��ģ���ϻ�����Ϸ���� �������Դ������Ƶ��
 * 1.Ŀǰֻ��������ģ�飨��K������Ϸ��ˢ�磩������Ϊ�˷������գ��Ұ������ŵ���
 * ��Kģ��ʵ��
 * @���ڵ����⣺�������кܶ಻��ĵط������������Ǵ���Ŀɶ��Ժܲ��ʱ����ʱ��û����̫�࣬���� main�����ˡ������кܶ��뷨�͹���û�����ü�ʵ�֣����ڹ��������Ͽ��ԣ�ʱ��Ƚϼ���
 * ������ʱ������������Ƹó��� �ˣ�
 * @Data:5.1
 */
public class Tiger {
    public Tiger(int j) {
        JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.setBounds(0, 0, 800, 600);
        Image img = Toolkit.getDefaultToolkit().getImage("image/9.jpg");
        JFrame jf = new JFrame("��һ�ø��");

        JTextField[] jt = new JTextField[11];

        jt[0] = new JTextField("��һ����");
        jt[0].setBounds(200, 200, 400, 200);
        jt[0].setFont(new Font("����", 0, 50));
        jt[0].setBackground(Color.CYAN);
        jt[0].setHorizontalAlignment(JTextField.CENTER);

        jt[1] = new JTextField("�ۻ�");
        jt[1].setBounds(0, 0, 200, 200);
        jt[1].setFont(new Font("����", 0, 50));
        jt[1].setHorizontalAlignment(JTextField.CENTER);

        jt[2] = new JTextField("��K");
        jt[2].setBounds(0, 200, 200, 200);
        jt[2].setFont(new Font("����", 0, 50));
        jt[2].setHorizontalAlignment(JTextField.CENTER);

        jt[3] = new JTextField("����Ϸ");
        jt[3].setBounds(0, 400, 200, 200);
        jt[3].setFont(new Font("����", 0, 50));
        jt[3].setHorizontalAlignment(JTextField.CENTER);

        jt[4] = new JTextField("����");
        jt[4].setBounds(200, 400, 200, 200);
        jt[4].setFont(new Font("����", 0, 50));
        jt[4].setHorizontalAlignment(JTextField.CENTER);

        jt[5] = new JTextField("ѧϰ");
        jt[5].setBounds(400, 400, 200, 200);
        jt[5].setFont(new Font("����", 0, 50));
        jt[5].setHorizontalAlignment(JTextField.CENTER);

        jt[6] = new JTextField("ˢ��");
        jt[6].setBounds(600, 400, 200, 200);
        jt[6].setFont(new Font("����", 0, 50));
        jt[6].setHorizontalAlignment(JTextField.CENTER);

        jt[7] = new JTextField("�Դ��");
        jt[7].setBounds(600, 200, 200, 200);
        jt[7].setFont(new Font("����", 0, 50));
        jt[7].setHorizontalAlignment(JTextField.CENTER);

        jt[8] = new JTextField("������");
        jt[8].setBounds(600, 0, 200, 200);
        jt[8].setFont(new Font("����", 0, 50));
        jt[8].setHorizontalAlignment(JTextField.CENTER);

        jt[9] = new JTextField("��ְ");
        jt[9].setBounds(400, 0, 200, 200);
        jt[9].setFont(new Font("����", 0, 50));
        jt[9].setHorizontalAlignment(JTextField.CENTER);

        jt[10] = new JTextField("�Ӱ�");
        jt[10].setBounds(200, 0, 200, 200);
        jt[10].setFont(new Font("����", 0, 50));
        jt[10].setHorizontalAlignment(JTextField.CENTER);

        JTextArea jtar = new JTextArea("��һ�ɹ�ȥ��");
        jtar.setBounds(200, 200, 400, 200);

        jtar.setForeground(Color.blue);

        jtar.setSelectedTextColor(Color.red);
        jtar.setSelectionColor(Color.black);
        jtar.setFont(new Font("Serif", 0, 20));

        jp.add(jt[0]);
        jp.add(jt[1]);
        jp.add(jt[2]);
        jp.add(jt[3]);
        jp.add(jt[4]);
        jp.add(jt[5]);
        jp.add(jt[6]);
        jp.add(jt[7]);
        jp.add(jt[8]);
        jp.add(jt[9]);
        jp.add(jt[10]);

        jf.setBounds(20, 200, 800, 600);
        jf.add(jp);
        jf.setIconImage(img);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        int k = 1;//���ڽ���ת������k==jʱ������ѭ�����������
        //��Ƶ����
        AudioClip sound = null;
        try {
            URL soundFile = new URL("file:music/1.wav");
            sound = Applet.newAudioClip(soundFile);
            sound.loop();
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }

        for (int i = 3; i < 30; i++) {
            if (i == 11) {

                jt[1].setBackground(Color.green);
                jt[10].setBackground(Color.red);
                jt[9].setBackground(Color.blue);
                k++;
                if (k == j) {

                    jt[10].setBackground(Color.white);
                    jt[9].setBackground(Color.white);
                    jt[1].setBackground(Color.yellow);
                    //��˸
                    for (int m = 0; m < 11; m++) {
                        jt[1].setBackground(Color.darkGray);
                        try {
                            Thread.sleep(100);
                            jt[1].setBackground(Color.LIGHT_GRAY);
                            Thread.sleep(100);
                            jt[1].setBackground(Color.yellow);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    sound.stop();
                    break;
                }
                try {
                    Thread.sleep(200);
                    jt[1].setBackground(Color.white);
                    jt[10].setBackground(Color.white);
                    jt[9].setBackground(Color.white);

                    jt[2].setBackground(Color.green);
                    jt[1].setBackground(Color.red);
                    jt[10].setBackground(Color.blue);
                    k++;
                    if (k == j) {

                        jt[1].setBackground(Color.white);
                        jt[10].setBackground(Color.white);
                        jt[2].setBackground(Color.yellow);
                        for (int m = 0; m < 20; m++) {
                            jt[2].setBackground(Color.darkGray);
                            Thread.sleep(100);
                            jt[2].setBackground(Color.LIGHT_GRAY);
                            Thread.sleep(100);
                            jt[2].setBackground(Color.yellow);
                        }
                        sound.stop();
                        break;
                    }

                    Thread.sleep(200);

                    jt[2].setBackground(Color.white);
                    jt[1].setBackground(Color.white);
                    jt[10].setBackground(Color.white);

                    i = 3;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            jt[i - 2].setBackground(Color.green);
            jt[i - 1].setBackground(Color.red);
            jt[i].setBackground(Color.blue);
            k++;
            if (k == j) {

                jt[i - 1].setBackground(Color.white);
                jt[i].setBackground(Color.white);
                jt[i - 2].setBackground(Color.yellow);
                for (int m = 0; m < 11; m++) {
                    jt[i - 2].setBackground(Color.darkGray);
                    try {
                        Thread.sleep(100);
                        jt[i - 2].setBackground(Color.LIGHT_GRAY);
                        Thread.sleep(100);
                        jt[i - 2].setBackground(Color.yellow);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                //i-2==2ʱ��K,ģ�⶯�г���
                if (i - 2 == 2 || jt[0].equals("��K")) {//���������ѭ����ֵ
                    jt[0].setText("��K");
                    jt[1].setText("��K");
                    jt[2].setText("��K");
                    jt[3].setText("��K");
                    jt[4].setText("��K");
                    jt[5].setText("��K");
                    jt[6].setText("��K");
                    jt[7].setText("��K");
                    jt[8].setText("��K");
                    jt[9].setText("��K");
                    jt[10].setText("��K");
                    sound.stop();//��ͣǰ�������
                    AudioClip sound1 = null;
                    try {
                        URL soundFile = new URL("file:music/BEYOND.wav");
                        sound1 = Applet.newAudioClip(soundFile);
                        sound1.loop();
                    } catch (MalformedURLException e1) {
                        e1.printStackTrace();
                    }
                    for (int l = 0; l < 50; l++) {
                        jt[0].setBackground(Color.white);
                        jt[1].setBackground(Color.green);
                        jt[3].setBackground(Color.red);
                        jt[5].setBackground(Color.blue);
                        jt[7].setBackground(Color.green);
                        jt[9].setBackground(Color.red);
                        try {
                            Thread.sleep(150);
                            jt[0].setBackground(Color.GRAY);
                            jt[1].setBackground(Color.white);
                            jt[3].setBackground(Color.white);
                            jt[5].setBackground(Color.white);
                            jt[7].setBackground(Color.white);
                            jt[9].setBackground(Color.white);
                            Thread.sleep(150);
                            jt[2].setBackground(Color.MAGENTA);
                            jt[4].setBackground(Color.pink);
                            jt[6].setBackground(Color.magenta);
                            jt[8].setBackground(Color.PINK);
                            jt[10].setBackground(Color.orange);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    sound1.stop();
                } else if (i - 2 == 6 || jt[0].equals("ˢ��")) {//ˢ��
                    for (int n = 0; n < 11; n++) {
                        jt[n].setText("ˢ��");
                    }
                    sound.stop();
                    new PhotoPlay();
                } else if (i - 2 == 3) {//����Ϸ Fun1
                    for (int n = 0; n < 11; n++) {
                        jt[n].setText("����Ϸ");
                    }
                    try {
                        Thread.sleep(500);
                        sound.stop();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    new Fun1();
                }
                break;
            }
            try {
                Thread.sleep(200);

                jt[i - 2].setBackground(Color.white);
                jt[i - 1].setBackground(Color.white);
                jt[i].setBackground(Color.white);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
