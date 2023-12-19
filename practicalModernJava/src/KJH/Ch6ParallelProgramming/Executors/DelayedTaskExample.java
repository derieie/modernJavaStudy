package KJH.Ch6ParallelProgramming.Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DelayedTaskExample {
    //ScheduledExecutor 사용 예
    public static void main(String[] args) {
        //ScheduledExecutorService 객체 생성
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();


        //스레드 3개 등록, 실행
        executorService.schedule(
                () -> System.out.println("TODO 1"), 1 , TimeUnit.SECONDS
        );
        executorService.schedule(
                () -> System.out.println("TODO 2"), 2 , TimeUnit.SECONDS
        );
        executorService.schedule(
                () -> System.out.println("TODO 3"), 3 , TimeUnit.SECONDS
        );
    }
}
