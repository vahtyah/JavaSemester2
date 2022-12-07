import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class project extends JFrame
{
    JButton AM = new JButton("AC Milan"); //создает кнопку
    JButton RM = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0"); //создает метку
    JLabel lastScorer = new JLabel("“Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");
    private int am = 0, rm = 0;
    private void addAL(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button == AM) am++;
                else rm++;
                result.setText("Result: " + am + "X" + rm);
                String lastScore = (button == AM) ? "AC Milan" : "Real Madrid";
                lastScorer.setText("Last Score: " + lastScore);
                if(am == rm) winner.setText("Winner: DRAW");
                else if(am > rm) winner.setText("Winner: AC MILAN");
                else winner.setText("Winner: REAL MADRID");
            }
        });
    }
    public project()
    {
        super("Milan vs Madrid");
        setSize(400,400);
        setLayout(new GridBagLayout()); //Макет используется для указания макета дочерних элементов внутри контейнера.
        GridBagConstraints gbc = new GridBagConstraints(); //Класс GridBagConstraints задает ограничения для компонентов, размещенных с помощью класса GridBagLayout.
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(AM,gbc);
        gbc.gridx++;
        add(RM,gbc);
        gbc.gridx--;
        gbc.gridy++;
        gbc.gridwidth = 2;
        add(result,gbc);
        gbc.gridy++;
        add(lastScorer,gbc);
        gbc.gridy++;
        add(winner,gbc);
        addAL(AM);
        addAL(RM);
    }
    public static void main(String[]args)
    {
        new project().setVisible(true); //отображать JFrame
    }
}