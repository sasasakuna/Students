package model;

public class Student {
    private int id;
    private String name;
    private double grade;
    private String gender;
    private String status;

    public Student(int id, String name, double grade, String gender) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.gender = gender;
        if (grade < 60)
            this.status = "danger";
        else if (grade >= 60 && grade < 100)
            this.status = "active";
        else if (grade == 100)
            this.status = "success";
        else {}
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (Double.compare(student.grade, grade) != 0) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(grade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
