package inner_class.anonymous;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Test3 {

    public static void main(String[] args) {
        JFrame win = new JFrame("登陆界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登陆");
        panel.add(btn);

        // 给按钮绑定单击事件监听器
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 在这里添加按钮点击事件的处理逻辑
                JOptionPane.showMessageDialog(win, "登陆一下");
            }
        });
        
        //最终的核心目的是简化代码        
//        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "登陆一下"));
        
        win.setSize(400, 400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}