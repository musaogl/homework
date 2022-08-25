package homework.weekthree.service;
import homework.weekthree.dao.CourseDao;
import homework.weekthree.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServicelmpl implements CourseService<Course> {
    CourseDao<Course> courseDao;

    public CourseServicelmpl(CourseDao<Course> courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public Course save(Course course) {
        return (Course) courseDao.save(course);
    }

    @Override
    public void deleteFromDatabaseById(int id) {

    }

    @Override
    public Course updateOnDatabase(Course object) {
        return null;
    }

}

