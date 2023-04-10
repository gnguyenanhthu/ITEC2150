package ch2a_2c_composition;

public class Main
{
    public static void main(String[] args)
    {
        Student john = new Student("John");
        john.addClassTime("MW 8:00-9:45 am");
        john.addClassTime("MWF 10:00-10:15 am");
        john.addClassTime("TuTh 4:00-5:45 pm");
        
        System.out.println(john.getSchedule());
    }
}