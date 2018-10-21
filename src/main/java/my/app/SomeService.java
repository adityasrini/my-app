package my.app;

import javax.inject.Singleton;
import javax.sql.DataSource;

@Singleton
public class SomeService {
	DataSource dataSource;
	
	public SomeService(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
