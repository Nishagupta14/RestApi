package services;

import entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    List<Courses> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Courses(145,"java"));
        list.add(new Courses(144,"spring"));
        list.add(new Courses(146,"spring jpa"));
    }

    @Override
    public List<Courses> getCourses() {
        return List.of();
    }

    @Override
    public Courses getCourse(long courseId) {
       Courses c=null;
       for(Courses course:list){
           if(course.getId()==courseId){
               c=course;
               break;
           }
       }
        return c;
    }

    @Override
    public Courses addCourses(Courses courses) {
        return null;
    }

    @Override
    public Courses getCourses(long l) {
        return null;
    }

    public  Courses addCourse(Courses courses){
       list.add(courses);
       return courses;
    }
}
