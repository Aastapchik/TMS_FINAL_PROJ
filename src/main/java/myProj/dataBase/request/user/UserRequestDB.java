package myProj.dataBase.request.user;

import myProj.dataBase.AppCfg;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class UserRequestDB {

    private static SessionFactory sf = AppCfg.entityManagerFactory();
    private static Transaction tr = sf.getCurrentSession().beginTransaction();


    public static String getUser() throws SQLException {

        String login;
        try (Session session = sf.getCurrentSession()) {

            Query query = session.createQuery("SELECT login FROM User where id = 1");
            login = (String) query.getResultList().get(0);

        }
        return login;

    }




}
