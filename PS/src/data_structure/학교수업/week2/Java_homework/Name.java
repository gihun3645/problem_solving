package data_structure.학교수업.week2.Java_homework;

import javax.swing.*;
import java.awt.*;

public class Name extends JFrame {
    public void paint(Graphics g) {
        // 송
        // ㅅ
        g.drawLine(100, 60, 50, 100);
        g.drawLine(100, 60, 150, 100);
        // ㅗ
        g.drawLine(100, 80, 100, 110);
        g.drawLine(50, 110, 150, 110);
        // 00
        g.drawOval(85, 130, 30, 30);
        // 기
        // ㄱ
        g.drawLine(250, 60, 300, 60); // 가로선
        g.drawLine(300, 60, 300, 100); // 세로선
        // ㅣ
        g.drawLine(350, 50, 350, 150); // 세로선;
    }
}
