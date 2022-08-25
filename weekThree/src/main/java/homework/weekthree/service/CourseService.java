package homework.weekthree.service;

import homework.weekthree.model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService extends BaseService<Course> {
    homework.weekthree.model.Course save(homework.weekthree.model.Course course);
}
