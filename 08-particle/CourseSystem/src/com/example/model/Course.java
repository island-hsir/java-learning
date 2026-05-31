package CourseSystem.src.com.example.model;
//课程类
public class Course{
    private String courseName;
    private String courseId;
    private int credit;

    //构造方法
    public Course (String courseName,String courseId,int credit){
        this.courseName=courseName;
        this.courseId=courseId;
        this.credit=credit;
    }

    //getter
    public String getcourseName(){return courseName;}
    public String getcourseId(){return courseId;}
    public int getcredit(){return credit;}

    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Course course = (Course) o;
    return courseName.equals(course.courseName);  // 用唯一标识判断
    }

    @Override
    public int hashCode() {
    return courseId.hashCode();
    }
}