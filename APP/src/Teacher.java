public class Teacher implements Comparable<Teacher> {
    
    private String firstName;

    public Teacher(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return 
            "------------------------------" +
            "\n* First Name : " + firstName;
    }
    
    @Override
    public int compareTo(Teacher o) {
        // TODO Auto-generated method stub
        return 0;
    }
   
}
