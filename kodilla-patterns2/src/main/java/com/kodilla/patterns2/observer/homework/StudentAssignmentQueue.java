package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentAssignmentQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> assignments;
    private final String studentName;

    public StudentAssignmentQueue(String studentsName) {
        observers = new ArrayList<>();
        assignments = new ArrayList<>();
        this.studentName = studentsName;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getAssignments() {
        return assignments;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addAssignment(String assignment) {
        assignments.add(assignment);
        notifyObservers();
    }
}
