package ie.tudublin;

import java.util.ArrayList;



import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{ 
	ArrayList<Note> notescore = new ArrayList<Note>();
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		colorMode(RGB);
		background(255);
		fillarray(score);
	
		
	}
	public void Printscore(){
		for(int i =0; i<notescore.size(); i++){
		System.out.println(notescore.get(i));
		}
	}

	public void draw()
	{
		fill(0);
		background(255);
		stroke(0);
		drawlines();
		//drawNotes();

	}
	void drawlines(){
		line(50, 250, 950, 250);
		line(50, 300, 950, 300);
		line(50, 350, 950, 350);
		line(50, 400, 950, 400);
		line(50, 450, 950, 450);
	}
	float x;
	float y;
	float width;
	float height;
	void drawNotes()
	{
		fill(0);
		background(255);
		stroke(0);
		ellipse(56, 46, 55, 55);
		
		
	}

	public void fillarray(String score)
	{
			/*creating a character array to easy loop throuh them and assignthem to Note. using a J variable to check next index
		if next index is not a char skip it on the next runthrough as i dont need to start off from an integer.
		*/
		char[] notearray = score.toCharArray();
		for(int i = 0; i<notearray.length-1; i++){
			int j=i+1;
			if(j > notearray.length)
			{
			//break here to prevent out of bounds issues.
			break;
			}
			if( Character.isDigit(notearray[j]))
			{
				Note temp = new Note(notearray[i],j);
				notescore.add(temp);
				i=j;
			}
			else
			{
				Note temp = new Note(notearray[i],j);
				notescore.add(temp);
			}
		
		}
	}
}
