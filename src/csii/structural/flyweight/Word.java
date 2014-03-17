package csii.structural.flyweight;

/**
 * ������ֲ�������С����ɫ��
 * @author xiehai
 * @date 2013-8-9 ����05:21:21 
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
		System.out.println(word + "--->������");
	}
	@Override
	public void type(TypeWord word) {
		System.out.println(word.getSize() + "�ŵ�<" + word.getWord() + ">����ӡ!");
	}
	
}
