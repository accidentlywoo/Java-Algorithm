package thejava;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

class MoimTest {

    @Test
    public void isFull(){
        Moim moim = new Moim();
        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 10;
        Assert.assertFalse(moim.iEnrollmentFull());
    }
}