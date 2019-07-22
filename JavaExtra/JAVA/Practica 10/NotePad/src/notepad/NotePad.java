package notepad;

import javax.swing.JFrame;

public class NotePad {

    public static void main(String[] args) {
        notePadGui obj = new notePadGui();
        obj.setBouns(100, 100 ,391,390);
        obj.setTitle("Java NotePad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
