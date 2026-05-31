public class ArrayDemo {
    public static void main(String[] args) {
        String[] arr = {"潘李悦", "nihao", "能否识别汉字"};

        // for 循环遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("这是第" + (i + 1) + "个：" + arr[i]);
        }

        // while 循环遍历数组
        int count = 0;
        while (count < arr.length) {
            System.out.println(arr[count]);
            count++;
        }
    }
}
