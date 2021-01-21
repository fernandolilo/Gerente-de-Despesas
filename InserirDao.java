/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.InformesBean;
import model.bean.LoginBean;


/**
 *
 * @author Rcell Asus
 */
public class InserirDao {
    
    public void Login(LoginBean I) throws SQLException, ClassNotFoundException{
       
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
          
            try{
            stmt = con.prepareStatement("INSERT INTO login(cpf, nome, senha, perfil, login) VALUES (?, ?, ?, ?, ?)");
            //stmt.setInt(0,I.getId());
            stmt.setString(1, I.getCPF());
            stmt.setString(2, I.getNome());
            stmt.setString(3, I.getPerfil());
            stmt.setString(4, I.getSenha());
            stmt.setString(5, I.getLogin());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"INSERIDO COM SUCESSO");
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"ERRO AO SALVAR: " + ex);
                
            }
            finally
            {
                ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void create (InformesBean I) throws SQLException, ClassNotFoundException{
       
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            Date data = new Date();
            SimpleDateFormat simpli = new SimpleDateFormat("dd/MM/yyyy");
            
          
            try{
            stmt = con.prepareStatement("INSERT INTO informacoes(CPF, Tipo_Dispesa, valor_total_NF, valor_Apresentado, dia, saldo, fatura, valor_Total_Apresentado, valor_total_de_NFapresentado, funcionario, justificativa, gestor, Aprovacao,Id_Relatorio) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            //stmt.setInt(0,I.getId());
            stmt.setString(1,    I.getCpf());
            stmt.setString(2, I.getTipo());
            stmt.setDouble(3, I.getVtnf());
            stmt.setDouble(4, I.getValorAp());
            stmt.setString(5, I.getData());
            stmt.setDouble(6, I.getSaldo());
            stmt.setDouble(7, I.getFatura());
            stmt.setDouble(8, I.getValorTap());
            stmt.setDouble(9, I.getValotTNF());
            stmt.setString(10,I.getFuncionario());
            stmt.setString(11,I.getJustificativa());
            stmt.setString(12,I.getGestor());
            stmt.setString(13,I.getAprovacao());
            stmt.setInt(   14,I.getId_Relatorio());
           
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"INSERIDO COM SUCESSO");
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"ERRO AO SALVAR: " + ex);
                
            }
            finally
            {
                ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void updateAprovacao (InformesBean I) throws SQLException, ClassNotFoundException{
       
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
          
            try{
            stmt = con.prepareStatement("UPDATE  informacoes SET  Aprovacao = ?, Sefaz = ?  WHERE Id = ?");          
            stmt.setString(1,I.getAprovacao());
            stmt.setInt(3, I.getId());
            stmt.setInt(2, I.getSefaz());
             
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso");
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"ERRO AO ATUALIZAR: " + ex);
                
            }
            finally
            {
                ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void updateLOGIN (LoginBean I) throws SQLException, ClassNotFoundException{
       
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
          
            try{
            stmt = con.prepareStatement("UPDATE login SET cpf = ?, nome = ?, login = ?, senha = ? ,perfil =?  WHERE id = ?");          
            
           
            stmt.setString(1, I.getCPF());
            stmt.setString(2, I.getNome());
            stmt.setString(3, I.getLogin());
            stmt.setString(4, I.getSenha());
            stmt.setString(5, I.getPerfil());
            stmt.setInt   (6, I.getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso");
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"ERRO AO ATUALIZAR: " + ex);
                
            }
            finally
            {
                ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public void DeleteDespesa (InformesBean I) throws SQLException, ClassNotFoundException{
       
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
          
            try{
            stmt = con.prepareStatement("DELETE from INFORMACOES WHERE ID = ?");          
            stmt.setInt(1,I.getId());       
            
            stmt.executeUpdate();
                       
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso");
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"ERRO AO ATUALIZAR: " + ex);
                
            }
            finally
            {
                ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void DeleteLogin (LoginBean I) throws SQLException, ClassNotFoundException{
       
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
          
            try{
            stmt = con.prepareStatement("DELETE from Login  WHERE ID = ?");          
            
            stmt.setInt(1, I.getId());
            
            
           
            stmt.executeUpdate();
                       
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso");
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"ERRO AO ATUALIZAR: " + ex);
                
            }
            finally
            {
                ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void DeleteInfo (InformesBean I) throws SQLException, ClassNotFoundException{
       
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
          
            try{
            stmt = con.prepareStatement("DELETE from informacoes WHERE ID = ?");          
            
            stmt.setInt(1, I.getId());
            
            
           
            stmt.executeUpdate();
                       
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso");
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"ERRO AO ATUALIZAR: " + ex);
                
            }
            finally
            {
                ConnectionFactory.closeConnection(con, stmt);
        }
    }   
    
    
    public List<LoginBean> SelectLogin(String cpf) throws ClassNotFoundException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<LoginBean> log = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("Select * from login where cpf LIKE ?");
            stmt.setString(1, "%"+cpf+"%");
            rs = stmt.executeQuery();
            
                while(rs.next()){
                LoginBean i = new LoginBean();
                
                i.setCPF(rs.getString("cpf"));
                i.setNome(rs.getString("nome"));
                i.setPerfil(rs.getString("perfil"));
                i.setSenha(rs.getString("senha"));               
                i.setId(rs.getInt("Id"));
                i.setLogin(rs.getString("login"));
                log.add(i);
                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InserirDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
         ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return log;
    }
    
    
   
    
    public List<InformesBean> SelectDespesa(String Id_Relatorio) throws ClassNotFoundException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<InformesBean> log = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("Select * from Informacoes where Id_Relatorio LIKE ?");
            stmt.setString(1, "%"+Id_Relatorio+"%");
            rs = stmt.executeQuery();
            
                while(rs.next()){
                InformesBean i = new InformesBean();
                
                i.setAprovacao(rs.getString("Aprovacao"));
                i.setId(rs.getInt("Id"));
                i.setData(rs.getString("dia"));
                i.setCpf(rs.getString("Cpf"));
                i.setFatura(rs.getDouble("Fatura"));
                i.setFuncionario(rs.getString("Funcionario"));
                i.setJustificativa(rs.getNString("Justificativa"));
                i.setId_Relatorio(rs.getInt("Id_Relatorio"));
                i.setTipo(rs.getString("Tipo_Dispesa"));
                i.setGestor(rs.getString("Gestor"));
                i.setValorAp(rs.getDouble("Valor_Apresentado"));
                i.setValorTap(rs.getDouble("Valor_Total_Apresentado"));
                i.setVtnf(rs.getDouble("valor_total_de_NFapresentado"));
                i.setSaldo(rs.getDouble("Saldo"));
                i.setValotTNF(rs.getDouble("valor_total_NF"));
                i.setSefaz(rs.getInt("Sefaz"));
                log.add(i);
                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InserirDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
         ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return log;
    }
    
    
    public List<InformesBean> SelectTodasAsDespesas() throws ClassNotFoundException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<InformesBean> log = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("Select * from Informacoes");
            
            rs = stmt.executeQuery();
            
                while(rs.next()){
                InformesBean i = new InformesBean();
                
                i.setAprovacao(rs.getString("Aprovacao"));
                i.setId(rs.getInt("Id"));
                i.setData(rs.getString("dia"));
                i.setCpf(rs.getString("Cpf"));
                i.setFatura(rs.getDouble("Fatura"));
                i.setFuncionario(rs.getString("Funcionario"));
                i.setJustificativa(rs.getNString("Justificativa"));
                i.setId_Relatorio(rs.getInt("Id_Relatorio"));
                i.setTipo(rs.getString("Tipo_Dispesa"));
                i.setGestor(rs.getString("Gestor"));
                i.setValorAp(rs.getDouble("Valor_Apresentado"));
                i.setValorTap(rs.getDouble("Valor_Total_Apresentado"));
                i.setVtnf(rs.getDouble("valor_total_de_NFapresentado"));
                i.setSaldo(rs.getDouble("Saldo"));
                i.setValotTNF(rs.getDouble("valor_total_NF"));
                log.add(i);
                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InserirDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
         ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return log;
    }
    
    
    
    public List<InformesBean> DeleteInfo(String cpf) throws ClassNotFoundException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<InformesBean> list = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("Select* from informacoes where CPF LIKE ?");
            stmt.setString(1, "%"+cpf+"%");
            rs = stmt.executeQuery();
            
                while(rs.next()){
                InformesBean i = new InformesBean();
                
                i.setId(rs.getInt("Id"));
                i.setData(rs.getString("dia"));                
                i.setTipo(rs.getString("Tipo_Dispesa"));
                i.setValorAp(rs.getDouble("Valor_Apresentado"));
                i.setVtnf(rs.getDouble("valor_total_de_NFapresentado"));  
                i.setCpf(rs.getString("CPF"));
                             
                                 
                list.add(i);
                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InserirDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
         ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return list;
    }
    
    
    public List<InformesBean> Relatorio() throws ClassNotFoundException, SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<InformesBean> relatorio = new ArrayList<>();        
        
        try{
            stmt = con.prepareStatement("select max(Id_Relatorio)as Id_Relatorio from prestecontas.informacoes");
            rs = stmt.executeQuery();
            InformesBean c = new InformesBean();   
            
             /*if(rs != null && rs.next()){
             
             int id = rs.getInt(1)+1;*/             
             if(rs != null && rs.next()){              
                 
                //int id = rs.getInt(1)+1;
                
                c.setId_Relatorio(rs.getInt(1)+1);
               
             }
             relatorio.add(c);
             }
          
        
        
        finally{
         ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return relatorio;
    }   

}
   
