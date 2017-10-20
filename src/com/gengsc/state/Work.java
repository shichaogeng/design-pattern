package com.gengsc.state;

public class Work {
    private WorkState cuurent;

    private double hour;

    private boolean finished;

    public Work() {
        cuurent = new ForenoonState();
    }

    public WorkState getCuurent() {
        return cuurent;
    }

    public void setCuurent(WorkState cuurent) {
        this.cuurent = cuurent;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void WriteProgram() {

    }
}
