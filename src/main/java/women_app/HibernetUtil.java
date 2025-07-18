package women_app;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernetUtil {

    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("myPersistence");
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    } // ✅ properly close static block here

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void shutDown() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }

	public static Object getSessionFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}
