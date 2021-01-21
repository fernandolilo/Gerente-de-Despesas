/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import View.Inicio;
import View.Login;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.LoginBean;

/**
 *
 * @author Rcell Asus
 */
public class LoginDAO {

    public boolean checkLogin(String Login, String Senha) throws ClassNotFoundException {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT  login, perfil FROM prestecontas.login WHERE Senha = ? and Login = ?");
            stmt.setString(2, Login);
            stmt.setString(1, Senha);

            LoginBean l = new LoginBean();
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
               
                check = true;
                l.setPerfil(rs.getString("perfil"));
               // System.out.println(l.getPerfil());
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
      

}
