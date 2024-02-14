package racingcar.controller

import racingcar.model.Car
import racingcar.view.inputCarName


fun run() {
    val carNames = inputCarName().split(",").map { it.trim() }
    for (carName in carNames) {
        Car(carName)
    }
}