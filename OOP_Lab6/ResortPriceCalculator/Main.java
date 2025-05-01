import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Price calculator");
        frame.setLayout(new GridLayout(7,1));
        frame.setSize(600,600);
        frame.setLocation(200,200);

        
        
        JLabel label1 = new JLabel("Resort Price Calculator");
        label1.setFont(new Font("Arial",Font.PLAIN,24));
        JLabel label2 = new JLabel("Base price for a room is $200");
        label2.setFont(new Font("Arial",Font.PLAIN,20));
        JLabel label3 = new JLabel("Choose option that you want");
        label3.setFont(new Font("Arial",Font.PLAIN,20));

        frame.add(label1);frame.add(label2);frame.add(label3);

        JPanel panel1 = new JPanel(new FlowLayout());
        JLabel label4 = new JLabel("Guest Name:");
        JTextField guestName = new JTextField(18);
        panel1.add(label4);panel1.add(guestName);

        JPanel panel2 = new JPanel(new FlowLayout());
        JCheckBox breakfast = new JCheckBox("Breakfast $20");
        JCheckBox golf = new JCheckBox("Golf $50");
        JCheckBox pool = new JCheckBox("Pool $15");
        panel2.add(breakfast);panel2.add(golf);panel2.add(pool);
        

        JPanel panel3 = new JPanel(new FlowLayout());
        String[] dates = {"week day (-10%)","Weekend (+30%)"};
        JComboBox<String> dayOfWeek = new JComboBox<String>(dates);
        JButton btnCalculate = new JButton("Calculate");
        JLabel result = new JLabel();
        btnCalculate.addActionListener((e)->{
            if (guestName.getText().equals("") == false){
                double money = 200;
                if (breakfast.isSelected()){
                    money+=20;
                }
                if (golf.isSelected()){
                    money+=50;
                }
                if (pool.isSelected()){
                    money+=15;
                }
                if (dayOfWeek.getSelectedItem().equals("week day (-10%)")){
                    money *= 0.9;
                }else{
                    money *= 1.3;
                }
                result.setText("Hello "+guestName.getText()+" Your payment is: $"+money);
            }
        });
        
        panel3.add(dayOfWeek);panel3.add(btnCalculate);


        frame.add(panel1);frame.add(panel2);frame.add(panel3);frame.add(result);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}