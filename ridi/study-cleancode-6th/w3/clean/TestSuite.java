public class TestSuite implements Test {
    static public Test createTest(Class<? extends TestCase> theClass,
            String name) {
        ...
    }
    public static Constructor<? extends TestCase>
    getTestConstructor(Class<? extends TestCase> theClass)
    throws NoSuchMethodException {
        ...
    }
    public static Test warning(final String message) {
        ...
    }
    private static String exceptionToString(Throwable t) {
        ...
    }
    private String fName;
    private Vector<Test> fTests= new Vector<Test>(10);
    public TestSuite() {
        ...
    }
    public TestSuite(final Class<? extends TestCase> theClass) {
        ...
    }
    public TestSuite(Class<? extends TestCase> theClass, String name) {
        ...
    }
    ... ... ... ... ...
}