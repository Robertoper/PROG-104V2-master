import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaProfesor extends JDialog{
    private JPanel pnlBase;
    private JLabel iblDocente;
    private JTextField txtDni;
    private JLabel iblDni;
    private JLabel iblNombre;
    private JTextField txtNombre;
    private JLabel iblAsignaturas;
    private JComboBox cmbAsignatura;
    private JButton btnButon;
    private String nombre;
    private String dni;
    private String asignatura;


    public VentanaProfesor(ArrayList<Profesor> listaProfesor) {
        setTitle("Ventana Creacion Profesor");
        setContentPane(pnlBase);
        setBounds(100,100,700,700);
        setVisible(true);
        btnButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Profesor nuevoProfesor=new Profesor(nombre,dni,asignatura);
                nuevoProfesor.setNombre(txtNombre.getText());
                nuevoProfesor.setDni(txtDni.getText());
                nuevoProfesor.setAsignatura(cmbAsignatura.getSelectedItem().toString());
                listaProfesor.add(nuevoProfesor);
                JOptionPane.showMessageDialog(null,"Profesor creado perfectamente");
            }
        });
    }
}
