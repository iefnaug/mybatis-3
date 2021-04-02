package org.apache.ibatis.reflection.property;

import org.junit.jupiter.api.Test;

/*
 * @author GF
 * @since 2021/4/2
 */
public class PropertyCopierTest {

  static class Person {
    private String name;

    public String getName() {
      return name;
    }

    public Person setName(String name) {
      this.name = name;
      return this;
    }
  }

  static class Student extends Person {
    private String hobby;


    public String getHobby() {
      return hobby;
    }

    public Student setHobby(String hobby) {
      this.hobby = hobby;
      return this;
    }
  }

  @Test
  public void test01() {
    Person person = new Person();
    person.setName("person");

    Student student = new Student();
    student.setName("student");
    student.setHobby("play");

    PropertyCopier.copyBeanProperties(Student.class, student, person);
    System.out.println();

  }

}
