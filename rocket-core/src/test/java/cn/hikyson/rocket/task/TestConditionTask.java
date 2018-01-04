package cn.hikyson.rocket.task;

/**
 * Created by kysonchao on 2017/12/28.
 */
public abstract class TestConditionTask extends LaunchTask {
    private TaskCallback mTaskCallback;
    private long mRunTime;


    public TestConditionTask(TaskCallback taskCallback, long runTime) {
        mTaskCallback = taskCallback;
        mRunTime = runTime;
    }

    @Override
    public void run() throws Throwable {
        Thread.sleep(mRunTime);
    }
}
