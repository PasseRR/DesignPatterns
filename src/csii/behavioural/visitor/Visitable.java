package csii.behavioural.visitor;

/**
 * ����Ԫ��(Visitable)��ɫ������һ�����ܲ���������һ�������߶�����Ϊһ�������� 
 * @author xiehai
 * @date 2013-9-17 ����04:14:59 
 */
public interface Visitable {
	void accept(Visitor visitor);
}
