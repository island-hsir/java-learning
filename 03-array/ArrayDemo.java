import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] arr = {"潘李悦", "nihao", "能否识别汉字"};//String [] 数组为固定长度无法增删改查
        ArrayList<String> al = new ArrayList<>();
        //ArrayList support CRUD operation (create,read,update,delete)
        // C
        al.add("第一个");
        al.add("第两个");
        al.add("第3个");
        al.add("第four个");
        System.out.println("初始化："+ al);
        //D
        al.remove("第一个");
        System.out.println("DELETE  ："+ al);
        //U
        al.set(0,"first");
        System.out.println("UPDATE ："+ al);
        //R
        System.out.println("READ:" + al.get(1));



        // for 循环遍历数组
        for (String s : al) {   
            System.out.println(s);
        }

        // while 循环遍历数组
        int count = 0;
        while (count < arr.length) {
            System.out.println(arr[count]);
            count++;
        }
    }
}
