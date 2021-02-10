package fr.afpa.collection.gestionecole.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class MenuBar extends JFrame {
    
    /* Construction de l'interface graphique */
    public MenuBar() {
        super( "Mon école" );
        this.setSize(600,400);
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        
        // Construction et injection de la barre de menu
        this.setJMenuBar( this.createMenuBar() );
    }


    /* Methode de construction de la barre de menu */
    private JMenuBar createMenuBar() {

        // La barre de menu à proprement parler
        JMenuBar menuBar = new JMenuBar();

        // Définition du menu déroulant "File" et de son contenu
        JMenu mnuFile = new JMenu( "Salles" );
        mnuFile.setMnemonic( 'F' );

        JMenuItem mnuNewFile = new JMenuItem( "Nouvelle salle" );
        mnuNewFile.setIcon( new ImageIcon( "icons/new.png" ) );
        mnuNewFile.setMnemonic( 'N' );
        mnuNewFile.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK) );
        mnuNewFile.addActionListener( this::mnuNewListener );
        mnuFile.add(mnuNewFile);

        mnuFile.addSeparator();

        JMenuItem mnuOpenFile = new JMenuItem( "Chercher Salle" );
        mnuOpenFile.setIcon( new ImageIcon( "icons/open.png" ) );
        mnuOpenFile.setMnemonic( 'O' );
        mnuOpenFile.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK) );
        mnuFile.add(mnuOpenFile);

        JMenuItem mnuSaveFile = new JMenuItem( "Liste des salles" );
        mnuSaveFile.setIcon( new ImageIcon( "icons/save.png" ) );
        mnuSaveFile.setMnemonic( 'S' );
        mnuSaveFile.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK) );
        mnuFile.add(mnuSaveFile);

        JMenuItem mnuSaveFileAs = new JMenuItem( "Save File As ..." );
        mnuSaveFileAs.setIcon( new ImageIcon( "icons/save_as.png" ) );
        mnuSaveFileAs.setMnemonic( 'A' );
        mnuFile.add(mnuSaveFileAs);

        mnuFile.addSeparator();

        JMenuItem mnuExit = new JMenuItem( "Exit" );
        mnuExit.setIcon( new ImageIcon( "icons/exit.png" ) );
        mnuExit.setMnemonic( 'x' );
        mnuExit.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK) );
        mnuFile.add(mnuExit);
        
        menuBar.add(mnuFile);
        
        // Définition du menu déroulant "Edit" et de son contenu
        JMenu mnuEdit = new JMenu( "Eleves" );
        mnuEdit.setMnemonic( 'E' );
        
        JMenuItem mnuUndo = new JMenuItem( "Ajouter Elève" );
        mnuUndo.setIcon( new ImageIcon( "icons/undo.png" ) );
        mnuUndo.setMnemonic( 'U' );
        mnuUndo.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK) );
        mnuEdit.add(mnuUndo);
        
        JMenuItem mnuRedo = new JMenuItem( "Chercher Elève" );
        mnuRedo.setIcon( new ImageIcon( "icons/redo.png" ) );
        mnuRedo.setMnemonic( 'R' );
        mnuRedo.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK) );
        mnuEdit.add(mnuRedo);
        
        mnuEdit.addSeparator();
        
        JMenuItem mnuCopy = new JMenuItem( "Liste des éleves" );
        mnuCopy.setIcon( new ImageIcon( "icons/copy.png" ) );
        mnuCopy.setMnemonic( 'C' );
        mnuCopy.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK) );
        mnuEdit.add(mnuCopy);
        
        JMenuItem mnuCut = new JMenuItem( "Supprimer Eleve" );
        mnuCut.setIcon( new ImageIcon( "icons/cut.png" ) );
        mnuCut.setMnemonic( 't' );
        mnuCut.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK) );
        mnuEdit.add(mnuCut);
        
        JMenuItem mnuPaste = new JMenuItem( "Paste" );
        mnuPaste.setIcon( new ImageIcon( "icons/paste.png" ) );
        mnuPaste.setMnemonic( 'P' );
        mnuPaste.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK) );
        mnuEdit.add(mnuPaste);

        menuBar.add(mnuEdit);

        // Définition du menu déroulant "Help" et de son contenu
        JMenu mnuHelp = new JMenu( "Contact" );
        mnuHelp.setMnemonic( 'H' );
        
        menuBar.add( mnuHelp );
        
        return menuBar;
    }

    public void mnuNewListener( ActionEvent event ) {
        JOptionPane.showMessageDialog( this, "Button clicked !" );
    }
   
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        MenuBar frame = new MenuBar();
        frame.setVisible(true);
    }
}