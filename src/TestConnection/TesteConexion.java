package TestConnection;
import java.sql.Connection;
import java.sql.SQLException;

import jdb.factory.ConnectionFactory;

public class TesteConexion {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexion();

		System.out.println("Cerrando conexion!!");

		connection.close();
	}

}
