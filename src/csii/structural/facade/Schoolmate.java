package csii.structural.facade;

/**
 * ѧ��A
 * @author xiehai
 * @date 2013-9-16 ����11:09:40 
 */
public class Schoolmate {
	FinanceSection fs = new FinanceSection();
	EnrollmentOffice eo = new EnrollmentOffice();
	StudentAffairsOffice sao = new StudentAffairsOffice();
	BuildingManager bm = new BuildingManager();
	/** 
	 * ѧ������ѧ�ܡ�ѧ�����������Ҫ���Ĺ���
	 */
	public void leadSomebody(){
		fs.pay();
		eo.register();
		sao.getSomeGoods();
		bm.checkIn();
	}
}
