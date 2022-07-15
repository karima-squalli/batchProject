/**
 * 
 */
package batchProject;

import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.Mockito.Annotations;
import org.mockito.MockitoAnnotations;

import com.io.read.Reader;
import com.io.write.Writer;

/**
 *  * Main Test
 * @author karima.squallihoussa
 *
 */
public class MainTest {

	// classes Mocker
	private Reader reader_mock;
	private Writer writer_mock;
	
	@Before
	public void setup() {
		Mockito.Annotations.initMocks(this);
		reader_mock = mock(Reader.class);
		writer_mock = mock(Writer.class);
	}
}
