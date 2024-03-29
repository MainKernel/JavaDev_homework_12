package utils;

import entity.ClientEntity;
import entity.PlanetEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final HibernateUtils INSTANCE;
    private static final SessionFactory sessionFactory;

    static {
        INSTANCE = new HibernateUtils();

        sessionFactory = new Configuration()
                .addAnnotatedClass(ClientEntity.class)
                .addAnnotatedClass(PlanetEntity.class)
                .buildSessionFactory();
    }

    private HibernateUtils() {
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static HibernateUtils getInstance() {
        return INSTANCE;
    }

    public void close() {
        this.sessionFactory.close();
    }

}

