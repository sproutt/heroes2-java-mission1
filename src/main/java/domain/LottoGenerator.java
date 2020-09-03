package domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoGenerator {
    private static final List<Integer> LOTTO_NO_POOLS = IntStream.rangeClosed(1, 45).boxed().collect(Collectors.toList());;

    public static Lotto generateLottoWithNos(List<Integer> lottoNos) {
        // TODO 숫자가 1 ~ 45 범위에 있지 않으면 에러
        return new Lotto(lottoNos);
    }

    public static Lotto generateAutoLotto() {
        return generateLottoWithNos(getRandomNos());
    }


    private static List<Integer> getRandomNos() {
        Collections.shuffle(LOTTO_NO_POOLS);
        return LOTTO_NO_POOLS.subList(0, 6);
    }
}
