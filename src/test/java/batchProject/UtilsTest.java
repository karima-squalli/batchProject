/**
 * 
 */
package batchProject;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

/**
 * Utils Test
 * @author karima.squallihoussa
 *
 */
public class UtilsTest extends TestCase {

	/**
	 * Test method for {@link batchProject.Utils#convertDoubleWithComaToDoubleWithDot(java.lang.String)}.
	 */
	public void testConvertDoubleWithComaToDoubleWithDot() {
		Double double1 = Utils.convertDoubleWithComaToDoubleWithDot("2010,11");
		Double double1Compare = 2010.11;
		Assert.assertEquals(double1, double1Compare);
	}
	
	/**
	 * Test method for {@link batchProject.Utils#convertDoubleWithComaToDoubleWithDot(java.lang.String)}.
	 */
	public void testConvertDoubleWithoutComaToDoubleWithDot() {
		Double double1 = Utils.convertDoubleWithComaToDoubleWithDot("2010");
		Double double1Compare = 2010.0;
		Assert.assertEquals(double1, double1Compare);
	}
	
	/**
	 * Test method for {@link batchProject.Utils#convertDateToString(java.util.Date)}.
	 * @throws ParseException 
	 */
	public void testConvertDateToString() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(2021, 11, 15);
	    Date date = calendar.getTime();
	    assertEquals("15/12/2021", Utils.convertDateToString(date));
	  }

	/**
	 * Test method for {@link batchProject.Utils#convertStringToDate(java.lang.String)}.
	 * @throws ParseException 
	 */
	public void testStringToDate() throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2021,11,15,0,0,0);
		Date date = calendar.getTime();
	    Date dateCompare = Utils.convertStringToDate(Utils.convertDateToString(date));
	    Assert.assertEquals(date, dateCompare);
	}
}
