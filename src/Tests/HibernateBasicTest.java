package Tests;

import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class HibernateBasicTest {

    @Test
    void sessionOk() {
        EntityManagerFactory eM = Persistence.createEntityManagerFactory("mySQL-persistence-unit");
    }

}
