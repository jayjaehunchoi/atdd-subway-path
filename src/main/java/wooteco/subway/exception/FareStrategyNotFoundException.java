package wooteco.subway.exception;

public class FareStrategyNotFoundException extends SubwayException {

    public FareStrategyNotFoundException() {
        super("[ERROR] 요금 정책을 찾을 수 없습니다.");
    }
}