
public class Printer {

	
	public static String printPDFDocument(String body) {
		
		return body;
		
		
		
	}
	
	public static String printWordDocument(String body) {
		
		return body;
		
		
		
	}
	
	
public static void main(String[] args) {
		
		PDFDocument pdfread = new PDFDocument();
		WordDocument wordread = new WordDocument();

		String pdf = pdfread.setBody("asdadaasd");
		String word = wordread.setBody("fgdffsdfds");
		
		System.out.println(pdf);
		System.out.println(word);

		
	
		
		
	}
}
