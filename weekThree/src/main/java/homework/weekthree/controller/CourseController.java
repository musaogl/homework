package homework.weekthree.controller;
import homework.weekthree.model.Course;
import homework.weekthree.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController public class CourseController {

    CourseService courseService;

    @GetMapping("/course")
    public ResponseEntity<List<Course>> getAllCourse(){
        return new ResponseEntity<List<Course>>( courseService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/course")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course){
        return new ResponseEntity<>(courseService.save(course), HttpStatus.OK);
    }
}
