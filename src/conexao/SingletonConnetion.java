package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe respons�vel por controlar , criar e retornar a conex�o com o banco de dados
 *
 */
public class SingletonConnetion {

	//Conex�o SQL Java
	private static Connection connection = null;

	// M�todo est�tico que faz sempre a chamada para conectar
	static {
		conectar();
	}

	public SingletonConnetion() {
		conectar();
	}

	/**
	 * Realiza a conex�o com o banco de dados
	 */
	private static void conectar() {
		try {
			
			if (connection == null) {
				Class.forName("org.postgresql.Driver"); // driver psql
				connection = DriverManager.getConnection("jdbc:postgresql://jsp_jdbc_db:5432/projeto_imagens?autoReconnect=true", "postgres", "admin");// url do banco de dados com user e senha
				connection.setAutoCommit(false);// n�o dar commit automatico
				connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED); // tipo da transa��o no banco de dados
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar com a base de dados. "
					+ e);
		}

	}

	/**
	 * Retorna a conex�o com o banco de dados
	 * @return Connection
	 */
	public static Connection getConnection() {
		return connection;
	}

}
