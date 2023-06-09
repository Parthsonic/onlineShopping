package com.shopping.generator;

import java.io.Serializable;
import java.util.Properties;
import java.util.stream.Stream;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

public class CustomSequenceIdGenerator implements IdentifierGenerator {

	private String prefix;
	private String length;
	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String query = String.format("select %s from %s", 
	            session.getEntityPersister(object.getClass().getName(), object)
	              .getIdentifierPropertyName(),
	              object.getClass().getSimpleName());

	        Stream<String> ids = session.createQuery(query).stream();

	        Long max = ids.map(o -> o.replace(prefix + "_", ""))
	          .mapToLong(Long::parseLong)
	          .max()
	          .orElse(0L);

	        return prefix + "_" + String.format("%0"+length+"d", (max + 1));
	}
	
	@Override
	public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
		// TODO Auto-generated method stub
		prefix = params.getProperty("prefix");
		length = params.getProperty("length");
	}
	
}
