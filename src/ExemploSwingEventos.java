import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExemploSwingEventos {

   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public ExemploSwingEventos(){
      preparaGUI();
   }

   public static void main(String[] args){
	   ExemploSwingEventos exemplo = new ExemploSwingEventos();  
	   exemplo.mostrarExemplo();       
   }
      
   private void preparaGUI(){
      mainFrame = new JFrame("Exemplo Java SWING");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        

      statusLabel.setSize(350,100);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
	        System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void mostrarExemplo(){
      headerLabel.setText("Transportadora união"); 

      JButton okButton = new JButton("Cadastro de veículo");
      JButton submitButton = new JButton("Nova viagem");
      //JButton cancelButton = new JButton("Cancelar");

      okButton.setActionCommand("Cadastro de veículo");
      submitButton.setActionCommand("Nova viagem");
     // cancelButton.setActionCommand("Cancelar");

      okButton.addActionListener(new ButtonClickListener()); 
      submitButton.addActionListener(new ButtonClickListener()); 
     // cancelButton.addActionListener(new ButtonClickListener()); 

      controlPanel.add(okButton);
      controlPanel.add(submitButton);
     // controlPanel.add(cancelButton);       

      mainFrame.setVisible(true); 
   }

   private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         if( command.equals( "Cadastro de veículo" ))  {
            statusLabel.setText("Botão Cadastro de veículo apertado.");
         }
         else if( command.equals( "Nova viagem" ) )  {
            statusLabel.setText("Botão Nova viagem apertado."); 
         }
         //else  {
           // statusLabel.setText("Botão Cancelar apertado.");
         //}  	
      }		
   }
}
