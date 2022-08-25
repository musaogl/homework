package homework.weekthree.dao;
import homework.weekthree.model.visitingResearcher;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class visitingResearcherDaolmpl implements BaseDao<visitingResearcher> {

    EntityManager entityManager;

    public visitingResearcherDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    @Override
    public List<visitingResearcher> findAll() {
        return entityManager.createQuery("from visitingResearcher",visitingResearcher.class).getResultList();
    }

    @Override
    public visitingResearcher findById(int id) {
        return null;
    }

    @Override
    public visitingResearcher save(visitingResearcher visitingResearcher) {

        return entityManager.merge(visitingResearcher);
    }

    @Override
    public void deleteFromDatabaseById(int id) {

    }

    @Override
    public visitingResearcher updateOnDatabase(visitingResearcher object) {
        return null;
    }
}
