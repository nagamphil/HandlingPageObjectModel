package Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteClasses({VerifyLogin.class,VerifyHomePage.class,CreateOrder.class} )
public class AllSuites {

}
