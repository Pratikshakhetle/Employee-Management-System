package com.employee.EmployeeManagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

import jakarta.annotation.PostConstruct;

@Configuration
public class MongoConfiguration {

	@Autowired
	private MappingMongoConverter  mappingMongoConverter;
	
	@PostConstruct
	public void setUpMongoEscapeCharacterConversion() {
		mappingMongoConverter.setTypeMapper( new DefaultMongoTypeMapper(null));
	}
}
