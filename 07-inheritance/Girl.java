class Girl extends Women {
    String  school;

    public Girl(String name, int age, String address, String food, String school) {
        super(name, age, address, food);
        this.school = school;
    }
    @Override
    void eat(){
        System.out.println("来自"+school+"的"+getAge()+"岁的"+getName()+"喜欢吃"+getFood());
    }
}
