
public class Book {

		private String bookTitle;
		private String author;
		private String ISBN;
		private int noOfCopies;
		
		Book(){
			
		}
		
		Book(String bookTitle, String author, String ISBN, int noOfCopies){
			this.bookTitle= bookTitle;
			this.author= author;
			this.ISBN= ISBN;
			this.noOfCopies =noOfCopies;	
		}
		
		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}

		public void setNoOfCopies(int noOfCopies) {
			this.noOfCopies = noOfCopies;
		}
		
		public String getBookTitle() {
			return bookTitle;
		}

		public String getAuthor() {
			return author;
		}

		public String getISBN() {
			return ISBN;
		}

		public int getNoOfCopies() {
			return noOfCopies;
		}

		
		void display() {
			System.out.println(bookTitle+" - "+author+" - "+ ISBN +" - "+ noOfCopies);
		}

		
	}

