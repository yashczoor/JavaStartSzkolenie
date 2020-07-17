import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WykopParser {
	public static void main(String[] args) throws IOException {
		URL wykop = new URL("https://www.wykop.pl/");
		BufferedReader in = new BufferedReader(new InputStreamReader(wykop.openStream(), "UTF-8"));
		
		StringBuilder resource = new StringBuilder();
		String tmp = null;
		while((tmp = in.readLine()) != null) {
			resource.append(tmp);
			resource.append("\n");
		}
		in.close();
		//System.out.println(resource);
		
		Document doc = Jsoup.parse(resource.toString());
		Elements headers = doc.select("div.lcontrast.m-reset-margin").select("h2");
		
		for(Element e: headers) {
			System.out.println(e.text());
		}
	}
}
