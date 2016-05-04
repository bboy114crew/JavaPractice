import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

// censors words found in bad.txt from a target file
public class CensorWords extends JFrame implements ActionListener {

    // dimensions of the window
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;

    // the bad words, the document as is, and its censored form
    private JTextArea badText, originalText, censoredText;
    private JButton loadFile, saveFile;
    
    // the dictionary of words to remove from the text.
    private Dictionary badWords;
    
    public void begin() {
        badText = new JTextArea();
        originalText = new JTextArea();
        censoredText = new JTextArea();
        
        Container content = getContentPane();
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 1));
        
        JScrollPane sp = new JScrollPane(badText);
        sp.setBorder(BorderFactory.createTitledBorder("Bad Words"));
        p.add(sp);
        
        sp = new JScrollPane(originalText);
        sp.setBorder(BorderFactory.createTitledBorder("Original"));
        p.add(sp);
        
        sp = new JScrollPane(censoredText);
        sp.setBorder(BorderFactory.createTitledBorder("Censored"));
        p.add(sp);
        
        content.add(p, BorderLayout.CENTER);
        p = new JPanel();
        
        loadFile = new JButton("Load File");
        loadFile.addActionListener(this);
        p.add(loadFile);
        
        saveFile = new JButton("Save Censored");
        saveFile.addActionListener(this);
        p.add(saveFile);
        
        content.add(p, BorderLayout.SOUTH);
        validate();
        
        createDictionary();
    }
    
    // create the dictionary by reading the contents
    // of "bad.txt", which should be in the source folder
    private void createDictionary() {
        badWords = new Dictionary();
        try {
            BufferedReader in = new BufferedReader(new FileReader("bad.txt"));
            
            // process each line by addiing it to the dictionary
            String s = in.readLine();
            while (s != null) {
                badWords.add(s);
                s = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        badText.setText(badWords.toString());
    }
    
    // load in a file and put the original and censored versions
    // into the text areas.
    private void loadFile() {
        JFileChooser chooser = new JFileChooser();
        originalText.setText("");
        censoredText.setText("");
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                
                BufferedReader input = 
                    new BufferedReader(new FileReader(file));
                
                // process each line by adding it to the original
                // text window, and by replacing all the bad
                // words and putting it in the censored window.
                String line = input.readLine();
                while (line != null) {
                    String result = badWords.replaceMatches(line, "*****");
                    originalText.append(line + "\n");
                    censoredText.append(result + "\n");
                    line = input.readLine();
                }
                input.close();
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }
    
    // writes the censored version to the given file.
    private void saveFile() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                
                PrintWriter out = new PrintWriter(new FileWriter(file));
                out.println(censoredText.getText());
                out.close();
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == loadFile) {
            loadFile();
        } else {
            saveFile();
        }
    }

    public static void main ( String[] args ) {
        CensorWords self = new CensorWords();

        self.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        self.setTitle("Censor Words");

        self.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        self.setVisible(true);

        self.begin();
    }

}
