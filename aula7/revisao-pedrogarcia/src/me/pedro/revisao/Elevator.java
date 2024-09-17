package me.pedro.revisao;

public class Elevator {
    private int currentFloor = 0;
    private int totalNumberOfFloors = 0;
    private int maxCapacity = 0;
    private int currentNumberOfPeople = 0;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getTotalNumberOfFloors() {
        return totalNumberOfFloors;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentNumberOfPeople() {
        return currentNumberOfPeople;
    }

    public void init(int maxCapacity, int totalNumberOfFloors) {
        currentFloor = 0;
        currentNumberOfPeople = 0;

        this.maxCapacity = maxCapacity;
        this.totalNumberOfFloors = totalNumberOfFloors;
    }

    public boolean peopleEnters() {
        if (currentNumberOfPeople < maxCapacity) {
            currentNumberOfPeople++;
            return true;
        }
        return false;
    }

    public boolean personLeaves() {
        if (currentNumberOfPeople > 0) {
            currentNumberOfPeople--;
            return true;
        }
        return false;
    }

    public boolean goUp() {
        if (currentFloor < totalNumberOfFloors) {
            currentFloor++;
            return true;
        }
        return false;
    }

    public boolean goDown() {
        if(currentFloor > 0) {
            currentFloor--;
            return true;
        }
        return false;
    }
}
