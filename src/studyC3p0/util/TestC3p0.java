package studyC3p0.util;

import java.beans.PropertyVetoException;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Driver;

/**
 * 
 * @author chencong
 * 测试连接
 */
public class TestC3p0 {

	public static void main(String[] args) {
		try {
			ComboPooledDataSource cpds = new ComboPooledDataSource();
			cpds.setDriverClass( "com.mysql.jdbc.Driver" ); //loads the jdbc driver            
			cpds.setJdbcUrl( "jdbc:mysql://localhost:3306/testdb" );
			cpds.setUser("root");                                  
			cpds.setPassword("123456");
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
	}
}
