package CourseSystem.src.com.example.model;
import java.util.HashSet;
import CourseSystem.src.com.example.exception.*;


public class Student extends User {
    // private String name;
    // private String sutdentId;
    // private ArrayList<Course> selectedCourses;//给每个学生增加了都可以选课的能力
    private HashSet<Course> selectedCourses = new HashSet<>();
    @Override
    public void showRole(){
        System.out.println("我是学生:" + getName());
    }
    
    //构造方法，通过这个方法可以给学生录入姓名和id
    public  Student(String name,String studentId){
        super(name,studentId);
        // this.name=name;
        // this.sutdentId=studentId;
        // this.selectedCourses=new ArrayList<>();//构建时初始化列表
        this.selectedCourses = new HashSet<>();
    }

    //getter 方法让外部可以读取数据
    // public String getName(){return name;}
    // public String getStudentId(){return sutdentId;}
    
    //选课方法
    public void selectedCourses(Course course) throws DuplicateCourseException{
        if(!selectedCourses.add(course)){
            throw new  DuplicateCourseException("不能重复选择课程"+ course.getcourseName());
        }
    }

    //展示所选课程
    public void showCourses(){
        System.out.println("姓名："+ this.getName());
        for(Course c : selectedCourses){
            System.out.println("课程："+c.getcourseName()+"-学分："+c.getcredit());
        }
    }

    //计算总学分
    public int getTotalCredit(){
        int total = 0;
        for(Course c : selectedCourses){
            total += c.getcredit();
        }
        return total;
    }
    
}
