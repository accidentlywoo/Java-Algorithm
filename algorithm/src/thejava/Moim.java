package thejava;

public class Moim {

    int maxNumberOfAttendees;

    int numberOfEnrollment;

    public boolean iEnrollmentFull(){
        if(maxNumberOfAttendees == 0 )
            return  false;
        if(numberOfEnrollment < maxNumberOfAttendees)
            return false;
        return true;
    }
}
