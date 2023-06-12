package hello.pay;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProdPayClient implements PayClient{
    @Override
    public void pay(int amount) {
        log.info("{} 입니다. 실제 결제가 이루어 집니다. 결제금액 : {}", this.getClass().getSimpleName() , amount);
    }
}
