package Test.lab_31;

import lab_31.lab_31;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class lab_31Test {

    @org.junit.Test
    public void divide() {
        int expected = 3;
        int actual = lab_31.divide(6,2);
        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void divide_ByZero() {
        int expected = 3;
        int actual = lab_31.divide(6,0);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add() {
        int actual = lab_31.add(5,4);
        int expected = 9;
        Assert.assertEquals(actual,expected);
    }
}