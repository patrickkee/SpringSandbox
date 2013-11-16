package junk;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.MySpringBeanWithDependency;


public class JunkTest extends TestCase {
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public JunkTest( String testName )
    {
        super( testName );
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( JunkTest.class );
    }
    
    public void testDi() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	BeanFactory factory = context;
    	MySpringBeanWithDependency test = (MySpringBeanWithDependency) factory
    	    .getBean("mySpringBeanWithDependency");
    	test.run();
    	
    }
}



