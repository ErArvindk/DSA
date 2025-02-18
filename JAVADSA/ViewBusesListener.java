import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BusManagementSystem extends JFrame {
    private JTextField busNumberField, capacityField;
    private JButton addBusButton, viewBusesButton;
    private JTextArea displayArea;

    public BusManagementSystem() {
        setTitle("Bus Management System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        busNumberField = new JTextField(10);
        capacityField = new JTextField(10);
        addBusButton = new JButton("Add Bus");
        viewBusesButton = new JButton("View Buses");
        displayArea = new JTextArea(10, 30);

        add(new JLabel("Bus Number:"));
        add(busNumberField);
        add(new JLabel("Capacity:"));
        add(capacityField);
        add(addBusButton);
        add(viewBusesButton);
        add(new JScrollPane(displayArea));

        addBusButton.addActionListener(new AddBusListener());
        viewBusesButton.addActionListener(new ViewBusesListener());
    }

    private class AddBusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String busNumber = busNumberField.getText();
            int capacity = Integer.parseInt(capacityField.getText());
            try (Connection connection = DatabaseConnection.connect()) {
                String query = "INSERT INTO buses (bus_number, capacity) VALUES (?, ?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, busNumber);
                statement.setInt(2, capacity);
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Bus added successfully!");
                busNumberField.setText("");
                capacityField.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private class ViewBusesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try (Connection connection = DatabaseConnection.connect()) {
                String query = "SELECT * FROM buses";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                displayArea.setText("");
                while (resultSet.next()) {
                    displayArea.append("Bus ID: " + resultSet.getInt("bus_id") + 
                                       ", Number: " + resultSet.getString("bus_number") + 
                                       ", Capacity: " + resultSet.getInt("capacity") + "\n");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BusManagementSystem bms = new BusManagementSystem();
            bms.setVisible(true);
        });
    }
}
