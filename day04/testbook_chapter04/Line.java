package testbook_chapter04;

public class Line {

	int line;
	
	public Line(int line) {
		this.line = line;
	}
	
	public boolean isSameLine(Line l) {
		if(line == l.line) {
			return true;
		}else {
			return false;
		}
	}
}
