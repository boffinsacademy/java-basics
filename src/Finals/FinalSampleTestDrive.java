package Finals;

public class FinalSampleTestDrive {

	public static void main(String[] args) {

	    final FinalSample obj = new FinalSample();

	    FinalSample obj2 = new FinalSample();
	    FinalSample obj3 = new FinalSample();

	    obj2.setName("arya");
	    System.out.println(obj2.getName());

	    obj3 = obj2;  //allowed

	    System.out.println(obj3.getName());

	    //obj = obj2 //not allowed as obj is final and can not be modified

	    obj.setName("shubham");
	    System.out.println(obj.getName());

	    //but the value of the instance variables, the obj is referring to
	    //can change

	    obj.setName("shivam");
	    System.out.println(obj.getName());
	}


}
