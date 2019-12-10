package io.swagger.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;


@Configuration
@EnableMongoAuditing
public class MongoConfiguration extends AbstractMongoConfiguration{

	
	@Value("${mongo.dbport}")
    private int port;

    @Value("${mongo.hostname}")
    private String host;

    @Value("${mongo.databasename}")
    private String dbname;
    
    @Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return dbname;
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		ServerAddress serverAdress = new ServerAddress(host,port);
		 Mongo mongo = new MongoClient(serverAdress);
		return mongo;
	}
	
}
