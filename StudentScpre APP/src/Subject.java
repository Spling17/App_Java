public class Subject {
    
    private String subjectName;
    private int period;

    public Subject(String subjectName, int period){
        this.subjectName = subjectName;
        this.period = period;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return 
            "\n  Subject : " + subjectName + 
            "---- Period : " + period;
    }
}
