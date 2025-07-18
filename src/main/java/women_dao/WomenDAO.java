package women_dao;

import women_entity.WomenEntity;
import women_app.HibernetUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class WomenDAO {

    // ✅ Insert a new WomanEntity
    public void insert(WomenEntity w) {
        EntityTransaction tx = null;
        EntityManager entityManager = null;
        try {
            entityManager = HibernetUtil.getEntityManagerFactory().createEntityManager();
            tx = entityManager.getTransaction();
            tx.begin(); // Start transaction
            entityManager.persist(w);
            tx.commit(); // Commit transaction
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            if (entityManager != null) entityManager.close();
        }
    }

    // ✅ Fetch all WomanEntity records
    public List<WomenEntity> getAll() {
        EntityManager entityManager = HibernetUtil.getEntityManagerFactory().createEntityManager();
        try {
            return entityManager.createQuery("FROM WomanEntity", WomenEntity.class).getResultList();
        } finally {
            entityManager.close();
        }
    }

    // ✅ Update contribution for a WomanEntity by id
    public void update(int id, String contribution) {
        EntityTransaction tx = null;
        EntityManager entityManager = null;
        try {
            entityManager = HibernetUtil.getEntityManagerFactory().createEntityManager();
            tx = entityManager.getTransaction();
            tx.begin(); // Start transaction

            WomenEntity w = entityManager.find(WomenEntity.class, id);
            if (w != null) {
                w.setContribution(contribution);
                entityManager.merge(w);
            }

            tx.commit(); // Commit transaction
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            if (entityManager != null) entityManager.close();
        }
    }

    // ✅ Delete a WomanEntity by id
    public void delete(int id) {
        EntityTransaction tx = null;
        EntityManager entityManager = null;
        try {
            entityManager = HibernetUtil.getEntityManagerFactory().createEntityManager();
            tx = entityManager.getTransaction();
            tx.begin(); // Start transaction

            WomenEntity w = entityManager.find(WomenEntity.class, id);
            if (w != null) {
                entityManager.remove(w);
            }

            tx.commit(); // Commit transaction
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            if (entityManager != null) entityManager.close();
        }
    }
}
