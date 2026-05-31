package CourseSystem.src.com.example.main;

import CourseSystem.src.com.example.exception.DuplicateCourseException;
import CourseSystem.src.com.example.model.Course;
import CourseSystem.src.com.example.model.Student;
import CourseSystem.src.com.example.model.Teacher;
import CourseSystem.src.com.example.model.User;
import CourseSystem.src.com.example.service.Reviewable;

public class main {
    public static void main(String[] args) {
        //创建一些课程对象
        // Course javaCourse = new Course("JAVA课程设计","101",4);
        // Course mathCourse = new Course("高等数学","001",6);

        //创建学生对象
        Student stu1 = new Student("陈华","98989111");
        try{stu1.selectedCourses(new Course("JAVA课程设计","1111", 3));
        stu1.selectedCourses(new Course("线性代数","1111", 4));
        stu1.selectedCourses(new Course("高等数学","1111", 6));
        stu1.selectedCourses(new Course("线性代数","1111", 4));
        stu1.selectedCourses(new Course("线性代数","1111", 4));
    } catch (DuplicateCourseException e){
        System.out.println(e.getMessage());
    }
        
        //使用ArrayList存储某个学生的选课列表
        // ArrayList<Course> stuCourse = new ArrayList<>();
        // stuCourse.add(javaCourse);
        // stuCourse.add(mathCourse);
        //把此方法移动进入Student类
        // ArrayList<Course> stuCourse = new ArrayList<>(Arrays.asList(javaCourse,mathCourse));
        stu1.showCourses();
        System.out.println("总学分："+stu1.getTotalCredit());



        User u1 = new Student("李白","01");
        User u2 = new Teacher("白山","02");


        User [] users = {u1,u2};
        for(User u:users){
            u.showRole();
        }


        JavaCourse jc = new JavaCourse("J123",5);
        System.out.println(Reviewable.reviewPolicy());
        jc.addReview("老师讲的很清楚");
        jc.addReview("节奏很好~");
        jc.showReview();
        jc.showNotReview();
        System.out.println(Reviewable.reviewPolicy());
    }
}
