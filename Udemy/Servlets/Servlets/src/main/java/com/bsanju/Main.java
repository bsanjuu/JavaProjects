package com.bsanju;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        Context context = tomcat.addContext("", null);
        tomcat.addServlet(context, "hello", new HelloServlet());
        context.addServletMappingDecoded( "/hello", "hello");
        tomcat.start();
        tomcat.getServer().await();
    }

}
