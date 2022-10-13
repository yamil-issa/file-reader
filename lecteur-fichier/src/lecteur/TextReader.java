package lecteur;
public abstract class TextReader implements FileReader {
	protected String path;
	
	//méthodes abstraites
	public abstract void read(String path);
	public abstract void modify();
	
	

}
