package KJH.Ch6ParallelProgramming.Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PeriodTaskExample {
    //일정 시간 간격으로 스레드를 실행하는 예
    public static void main(String[] args) {
        //SheculedExecutorService 객체 생성
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        //5초 후에 실행, 종료 후 10초 대기 후 반복실행
        executorService.scheduleWithFixedDelay(
                new MyTask("Delayed 1"), 5 , 10 , TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(
                new MyTask("Rate 1"), 5 , 10 , TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(
                new MyTask("Rate 2"), 5 , 10 , TimeUnit.SECONDS);

    }
}
