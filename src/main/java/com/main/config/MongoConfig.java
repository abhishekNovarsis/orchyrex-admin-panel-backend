package com.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {

	@Bean
	public MongoTemplate mongoTemplate() {
		return new MongoTemplate(new SimpleMongoClientDatabaseFactory(
				"mongodb+srv://dummyuser:dummy123@cluster0.jwqyszs.mongodb.net/orchyrex?retryWrites=true&w=majority"));
	}
}




// isse connect ho raha hai
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
//
//@Configuration
//public class MongoConfig {
//
//    @Bean
//    public MongoTemplate mongoTemplate() throws UnsupportedEncodingException {
//        String username = "dummyuser";
////        String password = "Indore%40123";  // URL-encoded password
//        String password = "dummy1234";
//        String databaseName = "orchyrex";
//
//        String connectionString = String.format("mongodb+srv://%s:%s@cluster0.jwqyszs.mongodb.net/%s?retryWrites=true&w=majority",
//                URLEncoder.encode(username, "UTF-8"),
//                URLEncoder.encode(password, "UTF-8"),
//                databaseName);
//
//        return new MongoTemplate(new SimpleMongoClientDatabaseFactory(connectionString));
//    }
//}
