package lecteur;
public abstract class TextReader implements FileReader {
	protected String path;
	
	//méthode abstraite
	public abstract void read(String path);
	public abstract void modify();
	
	

}
