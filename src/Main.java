import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int[] width = {800, 1024, 1200, 1280, 1680, 1920};
        int[] height = {600, 768, 600, 1024, 1050, 1080};
        String[] strings = new String[width.length];
        JRadioButton[] jRadioButtons = new JRadioButton[width.length];
        ButtonGroup buttonGroup = new ButtonGroup();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(width.length, 1,0,0));
        for (int i = 0; i < width.length; i++) {
            strings[i] = width[i] + "width" + height[i];
            jRadioButtons =
            
        }


    }
}