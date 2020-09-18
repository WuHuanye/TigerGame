package com.ye.tiger;

import javax.swing.JOptionPane;

public class Main {

    /**
     * @description:������
     * @param:
     * @return:
     */
    public static void main(String[] args) {
        int j = 0;
        String str = JOptionPane.showInputDialog("������ؼ��ʡ������ˢ�硢��K������Ϸ");
        if (str.equals("��K")) {
            j = 23;
        } else if (str.equals("ˢ��")) {
            j = 27;
        } else if (str.equals("����Ϸ")) {
            j = 24;
        } else {
            j = (int) (Math.random() * 30);
        }
        new Tiger(j);
    }

}
