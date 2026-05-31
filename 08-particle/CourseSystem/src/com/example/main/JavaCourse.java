package CourseSystem.src.com.example.main;
import java.util.ArrayList;
import CourseSystem.src.com.example.model.Course;
import CourseSystem.src.com.example.service.*;

public class JavaCourse extends Course implements Reviewable{
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
    }
}
