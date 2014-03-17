package csii.structural.flyweight;

/**
 * 打印出来的文字
 * @author xiehai
 * @date 2013-8-9 下午05:26:40 
 */
public class TypeWord {
	private String word;
	private int size;
	public TypeWord() {
		// TODO Auto-generated constructor stub
	}
	public TypeWord(String word, int size){
		this.size = size;
		this.word = word;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
