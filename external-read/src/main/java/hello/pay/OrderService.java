package hello.pay;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService {

    private final PayClient payClient;

    public void order(int amount){
        log.info("주문 관련된 로직이 처리됩니다.");
        payClient.pay(amount);
    }

}
