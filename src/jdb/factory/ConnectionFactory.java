package jdb.factory;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private DataSource dataSource;

	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura_latam?useTimeZone=true&serverTimeZone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("s3C@M_1977**1");
		comboPooledDataSource.setMaxPoolSize(10);

		this.dataSource = comboPooledDataSource;
	}

	public Connection recuperarConexion() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
