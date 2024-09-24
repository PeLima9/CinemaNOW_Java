/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

/**
 *
 * @author Administrador
 */
public class TextPrompt extends JLabel implements FocusListener, DocumentListener {
    private JTextComponent component;
    private Document document;

    public TextPrompt(String text, JTextComponent component) {
        this.component = component;
        this.document = component.getDocument();

        setText(text);
        setFont(component.getFont());
        setForeground(Color.GRAY);
        setBorder(BorderFactory.createEmptyBorder(component.getInsets().top, component.getInsets().left, component.getInsets().bottom, component.getInsets().right));
        setHorizontalAlignment(SwingConstants.LEADING);

        component.addFocusListener(this);
        document.addDocumentListener(this);

        component.setLayout(new BorderLayout());
        component.add(this);
        checkForPrompt();
    }

    public void checkForPrompt() {
        if (document.getLength() > 0) {
            setVisible(false);
        } else {
            setVisible(true);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        checkForPrompt();
    }

    @Override
    public void focusLost(FocusEvent e) {
        checkForPrompt();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        checkForPrompt();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        checkForPrompt();
    }
}
