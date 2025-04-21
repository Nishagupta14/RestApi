package services;

import java.util.List;

import entities.Courses;

public interface CourseService {
    public List<Courses> getCourses();
    public  Courses getCourse(long courseId);
    public  Courses addCourses(Courses courses);

    Courses getCourses(long l);
}
