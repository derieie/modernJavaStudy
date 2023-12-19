package KJH.Ch6ParallelProgramming.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    //ExecutorService 사용 예
    public static void main(String[] args) {
//        ExecutorService 객체 생성
//        Executors : 병렬처리에 필요한 여러가지 패턴을 사전에 정의한 클래스.
//        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // newFixedThreadPool 메서드 (스레드 풀이 2개인 ExecutorService 생성)
//        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // 캐싱 스레드 풀 생성 <- 여러 스레드를 병렬 처리, 실행하는 스레드 수에 제한 없이 등록한 모든 스레드를 동시에 처리
        ExecutorService executorService = Executors.newCachedThreadPool();

//        Thread를 생성하고 실행시킨다.
        executorService.execute(new MyTask("TODO 1"));
        executorService.execute(new MyTask("TODO 2"));
        executorService.execute(new MyTask("TODO 3"));
        //ExecutorService를 종료시킨다.
        executorService.shutdown();
    }

}
class MyTask implements Runnable {
    private String id;
    private int count = 5;
    @Override
    public void run() {
        for(int i = 0; i < count; i++ ) {
            System.out.println("Task Id : " + id + ", running ..." + i );
        }
        try {
            //                    컨커런트 API에 추가된 시간 관련 클래스.
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e ) {
            e.printStackTrace();
        }
    }
    public MyTask(String id) {
        this.id = id;
    }
}