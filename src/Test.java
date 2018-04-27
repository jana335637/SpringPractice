import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by pillutja on 4/11/2018.
 */
public class Test {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory  beanFactory = new XmlBeanFactory(resource);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)beanFactory.getBean("student");
        student.displayInfo();
        Student student1 = (Student)context.getBean("student");
        student1.displayInfo();
        Student student3 = (Student)context.getBean("student3");
        student3.displayInfo();
        Printable printable = (Printable) context.getBean("a");
        printable.print();
    }
}
