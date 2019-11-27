package com.tedu.cn.ob;

public class Person {
    private String name;
    private int age;
    private double height;
    private char gender;
    private double weught;

    public Person(String name, int age, double height, char gender, double weught) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.weught = weught;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeught() {
        return weught;
    }

    public void setWeught(double weught) {
        this.weught = weught;
    }
    /*
    *重写equals方法，比较的是两个对象的内容
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person p=(Person) obj;
            return this.age==p.age?true:false;
        }
        return false;
    }
    @Override
    public  String toString(){
        return "姓名："+this.name+"年龄:"+this.age+"身高:"+this.height+"体重"+this.weught+"性别"+this.gender;
    }


}
