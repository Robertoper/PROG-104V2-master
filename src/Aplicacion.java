import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Aplicacion {
    private JPanel pnlBase;
    private JComboBox cmbElegir;
    private JButton btnEliminar;
    private JButton btnListar;
    private JButton btnBuscar;
    private JButton btnCrear;
    private JLabel iblMenu;

    private JDialog comunicacion;

    private ArrayList<Alumno> listaAlumno=new ArrayList<>();
    private ArrayList<Profesor> listaProfesor=new ArrayList<>();

    public Aplicacion(){
        if (cmbElegir.getSelectedItem()=="Estudiante"){
            btnCrear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    comunicacion =new VentanaCreacion(listaAlumno);
                }
            });

            btnListar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    comunicacion=new VentanaListarAlumno(listaAlumno);
                }
            });
        }else if (cmbElegir.getSelectedItem()=="Profesor"){
            btnCrear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    comunicacion =new VentanaProfesor(listaProfesor);
                }
            });

            btnListar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    comunicacion=new VentanaListarProfesor(listaProfesor);
                }
            });
        }

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion");
        frame.setContentPane(new Aplicacion().pnlBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);
    }
}
