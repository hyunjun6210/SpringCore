package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();


    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 Private 으로 선언하여 외부에서 new 생성 금지
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
