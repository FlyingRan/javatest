package xhr.xml;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class xmlTest {

	public static void main(String[] args) {
		SAXReader reader = new SAXReader();//����һ��������
		
		try {
			Document doc = reader.read("students.xml");
			Element root = doc.getRootElement();
			List<Element> elements = root.elements();
			for(Element e : elements) {
				String id = e.attributeValue("id");//��ȡ��ʱ���ԣ�����������
				//��ȡxml�ж��������ֵ����Ҫʹ��elementText����
				System.out.println(id);
				student s = new student(e.elementText("name"),Integer.valueOf(e.elementText("age")),e.elementText("hobby"));
				System.out.println(s);

			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
