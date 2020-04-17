package br.mack.ps2.persistencia;

public class ContaDAOMySQL {
    private String table = "conta";
    private String createSQL = "INSERT INTO " + table + " VALUES (?, ?, ?, ?)";
    private String readSQL = "SELECT * FROM " + table;
    // private String updateSQL = "UPDATE " + table + " SET nome =?, saldo=?, agencia=? WHERE id=? ";
    // private String deleteSQL = "DELETE FROM " + table + " WHERE id=?";


    private final MySQLConnection mysql = new MySQLConnection();

   
}