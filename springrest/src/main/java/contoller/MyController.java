package contoller;

import entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.CourseService;

import java.util.List;

@RestController
public class MyController {

    @Autowired//COURSESERVICE KA object inject krlega yahan because of autowired
    private CourseService courseService;
    @GetMapping("/home")
        public String home(){
            return "Welcome to courses application";
        }
        //get the courses
    @GetMapping("/courses")
        public List<Courses> getCourses(){
        return this.courseService.getCourses();

        }
        //fetch one course
        @GetMapping("/courses/{courseId}")
        public Courses getCourse(@PathVariable String courseId){
        return this.courseService.getCourses(Long.parseLong(courseId));
        }
        //to add course
        @PostMapping("/courses")
    public  Courses addCourse(@RequestBody Courses courses){
        return  this.courseService.addCourses(courses);

        }
        //UPDATE COURSE USING PUT REQUEST
    @PutMapping("/courses")
    public  Courses updateCourse(@RequestBody Courses courses){
        return  this.courseService.updateCourse(courses);
    }
    //delete the course
    @DeleteMapping("/courses{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(HttpStatus.OK);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
