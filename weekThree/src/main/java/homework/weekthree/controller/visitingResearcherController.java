package homework.weekthree.controller;
package homework.weekthree.controller;

import homework.weekthree.model.visitingResearcher;
import homework.weekthree.service.visitingResearcherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class visitingResearcherController {

    visitingResearcherService visitingResearcherService;

    @GetMapping("/visitingResearcher")
    public ResponseEntity<List<visitingResearcher>> getAllvisitingResearcher(){
        return new ResponseEntity<List<visitingResearcher>>( visitingResearcherService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/visitingResearcher")
    public ResponseEntity<visitingResearcher> savevisitingResearcher(@RequestBody visitingResearcher visitingResearcher){
        return new ResponseEntity<>((visitingResearcher) visitingResearcherService.save(visitingResearcher), HttpStatus.OK);
    }
}
