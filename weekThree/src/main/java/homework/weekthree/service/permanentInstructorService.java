package homework.weekthree.service;
import homework.weekthree.model.permanentInstructor;
import org.springframework.stereotype.Service;

@Service
public interface permanentInstructorService extends BaseService<permanentInstructor> {

    homework.weekthree.model.permanentInstructor save(homework.weekthree.model.permanentInstructor permanentInstructor);
}
