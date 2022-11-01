import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Information {
    ArrayList<Subject> subjectList = new ArrayList<>();
    static HashMap<Teacher, ArrayList<Subject>> teachersList = new HashMap<>();

    public Information() {
        init();
    }

    public static void init() {
        
        Subject KIN = new Subject("Kinyarwanda", 3);
        Subject ENG = new Subject("English", 5);
        Subject LIT = new Subject("Literature", 1);
        Subject SW = new Subject("Swahli", 2);
        Subject Fr = new Subject("Franch", 2);
        Subject PHY = new Subject("Physics", 4);
        Subject CHE = new Subject("Chemistry", 4);
        Subject BIO = new Subject("Biology", 4);
        Subject Math = new Subject("Math", 6);
        Subject GEO = new Subject("Geography", 3);
        Subject HIS = new Subject("Histry", 3);
        Subject REL = new Subject("Religion", 2);
        Subject Lib = new Subject("Library", 1);
        Subject PE = new Subject("P.E.", 1);
        Subject ENT = new Subject("Entrepreneurship", 2);
        Subject ICT = new Subject("ICT", 2);

        //-----------------------------------------------------------------

        teachersList.put(new Teacher("Emmanuel"), selectSubjects(Arrays.asList(GEO,HIS,REL)));
        teachersList.put(new Teacher("Betty"), selectSubjects(Arrays.asList(GEO,HIS,REL)));
        teachersList.put(new Teacher("Etienne"), selectSubjects(Arrays.asList(CHE,BIO)));
        teachersList.put(new Teacher("Landourd"), selectSubjects(Arrays.asList(PHY,Math)));
        teachersList.put(new Teacher("Loise"), selectSubjects(Arrays.asList(BIO)));
        teachersList.put(new Teacher("Bona"), selectSubjects(Arrays.asList(CHE,PHY)));
        teachersList.put(new Teacher("Malakie"), selectSubjects(Arrays.asList(ICT,PE)));
        teachersList.put(new Teacher("Vedaste"), selectSubjects(Arrays.asList(Lib,ENT)));
        teachersList.put(new Teacher("Leatitia"), selectSubjects(Arrays.asList(ENG,LIT)));
        teachersList.put(new Teacher("Isaei"), selectSubjects(Arrays.asList(ENG,KIN)));
        teachersList.put(new Teacher("Clarisse"), selectSubjects(Arrays.asList(KIN,Fr)));
        teachersList.put(new Teacher("Agnes"), selectSubjects(Arrays.asList(LIT,SW)));
        
    }
    
    public void info(){
        // System.out.println(teachersList);
        for(Map.Entry<Teacher,ArrayList<Subject>> entry : teachersList.entrySet()){
            System.out.println(entry.getKey());
        }
    }
    
    public static ArrayList<Subject> selectSubjects(List<Subject> subjects){
        
        ArrayList<Subject> tempList = new ArrayList<>();
        
        for(Subject sub : subjects){
            tempList.add(sub);
        }
        return tempList;
    }

    public Map.Entry<Teacher,ArrayList<Subject>> eachTeacher(String name){
        // for (Teacher key : teachersList.keySet()) {
        //     if(key.getFirstName().equals(name)){
        //         return key;
        //     }
        // }

        for(Map.Entry<Teacher,ArrayList<Subject>> entry : teachersList.entrySet()){
            // System.out.println(entry.getKey()); 
            if(entry.getKey().getFirstName().equals(name)){
                return entry;
            }
        }

        return null;

    }

    public static void eachSubject(){
        // for(Map.Entry<Teacher,ArrayList<Subject>> entry : teachersList.entrySet()){
        //     System.out.println(entry.getKey()); 
    }
}


// subjectList.add(new Subject("KIN", 3));
// subjectList.add(new Subject("LIT", 1));
// subjectList.add(new Subject("SW", 2));
// subjectList.add(new Subject("Fr", 2));
// subjectList.add(new Subject("PHY", 4));
// subjectList.add(new Subject("CHE", 4));
// subjectList.add(new Subject("BIO", 4));
// subjectList.add(new Subject("Math", 6));
// subjectList.add(new Subject("GEO", 3));
// subjectList.add(new Subject("HIS", 3));
// subjectList.add(new Subject("REL", 2));
// subjectList.add(new Subject("Libr", 1));
// subjectList.add(new Subject("P.E.", 1));
// subjectList.add(new Subject("ENT", 2));
// subjectList.add(new Subject("ICT", 2));