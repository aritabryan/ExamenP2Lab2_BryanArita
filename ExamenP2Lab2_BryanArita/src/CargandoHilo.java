
import javax.swing.JTextArea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class CargandoHilo implements Runnable {

    private JTextArea textArea;

    public CargandoHilo(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void run() {
        try {
            textArea.setText("Cargando...\n");
            System.out.println("Cargando...\n");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
