
public class Bill extends Date {
	String bill_no;
	int reading;
	Date date;
	int customer_id;
	double bill_amount;
	boolean paid_status;

	public Bill(int month, int year, String bill_no, int reading, Date date, int customer_id, double bill_amount,
			boolean paid_status) {
		super(month, year);
		this.bill_no = bill_no;
		this.reading = reading;
		this.date = date;
		this.customer_id = customer_id;
		this.bill_amount = bill_amount;
		this.paid_status = false;
	}
	public String getBill_no() {
		return bill_no;
	}
	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}
	public int getReading() {
		return reading;
	}
	public void setReading(int reading) {
		this.reading = reading;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public double getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(double bill_amount) {
		this.bill_amount = bill_amount;
	}
	public boolean isPaid_status() {
		return paid_status;
	}
	public void setPaid_status(boolean paid_status) {
		this.paid_status = paid_status;
	}
	@Override
	public String toString() {
		return "Bill [bill_no=" + bill_no + ", reading=" + reading + ", date=" + date + ", customer_id=" + customer_id
				+ ", bill_amount=" + bill_amount + ", paid_status=" + paid_status + "]";
	}
	



}
