package opciones.operacionesmatematicas;

import menu.Menu;

import javax.swing.*;


public class OperacionesMatematicas extends JFrame{
    private JPanel operacionesmatematicas;
    private JTextField txtnumero1;
    private JTextField txtnumero2;
    private JButton btnmultiplicar;
    private JButton btndividir;
    private JButton btnrestar;
    private JButton btnsalir;
    private JPanel lblresultado;

    public OperacionesMatematicas() {
        add(operacionesmatematicas);
        setTitle("Opciones De Matematicas");
        setSize(500,600);

          btnsalir.addActionListener(e ->{
                Menu menu= new Menu();
                menu.setVisible(true);
                esconderventana();
        });
    }
    private void esconderventana() {
        this.dispose();
    }
}
