package KJH.Ch6ParallelProgramming.Executors;

import java.util.concurrent.Executor;

public class ExecutorExample implements Executor {
    @Override
    public void execute(Runnable task) {
        //방법 1. Runnable 인터페이스를 직접 실행한다.
        task.run();

//        방법 2. Thread를 생성해서 실행한다.
//        new Thread(task).start();
    }
}
