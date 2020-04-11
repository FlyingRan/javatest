package xhr.xml;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class xmlTest {

	public static void main(String[] args) {
		SAXReader reader = new SAXReader();//创建一个解析器
		
		try {
			Document doc = reader.read("students.xml");
			Element root = doc.getRootElement();
			List<Element> elements = root.elements();
			for(Element e : elements) {
				String id = e.attributeValue("id");//获取的时属性，而不是内容
				//获取xml中对象的内容值，需要使用elementText方法
				System.out.println(id);
				student s = new student(e.elementText("name"),Integer.valueOf(e.elementText("age")),e.elementText("hobby"));
				System.out.println(s);

			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
