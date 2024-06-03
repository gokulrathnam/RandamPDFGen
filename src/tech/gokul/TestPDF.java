package tech.gokul;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Gokul
 *
 */
public class TestPDF {
	public static final String DEST = "C:/Users/Gokul/Downloads/Sample.pdf";

	public static void main(String[] args) {
		try {
			Document document = new Document();

			FileOutputStream file = new FileOutputStream(DEST);

			PdfWriter.getInstance(document, file);

			document.open();

			Random random = new Random();
			
			ArrayList s1 = new ArrayList();
			
			s1.add("I hope this email finds you well. I am writing to discuss our ongoing search for a suitable PG accommodation. Despite our efforts over the past month, we have been unable to find a PG below the budget of 12,000 rupees. Most of the available options range from 13,000 to 15,000 rupees per month.");
			s1.add("Considering the circumstances, I kindly request your assistance in securing a PG at a rent of 13,000 rupees per month. As we previously discussed with Murali, he is also eager to join me in this accommodation. It has become increasingly challenging for me to commute daily, and I believe that moving to a PG will greatly alleviate this difficulty.");
			s1.add("Ideally, I would like to make the transition to the new PG by next week. I understand the urgency of the situation and would greatly appreciate it if you could take immediate action to help us find a suitable option.");
			s1.add("Thank you for your attention to this matter, and I eagerly await your prompt response.\r\n");
			for (int i = 0; i <s1.size() ; i++) {
				document.add(new Paragraph("Random Content " + i + ": "+s1.get(i)+"  "+ random.nextInt(100)));
			}
			document.close();

			System.out.println("PDF Successfully Generated");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
