package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs ;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {

        for(Lab lab : labs){
            if(lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        boolean exist = false;
        for(Lab lab : labs){
            if (lab.getName().equals(labName)){
                exist = true;
                lab.setStatus(labStatus);
                break;
            }
            }
        if (!exist){ throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }


}
