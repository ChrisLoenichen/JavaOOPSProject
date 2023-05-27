package JavaOOPS1;
/*
We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
public abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks {
    private double [] marks;
    public StudentA(double subject1, double subject2, double subject3){
        marks = new double[]{subject1,subject2,subject3};
    }
    @Override
    double getPercentage() {
        double total = 0;
        for(double mark : marks) total += mark;
        return (total / marks.length);
    }
}
class StudentB extends Marks {
    private double [] marks;
    public StudentB(double subject1, double subject2, double subject3, double subject4){
        marks = new double[]{subject1,subject2,subject3,subject4};
    }

    @Override
    double getPercentage() {
        double total = 0;
        for(double mark : marks) total += mark;
        return (total / marks.length);
    }

    public static void main(String[] args) {
        StudentA studentA= new StudentA(75,85,95);
        System.out.println("Average percentage for Student A is "+studentA.getPercentage()+"%");
        StudentB studentB= new StudentB(70,88,85,99);
        System.out.println("Average percentage for Student B is "+studentB.getPercentage()+"%");
    }
}
