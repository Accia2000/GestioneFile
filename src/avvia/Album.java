package avvia;

import java.io.*;

public class Album implements Comparable<Album> 
{
	private Integer id;
	private String titolo;
	private String autore;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
    
    public Integer getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore( ) {
        return autore;
    }
        
        public Album(int id, String titolo, String autore)
	{
		this.id=id;
		this.titolo=titolo;
		this.autore=autore;
	}
	
	public String toString(){
            return "Album " + this.id + " - " + this.titolo + " - " + this.autore;
        }

	@Override
	public int compareTo(Album o){
		
		return this.getId().compareTo(o.getId());
	}
}
