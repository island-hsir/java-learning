public class InheritanceDemo {
    public static void main(String[] args) {
        Girl xiaohua = new Girl("小花", 19, "西安", "白菜", "清华大学");
        // xiaohua.eat();
        xiaohua.school = "西安财经大学";
        xiaohua.setAge(99);
        xiaohua.eat();
        System.out.println("学校：" + xiaohua.school);
    }
}
