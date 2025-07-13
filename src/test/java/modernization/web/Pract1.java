package modernization.web;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

public class Pract1 
{

    @Test 
    public void problem1() throws IOException
    {
      String ptext = "asd22ghj45klo67";
      String[] alpastr = ptext.split("\\d+");
      System.out.println(Arrays.asList(alpastr));
    }
}