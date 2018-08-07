package com.idark.ioc.injection.entity;

/**
 * @description:
 * @author: iDark
 * @create: 2018/8/3 17:01
 * @email: 43352901@qq.com
 */
public class User implements Comparable<User> {
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer age;

    @Override
    public int compareTo(User o) {
        return 0;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this ==obj){
            return true;
        }
        if (obj instanceof User){
            if(this.getName().equals(((User) obj).getName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "hashcode='" + this.hashCode() + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +

                '}';
    }
}
