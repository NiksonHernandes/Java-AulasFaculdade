public class NotaFiscal extends Documento{
	private double total;
	private double icms;
	private Item item;
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getIcms() {
		return icms;
	}
	public void setIcms(double icms) {
		this.icms = icms;
	}
	
}
