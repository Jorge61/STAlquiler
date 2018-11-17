package controller;

import dao.UbigeoD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.UbigeoM;
import vista.UbigeoF;

public class UbigeoC implements ActionListener {

    private UbigeoM ubM;
    private UbigeoD ubD;
    private UbigeoF Frmub;

    public UbigeoC(UbigeoM ubM, UbigeoD ubD, UbigeoF Frmub) {
        this.ubM = ubM;
        this.ubD = ubD;
        this.Frmub = Frmub;
        this.Frmub.btnGuardar.addActionListener(this);

    }

    public void iniciar() {
        Frmub.setTitle("Ubigeo");
        Frmub.setLocationRelativeTo(null);
        Frmub.txtID.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Frmub.btnGuardar) {
            ubM.setCODIGO(Frmub.txtCodigo.getText());
            ubM.setPROVUBI(Frmub.txtProv.getText());
            ubM.setDISTUBI(Frmub.txtDist.getText());

            if (ubD.registrar(ubM)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
//                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
//                limpiar();
            }
        }
    }

}
