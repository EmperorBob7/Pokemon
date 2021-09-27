import pokemon.*;

public class TestCode {
	public static void main(String[] args) {
		Pokemon p = new Bulbasaur();
		System.out.println(p.getName());
		System.out.println(p.getType1());
		System.out.println(p.getType2());
		System.out.println(p.getIndex());
	}
}
