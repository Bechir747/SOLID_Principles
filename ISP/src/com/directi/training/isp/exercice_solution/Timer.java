package com.directi.training.isp.exercice_solution;

import com.directi.training.isp.exercise.Door;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final TimeOutCallBack door)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                door.timeOutCallback();
            }
        }, timeOut);
    }
}
