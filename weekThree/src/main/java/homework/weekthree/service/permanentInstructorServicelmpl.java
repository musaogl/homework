package homework.weekthree.service;
import homework.weekthree.dao.permanentInstructorDao;
import homework.weekthree.model.permanentInstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class permanentInstructorServicelmpl implements permanentInstructorService<permanentInstructor> {

    permanentInstructorDao<permanentInstructor> permanentInstructorDao;

    public permanentInstructorServiceImpl(permanentInstructorDao<permanentInstructor> permanentInstructorDao) {
        this.permanentInstructorDao = permanentInstructorDao;
    }

    @Override
    public List<permanentInstructor> findAll() {
        return permanentInstructorDao.findAll();
    }

    @Override
    public permanentInstructor findById(int id) {
        return null;
    }

    @Override
    public permanentInstructor save(permanentInstructor permanentInstructor) {
        return (permanentInstructor) permanentInstructorDao.save(permanentInstructor);
    }

    @Override
    public void deleteFromDatabaseById(int id) {

    }

    @Override
    public permanentInstructor updateOnDatabase(permanentInstructor object) {
        return null;
    }

}

