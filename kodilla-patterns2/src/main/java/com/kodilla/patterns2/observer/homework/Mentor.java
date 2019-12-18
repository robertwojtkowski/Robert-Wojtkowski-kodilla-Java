package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(StudentAssignmentQueue studentAssignmentQueue) {
        System.out.println(username + ": A new assignment has been added from " + studentAssignmentQueue.getStudentName() + "\n" +
                " (total: " + studentAssignmentQueue.getAssignments().size() + " assignments)");
        updateCount++;
    }


}
