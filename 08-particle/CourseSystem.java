

import java.util.ArrayList;
import java.util.HashSet;



//抽象方法  抽取老师和学生的共同类
abstract class User{
    private String name;
    private String userId;

    public User (String name,String userId){
        this.name = name;
        this.userId = userId;
    }

    public String getName(){return name;}
    public String getuserId(){return userId;}

    public abstract void showRole();  //抽象方法子类必须实现    
}


//学生类
class Student extends User {
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
    public void selectedCourses(Course course) throws DulicateCourseExcepation{
        if(!selectedCourses.add(course)){
            throw new  DulicateCourseExcepation("不能重复选择课程"+ course.getcourseName());
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

class Teacher extends User{
    public Teacher(String name,String TeacherId){
        super(name,TeacherId);
    }

    public void teachCourse(Course course){
        System.out.println(getName() + "正在教授：" + course.getcourseName());
    }



    @Override
    public void showRole(){
        System.out.println("我是教师:" + getName());
    }

}


//课程类
class Course{
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

//自定义异常
class DulicateCourseExcepation extends Exception{
    public DulicateCourseExcepation(String msg){super(msg);}
}

public class CourseSystem{
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
    } catch (DulicateCourseExcepation e){
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
        jc.showNOtReview();
        System.out.println(Reviewable.reviewPolicy());
    }   


   
}
//接口
interface Reviewable{
    //抽象方法
    void addReview(String commit);
    void showReview();    

    //默认方法  有方法体，实现类可以直接继承
    default  void showNOtReview(){
        System.out.println("***测试暂无评价***");
    }

    //静态方法，接口自己的工具方法
    static String reviewPolicy(){
        return "【评论必须合法合规】";
    }


}

class JavaCourse extends Course implements Reviewable{
    private ArrayList<String> reviews = new ArrayList<>();

    public JavaCourse(String courseId,int credit){
        super("Java程序设计",courseId,credit);
    }

    @Override//重新评论功能，接口不构造方法，这里必须重写
    public void addReview(String commit){
        reviews.add(commit);//reviews是一个数组，这里给个commit参数add进入数据reviews
    }

    @Override
    public void showReview(){
        if(reviews.isEmpty()){
            System.out.println("目前没有任何评论~");
        }else{System.out.println("Java课程评价：");
            int rnumber = 1;
            for(String r : reviews){
                System.out.println("-第"+ rnumber + "个评论：" + r);
                rnumber += 1;
            }
        }
        // for(String r : reviews){
        //     System.out.println("-" + r);
        // }
    }
}
