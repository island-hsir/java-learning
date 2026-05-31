import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // for(int i =1;i<10;i++){
        //     System.out.println("nihao");
        // }
        //for 循环遍历数组
        String[] arr = {"潘李悦", "nihao", "能否识别汉字"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("这是第" + (i + 1) + "个：" + arr[i] + "  ");
        }

        // while 循环遍历数组；
        int count = 0;
        while (count < arr.length) {
            System.out.println(arr[count]);
            count++;
        }
        //动态数组
        ArrayList<String> list = new ArrayList<>(Arrays.asList("huzhengkang", "jiangsjiao"));
        list.add("panliyue");
        System.out.println(list);
        // for(int i =0;i<arr.length;i++){
        //     list.add(arr[i]);
        // }
        System.out.println("=========");
        int num = 1;
        for (String s : list) {
            System.out.println("this is number " + num + ":" + s);
            num++;
        }
        //往动态数组list里面增加arr的数据
        System.out.println(list);
        list.remove("panliyue");
        list.set(1, "dashuaige");
        System.out.println(list);
        //HashMap集合，仅有key找value，没有value找key
        HashMap<String, Integer> scores = new HashMap<>();
        System.out.println(scores);
        scores.put("tom", 99);
        scores.put("jack", 100);
        scores.put("alice", 100);
        System.out.println(scores.get("tom"));
        System.out.println(scores);
        //通过value找key
        int target = 100;
        for (String key : scores.keySet()) {
            if (scores.get(key).equals(target)) {
                System.out.println("found key:" + key);
            }
        }

        // 调用 findByValue 方法
        String result = findByValue(scores, 100);
        System.out.println(result);


    Car benzi = new Car();
    benzi.color = "red";
    benzi.speed = 99;
    benzi.run();

    Women xiaohua = new Women("小花",19,"西安","白菜");
    xiaohua.eat();
    }
    

    //pulic static void main 
    public static String findByValue(HashMap<String, Integer> map, Integer target) {
        for (String key : map.keySet()) {
            if (map.get(key).equals(target)) {
                return key;
            }
        }
        return null;
    }


    
}
class Car{
    String color;
    int speed;
    void run(){
        System.out.println(color + "car  run" + "in" + speed);
    }
}

class Women{
    // String name;
    // int age;
    // String address;
    // String food;
    private String name;
    private int age;
    private String address;
    private String food;
    //构造方法
    public Women(String name,int age,String address,String food){
        this.name = name;
        // this.age = age;
        setAge(age); //通过setter赋值
        this.address = address;
        this.food = food;
    }

    //读取 getter
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getAddress() {return address;}
    public String getFood() {return food;}
    
    //修改
    public void setName(String name){this.name =name;}
    public void setAge(int age){
        if(age<0 || age>150){
            System.out.println("年龄不合法："+age);
        } else{
            this.age = age;
        }
    }
    public void setAddress(String address){this.address=address;}
    public void setFood(String food){this.food = food;}
    void eat(){
        System.out.println(age + "岁的" + name +"喜欢吃"+ food);
    }
}

class  Girl  extends Women{
        int school;//学校

        public Girl(String name,int age,String address,String food,String school){
        super(name,age,address,food);
        this.school=school;
    }

    
    }