import javax.swing.*;
import java.util.ArrayList;

public class VentanaListarProfesor extends JDialog {
    private JPanel panel1;
    private JLabel iblDocente;
    private JList lstProfes;

    public VentanaListarProfesor(ArrayList<Profesor> listaProfesor){
        DefaultListModel listModel = new DefaultListModel();
        for(int i=0; i<listaProfesor.size(); i++) {
            listModel.add(i,listaProfesor.get(i));
        }
        lstProfes.setModel(listModel);
        setTitle("Ventana Listar Alumnos");
        setContentPane(panel1);
        setBounds(100,100,700,700);
        setVisible(true);
    }
}
