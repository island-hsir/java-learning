public class LoopDemo {
    public static void main(String[] args) {
        // for 循环
        for (int i = 0; i < 5; i++) {
            System.out.println("这是第" + (i + 1) + "次循环");
        }

        // while 循环
        int count = 0;
        while (count < 3) {
            System.out.println("while循环第" + (count + 1) + "次");
            count++;
        }

        // for-each 遍历数组
        String[] names = {"小花", "小明", "小红"};
        int num = 1;
        for (String name : names) {
            System.out.println("这是第" + num + "个人：" + name);
            num++;
        }
    }
}
