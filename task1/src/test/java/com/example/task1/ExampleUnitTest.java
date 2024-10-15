package com.example.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void oneChar_isCorrect() { assertEquals("a",Solution.shrink_space_v2(" a "));}
    @Test
    public void null_isCorrect() { assertEquals("",Solution.shrink_space_v2(""));}
    @Test
    public void withoutSpace_isCorrect() { assertEquals("testmessage",Solution.shrink_space_v2("testmessage"));}
    @Test
    public void beginningSpace_isCorrect() { assertEquals("testmessage",Solution.shrink_space_v2(" testmessage"));}
    @Test
    public void multiText_isCorrect() { assertEquals("Areyouhungry?\n-Aaaarrrgh!",Solution.shrink_space_v2("Are you hungry?\n- Aaaarrrgh!"));}

}