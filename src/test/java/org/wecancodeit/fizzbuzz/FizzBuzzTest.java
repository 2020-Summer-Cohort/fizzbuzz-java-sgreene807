package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


// 2 Should Say "Two"
// 3 Should Say "Fizz"
// 4 Should Say "Four"
// 5 Should Say "Buzz"

public class FizzBuzzTest {
    @Test
    public void shouldInstantiate() {
        FizzBuzz underTest = new FizzBuzz();
    }

    @Test
    public void oneShouldSayOne() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(1);
        //assertion
        assertEquals("1", result);
    }

    @Test
    public void twoShouldSayTwo() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(2);
        //assertion
        assertEquals("2", result);
    }

    @Test
    public void threeShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void fourShouldSayFour() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(4);
        assertEquals("4", result);
    }

    @Test
    public void fiveShouldSayFive() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void sixShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void tenShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void fifteenShouldSayFifteen() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(15);
        assertEquals("15", result);

    }

    @Test
    public void thirtyShouldSayThirty() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(30);
        assertEquals("30", result);
    }

}
