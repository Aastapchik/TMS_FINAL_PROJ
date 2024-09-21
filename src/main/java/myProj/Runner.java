package myProj;

import myProj.dataBase.AppCfg;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Runner extends SpringBootServletInitializer {

    private static SessionFactory sf = AppCfg.createSessionFactory();
    private static Transaction tr = sf.getCurrentSession().beginTransaction();
    public static void main(String[] args) {

        SpringApplication.run(Runner.class, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Runner.class);
    }


}