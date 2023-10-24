package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class FizzBuzzTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
        
    }

    @Test
        @DisplayName(value= "Return the Number 1 when given 1")
        public void returns1WhenGiven1() {
            final String actual = FizzBuzz.of(1);
            assertThat(actual, is("1"));
        }

        @Test
        @DisplayName(value = "Returns The Fizz if 3")
        public void returnsTheValueFizzWhenGiven3() {
            final String actual = FizzBuzz.of(3);
            assertThat(actual, is("Fizz"));
        }

        @Test
        @DisplayName(value = "Returns the Number 4 when Given 4")
        public void returns4WhenGiven4() {
            final String actual = FizzBuzz.of(4);
            assertThat(actual, is("4"));
        }

        @Test
        @DisplayName(value = "Returns Buzz When Given 5")
        public void returnsBuzzWhenGiven5() {
            final String actual = FizzBuzz.of(5);
            assertThat(actual, is("Buzz"));
        }


        @Test
        @DisplayName(value = "Returns Buzz When Given 5")
        public void returnsBuzzWhenGivenLargeNumberDivisibleBy5() {
            final String actual = FizzBuzz.of(55);
            assertThat(actual, is("Buzz"));
        }

        @Test
        @DisplayName(value = "Returns FizzBuzz When Given a Number Divisible by 3 and 5")
        public void returnsFizzBuzzWhenGivenNumberDivisibleBy5and3() {
            final String actual = FizzBuzz.of(5235);
            assertThat(actual, is("FizzBuzz"));
        }

        @Test
        @DisplayName(value = "return the fizz if divisible by 3")
        public void returnsthevalueFizzLargeNumber() {
            final String actual = FizzBuzz.of(321);
            assertThat(actual, is("Fizz"));
        }

        @Test
        @DisplayName(value = "Returns Value When Given 0")
        public void returnsErrorWhenGivenText() {
            final String actual = FizzBuzz.of(0);
            assertThat(actual, is(0));
        }
     


        
}