package br.mack.ps2.persistencia;


import java.sql.*;
import java.util.*;


import br.mack.ps2.Conta;


public class ContaDAOMySQL implements ContaDAO {
    private String table = "contas";
    private String createSQL = "INSERT INTO " + table + " VALUES (?, ?, ?, ?)";
    private String readSQL = "SELECT * FROM " + table;
    // private String updateSQL = "UPDATE " + table + " SET nome =?, saldo=?,
    // agencia=? WHERE id=? ";
    // private String deleteSQL = "DELETE FROM " + table + " WHERE id=?";

    private final MySQLConnection mysql = new MySQLConnection();

    @Override
    public boolean create(Conta conta) {
        Connection conn = mysql.getConnection();
        try {
            PreparedStatement stm = conn.prepareStatement(createSQL);

            stm.setInt(1, 0);  
            stm.setString(2, ""); 
            stm.setInt(3, 0); 
            stm.setInt(4, 0); //TODO mudar variaveis do create


            int reg = stm.executeUpdate();

            return reg > 0;

        } catch (final SQLException e) {
            System.out.println("Falha na conexção com a base de dados!");
            e.printStackTrace();
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Conta> read() {
        Connection conn = mysql.getConnection();
        List<Conta> contas = new ArrayList();
        try {
            PreparedStatement stm = conn.prepareStatement(readSQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Conta conta = new Conta();
                conta.setId(rs.getInt("id"));
                conta.setNome(rs.getString("nome"));
                conta.setAgencia(rs.getInt("agencia"));
                conta.setSaldo(rs.getBigDecimal("saldo"));
                contas.add(conta);
            }
            return contas;

        } catch (final SQLException e) {
            System.out.println("Falha na conexção com a base de dados!");
            e.printStackTrace();
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return contas;
    }

    @Override
    public boolean update(Conta conta) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(Conta conta) {
        // TODO Auto-generated method stub
        return false;
    }
}