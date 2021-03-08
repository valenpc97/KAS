package Controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import vistas.Directivo.ListaHorariosMañana;
import vistas.Directivo.abmCronograma;
import vistas.Directivo.abmSala;
import vistas.Directivo.abmUsuario;
import vistas.Directivo.principalDirectivo;
import vistas.Docente.abmEstudiante;
import vistas.Docente.abmFamilia;
import vistas.Docente.abmTutor;
import vistas.Docente.principalDocente;
import vistas.Inicio.Principal;
import vistas.Inicio.inicioSesion;

public class KASprueba {

    public static void main(String[] args) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KASprueba.class.getName()).log(Level.SEVERE, null, ex);
        }
//        abmEstudiante abme = new abmEstudiante();
//        abme.setVisible(true);
//        
//        inicioSesion is = new inicioSesion();
//        is.setVisible(true);

        Principal p = new Principal();
        p.setVisible(true);

//        principalDirectivo pd = new principalDirectivo();
//        pd.setVisible(true);

//        principalDocente pdoc = new principalDocente();
//        pdoc.setVisible(true);

//        abmTutor abmT = new abmTutor();
//        abmT.setVisible(true);

//        abmFamilia abmF = new abmFamilia();
//        abmF.setVisible(true);

//        abmUsuario abmu = new abmUsuario();
//        abmu.setVisible(true);

//        abmCronograma abmc = new abmCronograma();
//        abmc.setVisible(true);

//        abmSala abms = new abmSala();
//        abms.setVisible(true);
    }

}
