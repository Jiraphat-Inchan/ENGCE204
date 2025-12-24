import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        TextDocument td1 = new TextDocument(sc.nextLine(), Integer.parseInt(sc.nextLine()));
        PDFDocument pd1 = new PDFDocument(sc.nextLine(), Integer.parseInt(sc.nextLine()));
        TextDocument td2 = new TextDocument(sc.nextLine(), Integer.parseInt(sc.nextLine()));
        PDFDocument pd2 = new PDFDocument(sc.nextLine(), Integer.parseInt(sc.nextLine()));

        Document[] docs = {td1, pd1, td2, pd2};

        int totalPages = 0;
        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument temp = (PDFDocument) d;
                totalPages += temp.pageCount;
            }
        }

        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);
        
        sc.close();
    }
}
