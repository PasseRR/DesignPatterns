package csii.structural.facade;

/**
 * 学长A
 * @author xiehai
 * @date 2013-9-16 上午11:09:40 
 */
public class Schoolmate {
	FinanceSection fs = new FinanceSection();
	EnrollmentOffice eo = new EnrollmentOffice();
	StudentAffairsOffice sao = new StudentAffairsOffice();
	BuildingManager bm = new BuildingManager();
	/** 
	 * 学长带领学弟、学妹完成所有需要做的工作
	 */
	public void leadSomebody(){
		fs.pay();
		eo.register();
		sao.getSomeGoods();
		bm.checkIn();
	}
}
