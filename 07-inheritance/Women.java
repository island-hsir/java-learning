class Women {
    private String name;
    private int age;
    private String address;
    private String food;

    public Women(String name, int age, String address, String food) {
        this.name = name;
        setAge(age);
        this.address = address;
        this.food = food;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public String getFood() { return food; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法：" + age + "  更改失败！");
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
// class Mian{

// }