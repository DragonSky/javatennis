/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatennis;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author stewartpj
 */
public class KeyboardExample extends JPanel {
    public KeyboardExample(){
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Mini Tennis");
        KeyboardExample keyboardExample = new KeyboardExample();
        frame.add(keyboardExample);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static class MyKeyListener implements KeyListener {
      

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
                    }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
        }
    }
}
