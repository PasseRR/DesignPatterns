package csii.behavioural.memento;

/**
 * ϵͳ�û�
 * @author xiehai
 * @date 2013-9-17 ����02:15:05 
 */
public class User {
	private Memento memento;  

    /** 
     * ��ñ���
     * @return
     */
    public Memento retrieveMemento(){  
        return memento;  
    }  
 
    /** 
     * ���ñ���
     * @param memento
     */
    public void saveMemento(Memento memento){  
        this.memento = memento;  
    }  
}
