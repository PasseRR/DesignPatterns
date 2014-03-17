package csii.structural.flyweight;

/**
 * 打出文字不包含大小、颜色等
 * @author xiehai
 * @date 2013-8-9 下午05:21:21 
 */
public class Word implements Flyweight{
	private String word;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Word() {
		// TODO Auto-generated constructor stub
	}
	public Word(String word){
		this.word = word;
		System.out.println(word + "--->被创建");
	}
	@Override
	public void type(TypeWord word) {
		System.out.println(word.getSize() + "号的<" + word.getWord() + ">被打印!");
	}
	
}
