package Operator;

public class WrapperClass {

	public static void main(String[] args) {
		int a =40;
		double c = 345.645;
		String v="Gitish";
		float ft= 43.55f;
		String sb = new String(v);
	    Integer in = new Integer(a);
	    Byte B=new Byte((byte) a);
	    Double d = new Double(c);
	    Float f = new Float(ft);
	    long lg = 34554;
		Long l = new Long(lg);
		short st = 4;
		char cr='5';
		Character ch = new Character(cr);
		Short sh = new Short(st);
		boolean s= false;
		Boolean bn = new Boolean(s);
		System.out.println(in.hashCode());
        System.out.println(B.hashCode());
		System.out.println(sb.charAt(4));
		System.out.println(l.intValue());
		System.out.println(d.doubleValue());
		System.out.println(f.floatValue());
		System.out.println(sh.shortValue());
		System.out.println(ch.charValue());
		System.out.println(bn.booleanValue());

	}

}
