package me.streams.use;

import me.streams.model.Apple;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ListStreamsTest {

    List<Apple> list = new ArrayList();
    ListStreams streams =null;
    @BeforeMethod
    public void setUp() {
        list.add(new Apple("red", -1));
        list.add(new Apple("black", 9));
        list.add(new Apple("red", 10));
        list.add(new Apple("yellow", 10));
        streams = new ListStreams();
    }

    @Test
    public void testFilter() {
        List<Apple> list1 = streams.filter(list);
            Assert.assertEquals(list1.get(0).getColor(), "red");
            Assert.assertEquals(list1.get(1).getColor(), "green");

    }
}