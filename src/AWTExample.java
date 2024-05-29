import java.awt.*;
import java.awt.event.*;
public class AWTExample extends Frame implements ActionListener {
    private Label nameLabel, ageLabel;
    private TextField nameField, ageField;
    private Button submitButton;
    private MenuBar menuBar;
    private Menu fileMenu, editMenu;
    private MenuItem newItem, openItem, saveItem, exitItem;
    public AWTExample() {
// Initialize components
        nameLabel = new Label("Name: ");
        ageLabel = new Label("Age: ");
        nameField = new TextField(20);
        ageField = new TextField(2);
        submitButton = new Button("Submit");
// Add action listener to submit button
        submitButton.addActionListener(this);
// Create menus and menu items
        menuBar = new MenuBar();
        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");
// Add menu items to menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
// Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
// Set layout and add components to frame
        setLayout(new FlowLayout());
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(submitButton);
// Set frame properties
        setTitle("AWT Example");
        setSize(400, 200);
        setMenuBar(menuBar);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
// Add action listener to menu items
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
// Handle submit button click
            System.out.println("Name: " + nameField.getText());
            System.out.println("Age: " + ageField.getText());
        } else if (e.getSource() == exitItem) {
// Handle exit menu item click
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new AWTExample();
    }
}