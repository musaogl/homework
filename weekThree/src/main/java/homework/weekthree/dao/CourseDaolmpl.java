package homework.weekthree.dao;

import homework.weekthree.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
public class CourseDaolmpl implements BaseDao<Course>  {
    EntityManager entityManager;

    public CourseDaolmpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Course> findAll() {
        return entityManager.createQuery("from Course",Course.class).getResultList();
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public Course save(Course course) {

        return entityManager.merge(course);
    }

    @Override
    public void deleteFromDatabaseById(int id) {

    }

    @Override
    public Course updateOnDatabase(Course object) {
        return null;
    }
}

