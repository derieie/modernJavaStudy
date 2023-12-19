package KJH.Ch6ParallelProgramming.Executors;

import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) {
        //Executor를 사용하는 예
        Executor executor = new ExecutorExample();
        executor.execute( () -> System.out.println("Hello, Executor!!!") );

        /* Executor를 직접 상속하고 정의할 일은 거의 없다.
        * 왜냐하면 스레드를 생성하는 것으로 끝나기 때문에 기존의 방법과
        * 차이가 없기 때문이다.
        * */
    }
}
