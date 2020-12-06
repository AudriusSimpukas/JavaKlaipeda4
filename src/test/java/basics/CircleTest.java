package basics;

import FundamentalsTesting.Circle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void calculateCircleLength() {
        // given
        Circle first = new Circle(2);

        // when
        double result = first.circleLength();

        // then
        Assertions.assertThat(result).isEqualTo(Math.PI * 4);
    }

    @Test
    public void calculatePerimeter() {
        // given
        Circle second = new Circle(2);

        // when
        double result = second.circleArea();

        // then
        Assertions.assertThat(result).isEqualTo(Math.PI * 4);

    }
}
