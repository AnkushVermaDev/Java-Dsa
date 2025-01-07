class Book{

private String title;
private String author;
private float price;

Book(String title, String author,float price){
    this.title = title;
    this.author = author;
    this.price =price;
}

// NOTE: %.3f will set decimal point upto 2 digis like if value is (  234.4569023 => 234.456 )

void display(){
    System.out.printf("\n________________________\nTITLE: %s\nAuthor:%s\nPrice:%.3f\n________________________",title,author,price);
}


}


public class arrayofObj {
public static void main(String[] args) {
    

Book[] book_obj = new Book[3]; // we are saying that we will have array of object for class named as "Book" that contain 3 value

book_obj[0] = new Book("Learn DSA 3rd Gen","Ricky williams",459); // in first index of our array   // value 1
book_obj[1] = new Book("FIFTY SHADES OF GREY","JOHNYY SINS",69); // in first index of our array    // value 2
book_obj[2] = new Book("WEB DEVOLPMENT FULL COURSE","KALYANI PUBLISHER",789); // in first index of our array   // value 3

for (Book book : book_obj) {
    book.display();
}





}
    
}
