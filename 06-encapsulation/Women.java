class Women {
    private String name;
    private int age;
    private String address;
    private String food;

    // 构造方法
    public Women(String name, int age, String address, String food) {
        this.name = name;
        setAge(age);
        this.address = address;
        this.food = food;
    }

    // getter（读取）
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public String getFood() { return food; }

    // setter（修改）
    public void setName(String name) { this.name = name; }
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法：" + age);
        } else {
            this.age = age;
        }
    }
    public void setAddress(String address) { this.address = address; }
    public void setFood(String food) { this.food = food; }

    void eat() {
        System.out.println(age + "岁的" + name + "喜欢吃" + food);
    }
}
