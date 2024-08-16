package modernization.web;

import java.io.IOException;

import org.testng.annotations.Test;


public class AppTest 
{
	CustomStack CS  = new CustomStack();
	ExcelStack ES = new ExcelStack();

    @Test 
    public void shouldAnswerWithTrue() throws IOException
    {
       String cellval = ExcelStack.getCellValue("DataSheet","Sheet1");
       System.out.println(CS.generateRandomNumber(1000));
       System.out.println(cellval);
    }
}
