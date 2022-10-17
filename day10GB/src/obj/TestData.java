package obj;

public class TestData {
	int intData;
	double doubleData;

	public TestData(int intData, double doubleData) {
		this.intData = intData;
		this.doubleData = doubleData;
	}
	
	@Override
	public String toString() {
//		return "intData : "+intData+" / doubleData : "+doubleData;
		return "TestData(intData="+intData+", doubleData="+doubleData+")";
	}
}
