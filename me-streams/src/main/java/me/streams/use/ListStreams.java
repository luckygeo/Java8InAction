package me.streams.use;

import me.streams.model.Apple;

import java.util.List;
import java.util.stream.Collectors;

public class ListStreams {

    public List filter(List<Apple> apples) {
        return apples.stream().filter((Apple t) -> "red".equals(t.getColor())).collect(Collectors.toList());

    }
}

