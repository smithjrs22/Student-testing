

public class Tutorials {
    public static void main(String[] args){
        //Student anil = new Student();
        //Student shreesh = new Student("shreesh", 25);Student anjali = new Student();

        int[] marks = new int[10];
        Student[] students = new Student[3];

        // students[0] = anil;
        // students[1] = shreesh;
        // students[2]= anjali;

        students[0] = new Student("jen", 24);
        students[1] = new Student("jon", 25);
        students[2] = new Student();


        //anil.setNameAndAge("anil", 24);
        students[2].setNameAndAge("jennyjon", 31);
        //anil.introduce();
        students[0].introduce();
        students[1].introduce();
        students[2].introduce();
    }
}