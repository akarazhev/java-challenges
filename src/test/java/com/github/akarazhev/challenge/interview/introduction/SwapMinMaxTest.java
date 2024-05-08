package com.github.akarazhev.challenge.interview.introduction;

import com.github.akarazhev.challenge.interview.util.AssortedMethods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Swap Min Max Test")
public final class SwapMinMaxTest {

    @Test
    @DisplayName("test Swap Min Max Better")
    public void testSwapMinMaxBetter() {
        int[] array = AssortedMethods.randomArray(10, -10, 10);
        System.out.println(AssortedMethods.arrayToString(array));
        SwapMinMax.swapMinMaxBetter(array);
        System.out.println(AssortedMethods.arrayToString(array));
    }
}
