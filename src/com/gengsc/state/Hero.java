package com.gengsc.state;

public class Hero {

    public static RunState COMMON_SPEED = new CommonState();

    public static RunState SPEED_UP = new SpeedUpState();

    public static RunState SPEED_DOWN = new SpeedDownState();

    public static RunState VERTIGO = new VertigoState();

    private RunState state = COMMON_SPEED;

    private Thread runThread;

    public RunState getState() {
        return state;
    }

    public void setState(RunState state) {
        this.state = state;
    }

    public void stopRun() {
        if (isRunning()) {
            runThread.interrupt();
            System.out.println("------------------------------停止跑动---------------------");
        }
    }

    private boolean isRunning() {
        return runThread != null && !runThread.isInterrupted();
    }

    public void startRun() {
        if (isRunning()) {
            return;
        }

        final Hero hero = this;
        runThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!runThread.isInterrupted()) {
                    state.run(hero);
                }
            }
        });

        System.out.println("--------------------开始跑动--------------------");
        runThread.start();
    }
}
