package es.ual.acg.cos.trader.register;

import java.util.Arrays;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import es.ual.acg.cos.trader.register.controller.RegisterController;
import es.ual.acg.cos.trader.register.service.Register;
import es.ual.acg.cos.trader.register.ws.ManageACRepositoryRESTImpl;
import es.ual.acg.cos.trader.register.ws.ManageCCRepositoryRESTImpl;

import org.springframework.beans.factory.annotation.Autowired;

//import org.apache.cxf.jaxrs.swagger.Swagger2Feature;

@SpringBootApplication
@EnableFeignClients
public class Application {

  @Autowired
  private Bus bus;

  // @Autowired
  // private Register register;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  // Beans with RESTful WS
  @Bean
  public Server rsServerAC() {
    JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
    endpoint.setBus(bus);
    endpoint.setAddress("/abstractcomponents");
    // Register 2 JAX-RS root resources supporting "/sayHello/{id}" and
    // "/sayHello2/{id}" relative paths
    endpoint.setServiceBeans(Arrays.<Object>asList(new ManageACRepositoryRESTImpl()));
    // endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
    return endpoint.create();
  }

  @Bean
  public Server rsServerCC() {
    JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
    endpoint.setBus(bus);
    endpoint.setAddress("/concretecomponents");
    // Register 2 JAX-RS root resources supporting "/sayHello/{id}" and
    // "/sayHello2/{id}" relative paths
    endpoint.setServiceBeans(Arrays.<Object>asList(new ManageCCRepositoryRESTImpl()));
    // endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
    return endpoint.create();
  }

//  @Bean
//  public Server rsServerRegister() {
//    JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
//    endpoint.setBus(bus);
//    endpoint.setAddress("/register");   
//    endpoint.setServiceBeans(Arrays.<Object>asList(new RegisterController()));
//    return endpoint.create();
//  }

//  @Bean(name = "beanMAC")
//  @Scope("singleton")
//  public ManageAbstractComponents manageAbstractComponents() {
//    return new ManageAbstractComponents();
//  }
//
//  @Bean(name = "beanMDB")
//  @Scope("singleton")
//  public ManageDB manageDB() {
//    return new ManageDB();
//  }

}
