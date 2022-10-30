package firstTask;

public class Teacher extends Person{

    Course course;

    public Teacher(String name,Course course) {
        super(name);
        setCourse(course);

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
