public class EncapsulationDemo {
    public static void main(String[] args) {
        Women xiaohua = new Women("小花", 19, "西安", "白菜");
        xiaohua.eat();
        System.out.println(xiaohua.getAge());

        // 测试 setter 校验：年龄不合法
        xiaohua.setAge(-5);
    }
}
