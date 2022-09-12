package com.athenatechnologies.core.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.athenatechnologies.core.model.ConnectionDb;

@Component
public class CreatingConnection
{
    @Bean(name = "beanConnection")
    public ConnectionDb getConexionBd()
    {
        ConnectionDb connection = new ConnectionDb();
        connection.setNombreBd("springDb");
        connection.setUrl("localhost");

        return connection;

    }

    @Bean(name = "beanConnectionTwo")
    public ConnectionDb getConexionBdTwo()
    {
        ConnectionDb connection = new ConnectionDb();
        connection.setNombreBd("springDb");
        connection.setUrl("localhost");

        return connection;

    }

    @Bean(name = "beanConnectionThree")
    public ConnectionDb ConnectionDbThree()
    {
        ConnectionDb connection = new ConnectionDb();
        connection.setNombreBd("springDb");
        connection.setUrl("localhost");

        return connection;

    }
}
