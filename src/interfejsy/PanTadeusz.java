package interfejsy;

public class PanTadeusz implements Ksi¹¿ka{

	private String title;
	private String subtitle;
	private String author;
	private int pages;
	private String ISBNcode;
	
	public PanTadeusz(){
		this.title = "Pan Tadeusz";
		this.subtitle = "Czyli ostatni zajazd na Litwie";
		this.author = "Adam Mickiewicz";
		this.pages = 300;
		this.ISBNcode = "14-2532-3483-30";
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getSubtitle() {
		return subtitle;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public int getPages() {
		return pages;
	}

	@Override
	public String getISBNcode() {
		return ISBNcode;
	}

}
