package com.liuhui.builder;

/**
 * @author liuhui
 * @date 2018-04-23 下午5:30
 */
public class Student {
    private int age;
    private String address;
    public Student(Builder builder){
        this.age=builder.age;
        this.address=builder.address;
    }

    public static class Builder{
        private int age;
        private String address;

        public Builder setAge(Integer age){
            this.age=age;
            return this;
        }
        public Builder setAddress(String address){
            this.address=address;
            return this;
        }
        public Student builder(){
            return new Student(this);
        }
    }

    public static void main(String[] args) {
        Student student=new Builder().setAddress("aa").setAge(12).builder();
    }
}
