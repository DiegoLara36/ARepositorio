package exColecciones.Comparator;

import java.util.Comparator;

public class JobCandidate    {

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
  /*  @Override
    //COMPARACION SEGUN LOS EDAD
    public int compareTo(JobCandidate o) {
        //comparando la edad del objeto con la edad ???
        return (this.age-o.getAge());
        //nombre del objeto , comparado con el objeto del argument
    }*/
        //COMPARATOR (EL ORDEN NATURAL)
    public static Comparator<JobCandidate> ageComparator = new Comparator<JobCandidate>(){
        //  ES MAS COMPLICADO QUE EL ANTERIOR CTV
        //subclase

        @Override//esta comparando dos objetos distintos
        public int compare(JobCandidate o1, JobCandidate o2) {
            //darle lo que quiereas comparar, la misma vaina, solo que sin implementar la clase Compare
            return (o1.getAge() - o2.getAge());
        }
        //ventajas, puede ser mas de una
    };
    public static Comparator<JobCandidate> nameComparator = new Comparator<JobCandidate>(){
        //  ES MAS COMPLICADO QUE EL ANTERIOR CTV
        //subclase

        @Override//esta comparando dos objetos distintos
        public int compare(JobCandidate o1, JobCandidate o2) {
            //darle lo que quiereas comparar, la misma vaina, solo que sin implementar la clase Compare
            return (int)(o1.getName().compareTo(o2.getName()));
        }
        //ventajas, puede ser mas de una
    };
}
