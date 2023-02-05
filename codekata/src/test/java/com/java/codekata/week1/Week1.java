package com.java.codekata.week1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Week1 {

    /**
     * Desc:    Using Streams Expression - generate powers of 5  upto range of 10
     * Hint:    dXNlIFN0cmVhbS5pdGVyYXRlIHRvIGNyZWF0ZSBpbmZpbml0ZSBzdHJlYW1z
     */
    @Test
    public void kata1(){
        List<Integer> computedList = Stream.iterate(5, n-> n*5 )
                .limit(10)
                .collect(Collectors.toList());
        List<Integer> outputList = Arrays.asList(5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125, 9765625);
        assertEquals(computedList,outputList);
    }

}
