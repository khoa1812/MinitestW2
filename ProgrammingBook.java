public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    // Constructor
    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

}
