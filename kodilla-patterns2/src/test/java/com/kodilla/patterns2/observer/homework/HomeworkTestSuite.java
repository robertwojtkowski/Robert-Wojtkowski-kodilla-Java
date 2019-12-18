package com.kodilla.patterns2.observer.homework;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentAssignmentQueue peter = new StudentAssignmentQueue("Peter");
        StudentAssignmentQueue anna = new StudentAssignmentQueue("Anna");
        StudentAssignmentQueue james = new StudentAssignmentQueue("James");
        StudentAssignmentQueue nate = new StudentAssignmentQueue("Nate");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        Mentor jessiePinkman = new Mentor("Jessie Pinkman");
        peter.registerObserver(johnSmith);
        anna.registerObserver(ivoneEscobar);
        james.registerObserver(jessiePinkman);
        nate.registerObserver(jessiePinkman);
        //When
        peter.addAssignment("a1_20191116");
        peter.addAssignment("a2_20191123");
        peter.addAssignment("a3_20191130");
        anna.addAssignment("a1_20191116");
        anna.addAssignment("a2_20191123");
        james.addAssignment("a1_20191116");
        james.addAssignment("a2_20191123");
        james.addAssignment("a3_20191130");
        james.addAssignment("a4_20191207");
        nate.addAssignment("b1_20191214");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
