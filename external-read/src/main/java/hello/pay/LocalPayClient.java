package hello.pay;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalPayClient implements PayClient{
    @Override
    public void pay(int amount) {
        log.info("{} 입니다. 실제 결제는 이루어 지지 않습니다. 결제금액 : {}", this.getClass().getSimpleName() , amount);
    }
}
