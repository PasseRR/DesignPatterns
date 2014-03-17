package csii.behavioural.visitor;

public class PrintVisitor implements Visitor {

	@Override
	public void visit(Visitable visitable) {
		if(visitable instanceof Body){
			System.out.println("Visiting Body");
		}else if(visitable instanceof Engine){
			System.out.println("Visiting Engine");
		}else if(visitable instanceof Wheel){
			System.out.println("Visiting Wheel");
		}else if(visitable instanceof Car){
			System.out.println("Visiting Car");
		}
	}

}
