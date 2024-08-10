public class Student {
    private String name;
    private int rollNumber;
    private double[] grades;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new double[0];
    }

    public void addGrade(double grade) {
        double[] newGrades = new double[grades.length + 1];
        System.arraycopy(grades, 0, newGrades, 0, grades.length);
        newGrades[grades.length] = grade;
        grades = newGrades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public String getStudentInfo() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}
