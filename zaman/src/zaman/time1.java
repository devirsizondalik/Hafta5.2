package zaman;

public class time1 {

	private int hour;
	private int minute;
	private int second;
	private static int count;
	public time1(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		count++;
	}
	public time1(int hour)
	{
		this.hour=hour;
	}
	public time1(int hour, int second)
	{
		this.hour=hour;
		this.second=second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setsaat(int saat, int dakika, int saniye)
	{
		if(hour>0 || hour<23 || minute>0 || minute<59 || second>0 || second <59)
		{
			System.out.printf("Girmiş olduğunuz saat sınırların dışında ");
		}
		this.hour = saat;
		this.minute = dakika;
		this.second = saniye;
	}
	
	public String display()
	{
		return String.format("%02d;  %02d:  %02d", getHour(), getMinute(), getSecond(), "Zaman");
	}
	
	public static void say()
	{
		System.out.println("Giriş Sayısı" + count);
	}
	

}
