package cf.wikipedia;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.junit.Test;
import org.xml.sax.SAXException;

public class WikipediaTasteUserDemoTest {

	@Test
	public void testMain() throws FileNotFoundException,
			ParserConfigurationException, SAXException, IOException,
			TasteException {
		int neighborhoodSize = 5;
		long userId = 995L;
		boolean printCommonalities = false;

		String recsFile = "src/main/resources/recommendations.txt";
		String docIdsTitle = "src/main/resources/docIdsTitles.xml";

		new WikipediaTasteUserDemo().userRecommendation(recsFile, docIdsTitle,
				neighborhoodSize, userId, printCommonalities);
	}

}
