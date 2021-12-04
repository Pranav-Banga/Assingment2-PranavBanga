import java.util.Vector;

public class Student extends Person{
    private String id;
    private String name;
    private Vector<Course> courses = new Vector<Course>(); // contains all courses the student is registered in


    public Student(String stdId, String stdName) {
        this.name = stdName;
        this.id = stdId;
    }


    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public void registerFor(Course courseN)
    {
        courses.add(courseN);

    }

    public String toString()
    {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
        System.out.println(this.id + " "  + this.name);
        System.out.println("REGISTERED COURSES  :  ");
        for(int i = 0;i<courses.size();i++)
        {
            System.out.print(courses.get(i).getCode() + "    " + courses.get(i).getNumber() + "    ");
        }
        System.out.println(" ");
        return " ";
    }

    public boolean equals(Student student)
    {
        if(this.id == student.getId())
        {
            if (name.equals(student.getName()))
            {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isRegisteredInCourse(Course cour)
    {
        int k = 0;
        while(k<courses.size())
        {
            if(cour.getCode().equals(courses.get(k).getCode()))
            {
                if(cour.getNumber() == courses.get(k).getNumber())
                {
                    return true;
                }
            }
            k++;
        }
        return false;
    }

    public boolean isRegisteredInCourse(int number){
        int m = 0;
        while(m<courses.size())
        {
            if(courses.get(m).getNumber() == number)
            {
                return true;
            }
            m++;
        }
        return false;
    }
}
