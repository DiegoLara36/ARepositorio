package exColecciones.Comparable;

import java.util.Collections;

public class JobCandidate  implements  Comparable<JobCandidate>  {

    private String name;
    private String gender;
    private int age;

    public JobCandidate(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "JobCandidate{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
    //dos formas una es darle la forma desde el comparable
    //implementandolo en la clase

  /*  @Override
    //COMPARACION SEGUN LOS NOMBRES
    public int compareTo(JobCandidate o) {
            //comparando la edad del objeto con la edad ???
        return this.name.compareTo(o.getName());
        //nombre del objeto , comparado con el objeto del argument
    }*/
    @Override
    //COMPARACION SEGUN LOS EDAD
    public int compareTo(JobCandidate o) {
        //comparando la edad del objeto con la edad ???
        return (this.age-o.getAge());//la comparacion es la resta de edades
        //nombre del objeto , comparado con el objeto del argument
    }


}
