package PROFIPROJ.dataBase;

import PROFIPROJ.entity.*;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCfg {

        @Bean
        public static SessionFactory createSessionFactory() {
            SessionFactory sf = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(AvailableOrder.class)
                    .addAnnotatedClass(SphereActivity.class)
                    .addAnnotatedClass(UserAOrder.class)
                    .addAnnotatedClass(UserCard.class)
                    .addAnnotatedClass(UserOrder.class)
                    .addAnnotatedClass(UserReview.class)
                    .buildSessionFactory();
            return sf;
        }
    }


