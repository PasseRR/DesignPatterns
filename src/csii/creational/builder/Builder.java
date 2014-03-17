package csii.creational.builder;

public interface Builder {
	/** 
	 * �������
	 */
	void builderChaire();
	/** 
	 * �������
	 */
	void builderChassis();
	/** 
	 * ���������
	 */
	void builderEngine();
	/** 
	 * �����̥
	 */
	void builderTyre();
	/** 
	 * ������
	 */
	void builderShell();
	/** 
	 * ���������ʵ��
	 * @return
	 */
	Car getCarInstance();
}
