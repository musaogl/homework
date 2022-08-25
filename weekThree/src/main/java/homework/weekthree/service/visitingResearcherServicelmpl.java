package homework.weekthree.service;
import homework.weekthree.dao.permanentInstructorDao;
import homework.weekthree.model.permanentInstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class visitingResearcherServicelmpl  implements visitingResearcherService <visitingResearcher> {

    visitingResearcherDao <visitingResearcher> visitingResearcherDao;

    public visitingResearcherServiceImpl(visitingResearcherDao <visitingResearcher> visitingResearcherDao) {
        this.visitingResearcherDao = visitingResearcherDao;
    }

    @Override
    public List<visitingResearcher> findAll() {
        return visitingResearcherDao.findAll();
    }

    @Override
    public visitingResearcher findById(int id) {
        return null;
    }

    @Override
    public visitingResearcher save(visitingResearcher visitingResearcher) {
        return (visitingResearcher) visitingResearcherDao.save(visitingResearcher);
    }

    @Override
    public void deleteFromDatabaseById(int id) {

    }

    @Override
    public visitingResearcher updateOnDatabase(visitingResearcher object) {
        return null;
    }

}

