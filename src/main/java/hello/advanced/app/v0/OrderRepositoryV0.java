package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class OrderRepositoryV0 {

    public void save(String itemId) {
        // 저장로직
        if (itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생!");
        }
        // 일반적으로 상품을 저장할 때 1초(1000ms)가 걸린다고 가정한다.
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
