package homework.weekthree.dao;
import homework.weekthree.model.permanentInstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class permanentInstructorDaolmpl implements BaseDao<permanentInstructor> {

    EntityManager entityManager;

    public permanentInstructorDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    @Override
    public List<permanentInstructor> findAll() {
        return entityManager.createQuery("from permanentInstructor",permanentInstructor.class).getResultList();
    }

    @Override
    public permanentInstructor findById(int id) {
        return null;
    }

    @Override
    public permanentInstructor save(permanentInstructor permanentInstructor) {

        return entityManager.merge(permanentInstructor);
    }

    @Override
    public void deleteFromDatabaseById(int id) {

    }

    @Override
    public permanentInstructor updateOnDatabase(permanentInstructor object) {
        return null;
    }

