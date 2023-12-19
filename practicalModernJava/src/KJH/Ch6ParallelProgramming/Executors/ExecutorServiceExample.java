package KJH.Ch6ParallelProgramming.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    //ExecutorService 사용 예
    public static void main(String[] args) {
//        ExecutorService 객체 생성
//        Executors : 병렬처리에 필요한 여러가지 패턴을 사전에 정의한 클래스.
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Thread를 생성하고 실행시킨다.
//        executorService.execute(new MyTask);
    }

    class MyTask implements Runnable {
        private String id;
        private int count = 5;
        @Override
        public void run() {
                for(int i = 0; i < count; i++ ) {
                    System.out.println("Task Id : " + id + ", rimmomg ..." + i );
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
}
