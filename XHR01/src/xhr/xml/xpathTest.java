package xhr.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class xpathTest {
	public static void main(String[] args) throws DocumentException {
		//创建解析器
		SAXReader reader = new SAXReader();
		//解析xml文件
		Document doc = reader.read("students.xml");
		//获取指定的单个元素，默认时node的对象，element为其子类对象
		Element node = (Element)doc.selectSingleNode("/students/student[@id='2']");
		
		String id = node.attributeValue("id");
		String name = node.elementText("name");
		String age = node.elementText("age");
		String hobby = node.elementText("hobby");
		
		System.out.println(id+new student(name,Integer.valueOf(age),hobby));
	}
}
