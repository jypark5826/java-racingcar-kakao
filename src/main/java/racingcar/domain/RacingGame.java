package racingcar.domain;

import java.util.List;

public class RacingGame {
    private final Cars cars;
    private final int time;
    private int currentTime;
    private MovingStrategy movingStrategy;

    public RacingGame(String carName, int time, MovingStrategy movingStrategy) {
        this.cars = new Cars(carName);
        this.time = time;
        this.movingStrategy = movingStrategy;
    }

    public Cars getCars() {
        return cars;
    }

    public List<Car> getWinners() {
        return cars.getWinners();
    }

    public boolean isEnd() {
        return time <= currentTime;
    }

    public void race() {
        cars.moveAll(movingStrategy);
        currentTime++;
    }
}
