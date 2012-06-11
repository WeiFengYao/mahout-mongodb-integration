package cf.wikipedia;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.junit.Test;
import org.xml.sax.SAXException;

public class WikipediaTasteItemSimilarityTest {

	@Test
	public void testMain() throws FileNotFoundException, ParserConfigurationException, SAXException, IOException, TasteException {
			String recsFile = "src/main/resources/recommendations.txt";
			String docIdsTitle = "src/main/resources/docIdsTitles.xml";
			long itemId1 = 3135415L;
			long itemId2 = 2954818L;
			new WikipediaTasteItemSimilarity().itemSimilarityReco(recsFile,
					docIdsTitle, itemId1, itemId2);
	}

}
