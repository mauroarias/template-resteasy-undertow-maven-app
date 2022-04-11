package org.mauro.templateapp;

import io.undertow.Undertow;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import lombok.extern.slf4j.Slf4j;
import org.jboss.resteasy.core.ResteasyDeploymentImpl;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;
import org.mauro.templateapp.server.TemplateController;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@ApplicationPath("")
public class TemplateApp extends Application {

    private static UndertowJaxrsServer server;

    public static void main(String[] args) {
        Long stating = new Timestamp(System.currentTimeMillis()).getTime();
        log.info("starting app");
        server = new UndertowJaxrsServer().start();
        ResteasyDeployment deployment = new ResteasyDeploymentImpl();
        deployment.setDeploymentSensitiveFactoryEnabled(true);
        deployment.setApplication(new TemplateApp());
        deployment.start();
        server.setRootResourcePath("/").deploy(deployment);
        server.start(Undertow.builder().addHttpListener(8080, "localhost"));
        log.info("app ready in {} ms", new Timestamp(System.currentTimeMillis()).getTime() - stating);
    }

    @Override
    public Set<Class<?>> getClasses()
    {
        HashSet<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(TemplateController.class);
        return classes;
    }
}