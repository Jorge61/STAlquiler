package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.UbigeoM;

public class UbigeoD extends Conectar {

    public boolean registrar(UbigeoM um) {
        PreparedStatement ps = null;
        Connection c = Conectar();

        String sql = "INSERT INTO UBIGEO (CODIGO, PROVUBI, DISTUBI) VALUES (?,?,?)";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, um.getCODIGO());
            ps.setString(2, um.getPROVUBI());
            ps.setString(3, um.getDISTUBI());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }

}
