package core.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages = { "dao package" })
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class AppConfig {

	// spring helper class for the config data
	@Autowired
	private Environment env;

	// bean 1: DataSource
	@Bean
	public DataSource dataSource() {
		// create a datasource object
		ComboPooledDataSource ds = new ComboPooledDataSource();
		// set jdbc driver
		try {
			ds.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		ds.setJdbcUrl(env.getProperty("jdbc.url"));
		ds.setUser(env.getProperty("jdbc.user"));
		ds.setPassword(env.getProperty("jdbc.password"));

		ds.setInitialPoolSize(Integer.parseInt(env.getProperty("connection.pool.initialPoolSize")));
		ds.setMinPoolSize(Integer.parseInt(env.getProperty("connection.pool.minPoolSize")));
		ds.setMaxPoolSize(Integer.parseInt(env.getProperty("connection.pool.maxPoolSize")));
		ds.setMaxIdleTime(Integer.parseInt(env.getProperty("connection.pool.maxIdleTime")));
		return ds;
	}

	// bean 2: EntityManagerFactory
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan("core.config", "a"); // the packages of the entity classes
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter()); // Hibernate implementation
		// add more properties
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		emf.setJpaProperties(props);
		return emf;
	}

	// bean 3: transaction manager
	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager tm = new JpaTransactionManager();
		tm.setEntityManagerFactory(entityManagerFactory().getObject());
		return tm;
	}

}
