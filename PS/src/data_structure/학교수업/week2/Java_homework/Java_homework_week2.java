package data_structure.학교수업.week2.Java_homework;

import javax.swing.*;
import java.awt.*;

public class Java_homework_week2 {
    public static void main(String[] args) {
        Name name = new Name(); // Name 객체 생성
        name.setTitle("송기 그리기"); // 프레임 제목 설정
        name.setSize(400, 200); // 프레임 크기 설정
        name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫기 버튼 동작 설정
        name.setVisible(true); // 프레임 보이게 설정
    }
}
