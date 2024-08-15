package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fiap.venda.conexao.ConnectionFactory;

public class VendedorDAO {	
	private Connection connect;
	private String sql;
	private PreparedStatement prepared;
	
	public void inserir(Vendedor vendedor) {
		connect = ConnectionFactory.getInstance().getConnection();
		sql = "INSERT INTO TBL_JAVA_VENDEDOR VALUES (?,?)";
		try {
			prepared = connect.prepareStatement(sql);
			prepared.setInt(1, vendedor.getId_vendedor());
			prepared.setString(2, vendedor.getNome_vendedor());
			prepared.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	
}
