package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Vlad", "31", EnumBro.ADMIN);
        User user2 = new User("Olha", "28", EnumBro.USER);
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        System.out.println(arrayList.hashCode());

        TreeSet<String> treeSet = new TreeSet<>(arrayList);

   //     treeSet.add(user1);
    //    treeSet.add(user2);
        System.out.println(treeSet.size());



    }
}
class User implements Comparable<User>  {

    String name;
    String age;
    EnumBro enumBro;

    public User(String name, String age, EnumBro enumBro) {
        this.name = name;
        this.age = age;
        this.enumBro = enumBro;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        // how to right ))
        return 0;
    }
}

