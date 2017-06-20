package com.pattern.service.builder;

/**
 * Created by xuliangxiao on 2017/6/20 16:15
 */
public class People {
    private int id;//必填
    private String name;//必填
    private int age;//必填

    private String address;//地址 非必填
    private String phone;   //手机号 非必填

    public People(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    /**
     * 内部类，负责构建外部类的对象
     */
    final static class Builder{
        private int id;
        private String name;
        private int age;
        private String address;
        private String phone;

        public Builder(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Builder buildId(int id) {
            this.id = id;
            return this;
        }

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildAge(int age) {
            this.age = age;
            return this;
        }

        public Builder buildAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder buildPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public People build(){
            return new People(this);
        }

    }

}
