package interfejsy;

public class Lalka implements Ksi¹¿ka{
	
	private String title;
	private String subtitle;
	private String author;
	private int pages;
	private String ISBNcode;
	
	public Lalka(){
		this.title = "Lalka";
		this.subtitle = "";
		this.author = "Boles³aw Prus";
		this.pages = 628;
		this.ISBNcode = "64-2341-3483-31";
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
