package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Vlad", 31, EnumBro.ADMIN, "111");
        User user2 = new User("Olha", 28, EnumBro.USER, "222");
        User user3 = new User("Masha", 32, EnumBro.GUEST, "333");
        User user4 = new User("Aliona", 27, EnumBro.AUTORIZATE, "242");
        User user5 = new User("Marina", 30, EnumBro.GUEST, "2242");
        User user6 = new User("Dima", 21, EnumBro.USER, "222");
        User user7 = new User("Petya", 22, EnumBro.USER, "222");
        User user8 = new User("Vova", 23, EnumBro.USER, "222");
        User user9 = new User("Vita", 24, EnumBro.USER, "222");
        User user10 = new User("Oksana", 25, EnumBro.USER, "222");
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add((user1));
        arrayList.add((user2));
        arrayList.add((user3));
        arrayList.add((user4));
        arrayList.add((user5));
        arrayList.add((user6));
        arrayList.add((user7));
        arrayList.add((user8));
        arrayList.add((user9));
        arrayList.add((user10));
        System.out.println(arrayList.hashCode());
        System.out.println(arrayList);

        TreeSet<User> treeSet = new TreeSet<>(arrayList);
        System.out.println(treeSet.size());
        System.out.println(treeSet);


    }
}
class User implements Comparable<User> {

    String name;
    int age;
    String password;
    EnumBro enumBro;

    public User(String name, int age, EnumBro enumBro, String password) {
        this.name = name;
        this.age = age;
        this.enumBro = enumBro;
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(User u) {
      if (u.age > this.age) {
          return -1;
      }
      if (u.age == this.age){
          return 0;}
          if (u.age < this.age){
              return 1;
      }
          if (u.enumBro == this.enumBro) {
                return 0;          }
      /*  if (u.enumBro > this.enumBro) {
            return 1;          }
        if (u.enumBro < this.enumBro) {
            return -1;          }
*/
        else return 0;
    }


}

