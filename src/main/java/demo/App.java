/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.net.MalformedURLException;

public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        // TestCases tests = new TestCases(); // Initialize your test class
        // tests.testCase01();
        // tests.endTest(); // End your test by clearning connections and closing
        //browser

        LinkedinPost linkedinPost = new LinkedinPost();
        linkedinPost.testCase01();
        linkedinPost.endTest();

        // ImageUrl imageurl= new ImageUrl();
        // imageurl.testCase01();
        // imageurl.endTest();

        // ImdbRating imdbRating= new ImdbRating();
        // imdbRating.testCase01();
        // imdbRating.endTest();

        // WindowHandle windowHandle= new WindowHandle();
        // windowHandle.testCase01();
        // windowHandle.endTest();

        // BookMyShow bookMyShow= new BookMyShow();
        // bookMyShow.testCase01();
        // bookMyShow.endTest();

        // NestedFrame nestedFrame= new NestedFrame();
        // nestedFrame.testCase01();
        // nestedFrame.endTest();

    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
