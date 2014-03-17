package csii.behavioural.memento;

/**
 * 系统用户
 * @author xiehai
 * @date 2013-9-17 下午02:15:05 
 */
public class User {
	private Memento memento;  

    /** 
     * 获得备份
     * @return
     */
    public Memento retrieveMemento(){  
        return memento;  
    }  
 
    /** 
     * 设置备份
     * @param memento
     */
    public void saveMemento(Memento memento){  
        this.memento = memento;  
    }  
}
