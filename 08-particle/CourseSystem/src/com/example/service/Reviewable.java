package CourseSystem.src.com.example.service;

public interface Reviewable{
    //抽象方法
    void addReview(String commit);
    void showReview();    

    //默认方法  有方法体，实现类可以直接继承
    default  void showNotReview(){
        System.out.println("***测试暂无评价***");
    }

    //静态方法，接口自己的工具方法
    static String reviewPolicy(){
        return "【评论必须合法合规】";
    }
}