package entities;

public class OrderItem {
	private Integer quantity;
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double subTotal() {
		return quantity * product.getPrice();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", $");
		sb.append(String.format("%.2f", product.getPrice()) + ", Quantity: ");
		sb.append(quantity + ", Subtotal: $");
		sb.append(String.format("%.2f", subTotal()));
		return sb.toString();
	}
}
