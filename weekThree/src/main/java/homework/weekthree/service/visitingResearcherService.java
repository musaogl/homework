package homework.weekthree.service;
import homework.weekthree.model.visitingResearcher;
import org.springframework.stereotype.Service;

@Service
public interface visitingResearcherService extends BaseService <visitingResearcher> {
    homework.weekthree.model.visitingResearcher save(homework.weekthree.model.visitingResearcher visitingResearcher);
}
