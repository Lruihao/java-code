﻿/**
 * 自定义的JButton按钮
 */
package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class JButton extends javax.swing.JButton{
	private static final long serialVersionUID = 1L; //兼容类的版本不一致

	public JButton(String text) {
        super(text);
        this.setPreferredSize(new Dimension(135,45));
        this.setBackground(new Color(255,255,255));
        this.setFont(new Font(Font.SERIF,Font.PLAIN,14)); //字体大小
        this.setForeground(new Color(20,50,32)); //字体颜色
    }
}
