package me.streams.use;

import me.streams.model.Apple;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.sun.tools.doclint.Entity.lambda;
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

    @Test
    public void testStreams() {

        //get stream from collection
        //sequential  stream.
        Stream sequentialStream = list.stream();
        //sequential
        Stream parallelStream = list.parallelStream();
        Map map = new HashMap();
        List listApple =  Arrays.asList(new Apple("red", 10),new Apple("yellow", 0));
        Predicate<Apple> predicate = (x) -> x.equals("gao");

        Arrays.stream(new Apple[] {new Apple("red", 10),new Apple("yellow", 0)}).filter(predicate);//惰性求值筛选
    }
}