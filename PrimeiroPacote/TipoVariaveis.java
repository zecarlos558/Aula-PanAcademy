package PrimeiroPacote;

import javax.swing.JOptionPane;

public class TipoVariaveis {

	public static void main(String[] args) {
		byte tipoByte = 123;
		short tipoShort = 12345;
		char tipoChar = 'j';
		float tipoFloat = 2.1f;
		double tipoDouble = 1.52f;
		int tipoInt = 1234567;
		long tipoLong = 1234567890;
		boolean tipoBoolean = true;
		
		JOptionPane.showMessageDialog(null, "Valor do tipoByte: "+tipoByte+
				"\n"+"Tipo do tipoShort: "+tipoShort
				+
				"\n"+"Tipo do tipoChar: "+tipoChar
				+
				"\n"+"Tipo do tipoFloat: "+tipoFloat
				+
				"\n"+"Tipo do tipoDouble: "+tipoDouble
				+
				"\n"+"Tipo do tipoInt: "+tipoInt
				+
				"\n"+"Tipo do tipoLong: "+tipoLong
				+
				"\n"+"Tipo do tipoBoolean: "+tipoBoolean);
	
		System.out.println("Valor do tipoByte = " + tipoByte);
		System.out.println("Valor do tipoShort = " + tipoShort);
		System.out.println("Valor do tipoChar = "  + tipoChar);
		System.out.println("Valor do tipoFloat = " +tipoFloat);
		System.out.println("Valor do tipoDouble = " +tipoDouble);
		System.out.println("Valor do tipoInt = " +tipoInt);
		System.out.println("Valor do tipoLong = " +tipoLong);
		System.out.println("Valor do tipoBooleano = " +tipoBoolean);
	
	}
	
}
