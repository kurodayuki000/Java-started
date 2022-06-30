/*--<sample_04_1>------------------------------------------------
 定価1000円の商品の税込み価格を計算して表示するプログラムです。
 消費税は8％で計算しています。
---------------------------------------------------------------*/
class Sample1_03_1 {
	public static void main (String[] args) {
		
		System.out.println("HelloWorld!!");

		int listPrice = 1000;					//定価の金額

		double tax = 1.08;				//消費税

		double payment = listPrice * tax;	//支払額を計算

		System.out.println(payment);		//支払額を画面に表示
		
	}
}
