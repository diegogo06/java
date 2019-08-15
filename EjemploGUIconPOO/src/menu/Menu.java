package menu;

import opciones.operacionesmatematicas.OperacionesMatematicas;

import javax.swing.*;

public class Menu extends JFrame{
    private JPanel menuprincipal;
    private JButton btnoperaciones;

    public Menu(){

        add(menuprincipal);
        setTitle("Menu Principal");
        setSize(500,600);
        btnoperaciones.addActionListener(e -> {

                OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
                operacionesMatematicas.setVisible(true);
                esconderventana();

        });
    }
    private void esconderventana() {
        this.dispose();
    }
}
