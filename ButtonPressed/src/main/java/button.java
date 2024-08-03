import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class button extends JFrame implements ActionListener {
JButton alphaButton, betaButton;
JLabel messageLabel;
public button() {
setTitle("Button Event Handling Example");
setSize(300, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create buttons
alphaButton = new JButton("Alpha");
betaButton = new JButton("Beta");
// Create label to display message
messageLabel = new JLabel("");
// Add action listeners to buttons
alphaButton.addActionListener(this);
betaButton.addActionListener(this);
// Set layout
setLayout(new FlowLayout());
// Add components to the frame
add(alphaButton);
add(betaButton);
add(messageLabel);

setVisible(true);
}
// Event handling method
public void actionPerformed(ActionEvent e) {
if (e.getSource() == alphaButton) {
messageLabel.setText("Alpha pressed");
} else if (e.getSource() == betaButton) {
messageLabel.setText("Beta pressed");
}
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
public void run() {
new button();
}
});
}
}