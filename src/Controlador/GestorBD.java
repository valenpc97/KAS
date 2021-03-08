package Controlador;

import Model.Barrios;
import Model.DiasSemana;
import Model.Docentes;
import Model.Empleados;
import Model.EstadosCiviles;
import Model.Estudiantes;
import Model.Familias;
import Model.Horarios;
import Model.Localidades;
import Model.Nacionalidades;
import Model.Salas;
import Model.SalasHorarios;
import Model.TiposDocentes;
import Model.TiposDocumentos;
import Model.TiposEmpleados;
import Model.TiposLogins;
import Model.TiposRecibos;
import Model.Tutores;
import Model.Usuarios;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorBD {

    private static final String PASS = "123";
    private static final String USER = "sa";
    private static final String CADENA = "jdbc:sqlserver://DESKTOP-ANUONV0:1433;databaseName=KASprueba";

    //---------METODO LISTAR TIPOS DOCUMENTOS---COMBO----------
    public ArrayList<TiposDocumentos> getDocumentos() {
        ArrayList<TiposDocumentos> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from TiposDocumentos");

            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);

                list.add(new TiposDocumentos(id, descripcion));
            }

            rs.close();
            st.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR TIPOS DOCENTES---COMBO----------
    public ArrayList<TiposDocentes> getTiposDocentes() {
        ArrayList<TiposDocentes> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from TiposDocentes");
            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);
                list.add(new TiposDocentes(id, descripcion));
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR TIPOS EMPLEADOS---COMBO----------
    public ArrayList<TiposEmpleados> getTiposEmpleados() {
        ArrayList<TiposEmpleados> list = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from TiposEmpleados");
            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);
                list.add(new TiposEmpleados(id, descripcion));
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR TIPOS LOGINS---COMBO-------------
    public ArrayList<TiposLogins> getTiposLogins() {
        ArrayList<TiposLogins> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from TiposLogins");
            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);
                list.add(new TiposLogins(id, descripcion));
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }
    
    //---------METODO LISTAR TIPOS RECIBOS---COMBO-----------
    public ArrayList<TiposRecibos> getTiposRecibos(){
        ArrayList<TiposRecibos> list = new ArrayList<>();
        
        try {
             Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from TiposRecibos");
            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);
                list.add(new TiposRecibos(id, descripcion));
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return list;
    }

    //---------METODO LISTAR NACIONALIDADES---COMBO----------
    public ArrayList<Nacionalidades> getNacionalidades() {
        ArrayList<Nacionalidades> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from Nacionalidades");
            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);
                list.add(new Nacionalidades(id, descripcion));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR ESTADOS CIVILES---COMBO----------
    public ArrayList<EstadosCiviles> getEstadosCiviles() {
        ArrayList<EstadosCiviles> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from EstadosCiviles");

            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);

                list.add(new EstadosCiviles(id, descripcion));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR LOCALIDADES---COMBO----------
    public ArrayList<Localidades> getLocalidades() {
        ArrayList<Localidades> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from Localidades");

            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);

                list.add(new Localidades(id, descripcion));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR BARRIOS---COMBO----------
    public ArrayList<Barrios> getBarrios() {
        ArrayList<Barrios> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select idBarrio, descripcion, idLocalidad from Barrios\n"
                    + "order by descripcion asc");

            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);
                int idLocalidad = rs.getInt(3);

                list.add(new Barrios(id, descripcion, idLocalidad));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR DIAS DE SEMANA---COMBO-----------------
    public ArrayList<DiasSemana> getDiasSemana() {
        ArrayList<DiasSemana> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from diasSemana");
            while (rs.next()) {
                int id = rs.getInt(1);
                String descripcion = rs.getString(2);
                list.add(new DiasSemana(id, descripcion));
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR HORARIO---COMBO----------------
    public ArrayList<Horarios> getHorarios() {
        ArrayList<Horarios> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select * from Horarios");
            while (rs.next()) {
                int idHorario = rs.getInt(1);
                String horarioComienzo = rs.getString(2);
                String horarioSalida = rs.getString(3);

                list.add(new Horarios(idHorario, horarioComienzo, horarioSalida));
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return list;
    }

    //---------METODO LISTAR SALAS HORARIOS---TABLA---------
    public ArrayList<SalasHorarios> getSalaHorario() {
        ArrayList<SalasHorarios> list = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select sh.idSalaHorario, s.idSala, s.descripcion, h.idHorario, "
                    + "h.horarioComienzo + ' - ' + h.horarioFinaliza 'Horario', ds.idDiaSemana, ds.descripcionDia, "
                    + "d.idDocente, p.nombre + '  ' + p.apellido 'Docente', td.idTipoDocente, td.descripcion "
                    + "from salasHorarios sh join Salas s on s.idSala = sh.idSala "
                    + "					  join Horarios h on h.idHorario = sh.idHorario "
                    + "					  join Docentes d on d.idDocente = sh.idDocente "
                    + "					  join Personas p on p.idPersona = d.idPersona "
                    + "					  join diasSemana ds on ds.idDiaSemana = sh.diaSemana "
                    + "					  join tiposDocentes td on td.idTipoDocente = d.idTipoDocente");

            while (rs.next()) {
                int idSalaHorario = rs.getInt(1);
                int idSala = rs.getInt(2);
                String nombreSala = rs.getString(3);
                int idHorario = rs.getInt(4);
                String horario = rs.getString(5);
                int diaSemana = rs.getInt(6);
                String descripcionDia = rs.getString(7);
                int idDocente = rs.getInt(8);
                String docente = rs.getString(9);
                int idTipoDocente = rs.getInt(10);
                String materiaDocente = rs.getString(11);

                list.add(new SalasHorarios(idSalaHorario, idSala, nombreSala, idHorario, horario, idDocente, docente, idTipoDocente, materiaDocente, diaSemana, descripcionDia));

            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //---------METODO LISTAR SALAS HORARIOS---LISTA---------
    public ArrayList<SalasHorarios> getSalasHorarios(int idSalaH) {
        ArrayList<SalasHorarios> list = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select sh.idSalaHorario, s.idSala, s.descripcion, h.idHorario, "
                    + "h.horarioComienzo + ' - ' + h.horarioFinaliza 'Horario', ds.idDiaSemana, ds.descripcionDia, "
                    + "d.idDocente, p.nombre + '  ' + p.apellido 'Docente', td.idTipoDocente, td.descripcion "
                    + "from salasHorarios sh join Salas s on s.idSala = sh.idSala "
                    + "					  join Horarios h on h.idHorario = sh.idHorario "
                    + "					  join Docentes d on d.idDocente = sh.idDocente "
                    + "					  join Personas p on p.idPersona = d.idPersona "
                    + "					  join diasSemana ds on ds.idDiaSemana = sh.diaSemana "
                    + "					  join tiposDocentes td on td.idTipoDocente = d.idTipoDocente");

            while (rs.next()) {
                int idSalaHorario = rs.getInt(1);
                int idSala = rs.getInt(2);
                String nombreSala = rs.getString(3);
                int idHorario = rs.getInt(4);
                String horario = rs.getString(5);
                int diaSemana = rs.getInt(6);
                String descripcionDia = rs.getString(7);
                int idDocente = rs.getInt(8);
                String docente = rs.getString(9);
                int idTipoDocente = rs.getInt(10);
                String materiaDocente = rs.getString(11);

                list.add(new SalasHorarios(idSalaHorario, idSala, nombreSala, idHorario, horario, idDocente, docente, idTipoDocente, materiaDocente, diaSemana, descripcionDia));

            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //---------METODO LISTAR TUTORES---TABLA----------------
    public ArrayList<Tutores> getTutores() {
        ArrayList<Tutores> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select idTutor, parentesco, nombre, apellido, idTipoDocumento, documento, "
                    + "idNacionalidad, genero, idBarrio, domicilio, idEstadoCivil, email, celular, telefono, idFamilia from Personas p join Tutores t on p.idPersona = t.idPersona where bajaLogica = 0");

            while (rs.next()) {
                int idTutor = rs.getInt(1);
                String parentesco = rs.getString(2);
                String nombre = rs.getString(3);
                String apellido = rs.getString(4);
                int idTipoDocumento = rs.getInt(5);
                int documento = rs.getInt(6);
                int idNacionalidad = rs.getInt(7);
                String genero = rs.getString(8);
                int idBarrio = rs.getInt(9);
                String domicilio = rs.getString(10);
                int idEstadoCivil = rs.getInt(11);
                String email = rs.getString(12);
                String celular = rs.getString(13);
                String telefono = rs.getString(14);
                int idFamilia = rs.getInt(15);

                list.add(new Tutores(idTutor, parentesco, idEstadoCivil, celular, telefono, email, idFamilia, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio));

            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    //---------METODO LISTAR ESTUDIANTES---TABLA----------
    public ArrayList<Estudiantes> getEstudiantes() {
        ArrayList<Estudiantes> list = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select idEstudiante, nombre, apellido, fechaNac, genero, domicilio, "
                    + "idTipoDocumento, documento, idBarrio, idNacionalidad, idFamilia from Personas p join Estudiantes e on p.idPersona = e.idPersona where bajaLogica = 0");

            while (rs.next()) {
                int idEstudiante = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                Date fechaNac = rs.getDate(4);
                String genero = rs.getString(5);
                String domicilio = rs.getString(6);
                int idTipoDocumento = rs.getInt(7);
                int documento = rs.getInt(8);
                int idBarrio = rs.getInt(9);
                int idNacionalidad = rs.getInt(10);
                int idFamilia = rs.getInt(11);

                list.add(new Estudiantes(idEstudiante, fechaNac, idFamilia, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio));

            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    //---------METODO LISTAR DOCENTES----TABLA-----------
    public ArrayList<Docentes> getDocentes() {
        ArrayList<Docentes> list = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select idDocente, descripcion, nombre, apellido,idTipoDocumento, documento, idNacionalidad, fechaNac, genero,idBarrio, domicilio, idEstadoCivil, email, celular, telefono, fechaAlta, fechaBaja\n"
                    + "from Personas p join Docentes d on p.idPersona = d.idPersona join TiposDocentes td on td.idTipoDocente = d.idTipoDocente where bajaLogica = 0");

            while (rs.next()) {
                int idDocente = rs.getInt(1);
                String descripcion = rs.getString(2);
                String nombre = rs.getString(3);
                String apellido = rs.getString(4);
                int idTipoDocumento = rs.getInt(5);
                int documento = rs.getInt(6);
                int idNacionalidad = rs.getInt(7);
                Date fechaNac = rs.getDate(8);
                String genero = rs.getString(9);
                int idBarrio = rs.getInt(10);
                String domicilio = rs.getString(11);
                int idEstadoCivil = rs.getInt(12);
                String email = rs.getString(13);
                String celular = rs.getString(14);
                String telefono = rs.getString(15);
                Date fechaAlta = rs.getDate(16);
                Date fechaBaja = rs.getDate(17);

                list.add(new Docentes(idDocente, fechaNac, email, telefono, celular, descripcion, idEstadoCivil, fechaAlta, fechaBaja, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //---------METODO LISTAR EMPLEADOS---TABLA-----------
    public ArrayList<Empleados> getEmpleados() {
        ArrayList<Empleados> list = new ArrayList<>();

        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select idEmpleado, descripcion, nombre, apellido,idTipoDocumento, documento, idNacionalidad, fechaNac, genero,idBarrio, domicilio, idEstadoCivil, email, celular, telefono, fechaAlta, fechaBaja\n"
                    + "from Personas p join Empleados em on p.idPersona = em.idPersona join TiposEmpleados te on te.idTipoEmpleado = em.idTipoEmpleado");

            while (rs.next()) {
                int idEmpleado = rs.getInt(1);
                String descripcion = rs.getString(2);
                String nombre = rs.getString(3);
                String apellido = rs.getString(4);
                int idTipoDocumento = rs.getInt(5);
                int documento = rs.getInt(6);
                int idNacionalidad = rs.getInt(7);
                Date fechaNac = rs.getDate(8);
                String genero = rs.getString(9);
                int idBarrio = rs.getInt(10);
                String domicilio = rs.getString(11);
                int idEstadoCivil = rs.getInt(12);
                String email = rs.getString(13);
                String celular = rs.getString(14);
                String telefono = rs.getString(15);
                Date fechaAlta = rs.getDate(16);
                Date fechaBaja = rs.getDate(17);

                list.add(new Empleados(fechaNac, email, telefono, celular, idEmpleado, idEstadoCivil, fechaAlta, fechaBaja, descripcion, nombre, apellido, idTipoDocumento, documento, idBarrio, idNacionalidad, genero, domicilio));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    //---------METODO LISTAR USUARIOS---TABLA------------
    public ArrayList<Usuarios> getUsuarios() {
        ArrayList<Usuarios> list = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select idLogin,usuario,clave,decripcion,tl.idTipoLogin from Usuarios u join tiposLogins tl on tl.idTipoLogin = u.idTipoLogin");

            while (rs.next()) {
                int idUsuario = rs.getInt(1);
                String usuario = rs.getString(2);
                String clave = rs.getString(3);
                String descripcion = rs.getString(4);
                int idTipoLogin = rs.getInt(5);

                list.add(new Usuarios(idUsuario, usuario, clave, descripcion, idTipoLogin));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //---------METODO LISTAR FAMILIAS---TABLA------------
    public ArrayList<Familias> getFamilias() {
        ArrayList<Familias> list = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("Select * from familias where bajaLogica = 0");

            while (rs.next()) {
                int idFamilia = rs.getInt(1);
                String apellidoFamilia = rs.getString(2);
                String apellidoFamiliaDos = rs.getString(3);

                list.add(new Familias(idFamilia, apellidoFamilia, apellidoFamiliaDos));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //---------METODO LISTAR SALAS---TABLA---------------
    public ArrayList<Salas> getSalas() {
        ArrayList<Salas> list = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select idSala, descripcion, turno, horarioEntrada, horarioSalida from salas");

            while (rs.next()) {
                int idSala = rs.getInt(1);
                String descripcion = rs.getString(2);
                String turno = rs.getString(3);
                String horarioEntrada = rs.getString(4);
                String horarioSalida = rs.getString(5);

                list.add(new Salas(idSala, descripcion, turno, horarioEntrada, horarioSalida));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //---------METODO AGREGAR ESTUDIANTE---FORMULARIO----
    public void AgregarEstudiante(Estudiantes est) {
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("exec procInsertEstudiantes ?,?,?,?,?,?,?,?,?");

            ps.setString(1, est.getNombre());
            ps.setString(2, est.getApellido());
            ps.setInt(3, est.getIdTipoDocumento());
            ps.setInt(4, est.getDocumento());
            ps.setInt(5, est.getIdNacionalidad());
            ps.setDate(6, est.getFechaNac());
            ps.setString(7, est.getGenero());
            ps.setInt(8, est.getIdBarrio());
            ps.setString(9, est.getDomicilio());

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error metodo AGREGAR ESTUDIANTE " + e);
        }
    }

    //---------METODO ELIMINAR ESTUDIANTE-----------------
    public int EliminarEstudiante(int id) {
        int filasAfectadas = 0;
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("exec eliminarEstudiante ?");
            ps.setInt(1, id);
            filasAfectadas = ps.executeUpdate();

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return filasAfectadas;
    }

    //---------METODO MODIFICAR ESTUDIANTE----------------
    public void ModificarEstudiante(Estudiantes estu) {
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("update e "
                    + "set e.fechaNac = ?, e.idSala = ? "
                    + "from Estudiantes e join Personas p on e.idPersona = p.idPersona "
                    + "where idEstudiante = ? "
                    + "update p "
                    + "set nombre = ?, apellido = ?,idTipoDocumento = ?, documento = ?, genero = ?,idNacionalidad = ?,idBarrio = ?, domicilio = ? "
                    + "from Estudiantes e join Personas p on e.idPersona = p.idPersona "
                    + "where idEstudiante = ? ");

            ps.setDate(1, estu.getFechaNac());
            ps.setInt(2, estu.getIdSala());
            ps.setInt(3, estu.getIdEstudiante());
            ps.setString(4, estu.getNombre());
            ps.setString(5, estu.getApellido());
            ps.setInt(6, estu.getIdTipoDocumento());
            ps.setInt(7, estu.getDocumento());
            ps.setString(8, estu.getGenero());
            ps.setInt(9, estu.getIdNacionalidad());
            ps.setInt(10, estu.getIdBarrio());
            ps.setString(11, estu.getDomicilio());
            ps.setInt(12, estu.getIdEstudiante());

            ps.executeUpdate();

            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("No modifica al estudiante " + ex);
        }
    }

    //---------METODO INICIO DE SESION--------------------
    public boolean existeUsuario(String usuario, String password, int id_tipoLogin) throws SQLException {
        boolean existe = false;

        Connection con = DriverManager.getConnection(CADENA, USER, PASS);

        String sql = "select * from Usuarios WHERE usuario = ? AND clave = ? AND idTipoLogin = ?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, usuario);
        st.setString(2, password);
        st.setInt(3, id_tipoLogin);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            existe = true;
        }
        rs.close();
        st.close();
        con.close();

        return existe;
    }

    //---------METODO MODIFICAR TUTOR---------------------
    public void ModificarTutores(Tutores t) {
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("update t "
                    + "set t.parentesco = ?, t.idEstadoCivil = ?, t.email = ?, t.celular = ?, t.telefono = ? "
                    + "from Tutores t join Personas p on p.idPersona = t.idPersona "
                    + "where idTutor = ? "
                    + "update p "
                    + "set nombre = ?, apellido = ?,idTipoDocumento = ?, documento = ?, genero = ?,idNacionalidad = ?,idBarrio = ?, domicilio = ? "
                    + "from Tutores t join Personas p on p.idPersona = t.idPersona "
                    + "where idTutor = ?");

            ps.setString(1, t.getParentesco());
            ps.setInt(2, t.getIdEstadoCivil());
            ps.setString(3, t.getEmail());
            ps.setString(4, t.getCelular());
            ps.setString(5, t.getTelefono());
            ps.setInt(6, t.getIdTutor());
            ps.setString(7, t.getNombre());
            ps.setString(8, t.getApellido());
            ps.setInt(9, t.getIdTipoDocumento());
            ps.setInt(10, t.getDocumento());
            ps.setString(11, t.getGenero());
            ps.setInt(12, t.getIdNacionalidad());
            ps.setInt(13, t.getIdBarrio());
            ps.setString(14, t.getDomicilio());
            ps.setInt(15, t.getIdTutor());

            ps.executeUpdate();

            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("No modifica al tutor " + ex);
        }
    }

    //---------METODO ELIMINAR TUTOR----------------------
    public int EliminarTutor(int idTutorDelete) {
        int filasAfectadas = 0;
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("delete from Tutores where idTutor = ?");
            ps.setInt(1, idTutorDelete);
            filasAfectadas = ps.executeUpdate();

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return filasAfectadas;
    }

    //---------METODO MODIFICAR SALAS---------------------
    public void ModificarSala(Salas s) {
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("update Salas set descripcion = ?, turno = ?, horarioEntrada = ?, horarioSalida = ? "
                    + "where idSala = ?");

            ps.setString(1, s.getDescripcion());
            ps.setString(2, s.getTurno());
            ps.setString(3, s.getHoraEntrada());
            ps.setString(4, s.getHoraSalida());
            ps.setInt(5, s.getIdSala());

            ps.executeUpdate();

            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("No modifica a la sala " + ex);
        }
    }

    //---------METODO ELIMINAR SALAS----------------------
    public int EliminarSala(int idSalDelete) {
        int filasAfectadas = 0;
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("delete from Salas where idSala = ?");
            ps.setInt(1, idSalDelete);
            filasAfectadas = ps.executeUpdate();

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return filasAfectadas;
    }

    //---------METODO MODIFICAR USUARIOS------------------
    public void ModificarUsuario(Usuarios u) {
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            
            PreparedStatement ps = conexion.prepareStatement("update Usuarios set usuario = ?, clave = ?, idTipoLogin = ?\n"
                    + "where idLogin = ?");

            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getClave());
            ps.setInt(3, u.getIdTipoLogin());
            ps.setInt(4, u.getIdLogin());
            
            System.out.println("idLogin:  " +u.getIdLogin());
            ps.executeUpdate();

            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("No modifica al usuario " + ex);
        }
    }

    //---------METODO ELIMINAR USUARIOS-------------------
    public int EliminarUsuario(int idUserDelete) {
        int filasAfectadas = 0;
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("delete from Usuarios where idLogin = ?");
            ps.setInt(1, idUserDelete);
            filasAfectadas = ps.executeUpdate();

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return filasAfectadas;
    }

    //---------METODO ELIMINAR SALA HORARIO----------------
    public int EliminarSalaHorario(int idCronoDelete) {
        int filasAfectadas = 0;
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("delete from salasHorarios where idSalaHorario = ?");
            ps.setInt(1, idCronoDelete);
            filasAfectadas = ps.executeUpdate();

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return filasAfectadas;
    }

    //---------METODO MODIFICAR SALA HORARIO---------------
    public void ModificarSalaHorario(SalasHorarios sh) {
        System.out.println(sh.toString());
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("update salasHorarios "
                    + "set idSala = ?, idHorario = ?, idDocente = ?, diaSemana = ? "
                    + "where idSalaHorario = ?");

            ps.setInt(1, sh.getIdSala());
            ps.setInt(2, sh.getIdHorario());
            ps.setInt(3, sh.getIdDocente());
            ps.setInt(4, sh.getDiaSemana());
            ps.setInt(5, sh.getIdSalaHorario());

            ps.executeUpdate();

            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("No modifica a la salaHorario " + ex);
        }
    }

    //---------METODO MODIFICAR EMPLEADOS------------------
    public void ModificarEmpleado(Empleados e) {
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("update em\n"
                    + "set em.idTipoEmpleado = ?, em.fechaNac = ? , em.idEstadoCivil = ?, em.email = ?, em.celular = ?, em.telefono = ?, em.fechaAlta = ?, em.fechaBaja = ?\n"
                    + "from Empleados em join Personas p on p.idPersona = em.idPersona\n"
                    + "where idEmpleado = ?\n"
                    + "update p\n"
                    + "set nombre = ?, apellido = ?,idTipoDocumento = ?, documento = ?, genero = ?,idNacionalidad = ?,idBarrio = ?, domicilio = ?\n"
                    + "from Empleados em join Personas p on p.idPersona = em.idPersona\n"
                    + "where idEmpleado = ?");

            ps.setInt(1, e.getIdTipoEmpleado());
            ps.setDate(2, e.getFechaNac());
            ps.setInt(3, e.getIdEstadoCivil());
            ps.setString(4, e.getEmail());
            ps.setString(5, e.getCelular());
            ps.setString(6, e.getTelefono());
            ps.setDate(7, e.getFechaAlta());
            ps.setDate(8, e.getFechaBaja());
            ps.setInt(9, e.getIdEmpleado());
            ps.setString(10, e.getNombre());
            ps.setString(11, e.getApellido());
            ps.setInt(12, e.getIdTipoDocumento());
            ps.setInt(13, e.getDocumento());
            ps.setString(14, e.getGenero());
            ps.setInt(15, e.getIdNacionalidad());
            ps.setInt(16, e.getIdBarrio());
            ps.setString(17, e.getDomicilio());
            ps.setInt(18, e.getIdEmpleado());

            ps.executeUpdate();

            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("No modifica al docente " + ex);
        }
    }

    //---------METODO ELIMINAR EMPLEADOS------------------
    public int EliminarEmpleado(int idEmpleDelete) {
        int filasAfectadas = 0;
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("delete from Empleados where idEmpleado = ?");
            ps.setInt(1, idEmpleDelete);
            filasAfectadas = ps.executeUpdate();

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return filasAfectadas;
    }

    //---------METODO MODIFICAR DOCENTES------------------
    public void ModificarDocente(Docentes d) {
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("update d\n"
                    + "set d.idTipoDocente = ?, d.fechaNac = ? , d.idEstadoCivil = ?, d.email = ?, d.celular = ?, d.telefono = ?, d.fechaAlta = ?, d.fechaBaja = ?\n"
                    + "from Docentes d join Personas p on p.idPersona = d.idPersona\n"
                    + "where idDocente = ?\n"
                    + "update p\n"
                    + "set nombre = ?, apellido = ?,idTipoDocumento = ?, documento = ?, genero = ?,idNacionalidad = ?,idBarrio = ?, domicilio = ?\n"
                    + "from Docentes d join Personas p on p.idPersona = d.idPersona\n"
                    + "where idDocente = ?");

            ps.setInt(1, d.getIdTipoDocente());
            ps.setDate(2, d.getFechaNac());
            ps.setInt(3, d.getIdEstadoCivil());
            ps.setString(4, d.getEmail());
            ps.setString(5, d.getCelular());
            ps.setString(6, d.getTelefono());
            ps.setDate(7, d.getFechaAlta());
            ps.setDate(8, d.getFechaBaja());
            ps.setInt(9, d.getIdDocente());
            ps.setString(10, d.getNombre());
            ps.setString(11, d.getApellido());
            ps.setInt(12, d.getIdTipoDocumento());
            ps.setInt(13, d.getDocumento());
            ps.setString(14, d.getGenero());
            ps.setInt(15, d.getIdNacionalidad());
            ps.setInt(16, d.getIdBarrio());
            ps.setString(17, d.getDomicilio());
            ps.setInt(18, d.getIdDocente());

            ps.executeUpdate();

            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("No modifica al docente " + ex);
        }
    }

    //---------METODO ELIMINAR DOCENTES-------------------
    public int EliminarDocente(int idDocDelete) {
        int filasAfectadas = 0;
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("delete from Docentes where idDocente = ?");
            ps.setInt(1, idDocDelete);
            filasAfectadas = ps.executeUpdate();

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return filasAfectadas;
    }

    //---------METODO MODIFICAR FAMILIA-------------------
    public void ModificarFamilia(Familias f) {
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("update Familias set apellidoFamilia = ?, apellidoFamiliaDos = ?\n"
                    + "where idFamilia = ?");

            ps.setString(1, f.getApellidoFamilia());
            ps.setString(2, f.getApellidoFamiliaDos());
            ps.setInt(3, f.getIdFamilia());
            ps.executeUpdate();

            ps.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println("No modifica a la familia " + ex);
        }
    }

    //---------METODO ELIMINAR FAMILIA--------------------
    public int EliminarFamilia(int idFamiliaDelete) {
        int filasAfectadas = 0;
        try {
            Connection conexion = DriverManager.getConnection(CADENA, USER, PASS);
            PreparedStatement ps = conexion.prepareStatement("delete from Familias where idFamilia = ?");
            ps.setInt(1, idFamiliaDelete);
            filasAfectadas = ps.executeUpdate();

            ps.execute();
            ps.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return filasAfectadas;
    }
}
