package homework.weekthree.controller;

import homework.weekthree.model.permanentInstructor;
import homework.weekthree.service.permanentInstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class permanentInstructorController {
    permanentInstructorService permanentInstructorService;

    @GetMapping("/permanentInstructor")
    public ResponseEntity<List<permanentInstructor>> getAllpermanentInstructor(){
        return new ResponseEntity<List<permanentInstructor>>(permanentInstructorService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/permanentInstructor")
    public ResponseEntity<permanentInstructor> savepermanentInstructor(@RequestBody permanentInstructor permanentInstructor){
        return new ResponseEntity<>(permanentInstructorService.save(permanentInstructor), HttpStatus.OK);
    }
}
