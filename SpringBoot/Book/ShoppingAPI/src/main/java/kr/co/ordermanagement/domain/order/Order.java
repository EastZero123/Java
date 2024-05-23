package kr.co.ordermanagement.domain.order;

import kr.co.ordermanagement.domain.product.Product;

import java.util.List;

public class Order {
    private Long id;
    private List<Product> orderedProducts;
    private Integer totalPrice;
    private String state;

    public Order(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
        this.totalPrice = caculateTotalPrice(orderedProducts);
        this.state = "CREATED";
    }

    private Integer caculateTotalPrice(List<Product> orderedProducts) {
        return orderedProducts
                .stream()
                .mapToInt(orderedProduct -> orderedProduct.getPrice() * orderedProduct.getAmount())
                .sum();
    }

    public Boolean sameId(Long id) {
        return this.id.equals(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public void changeStateForce(String state) {
        this.state = state;
    }

    public boolean sameState(String state) {
        return this.state.equals(state);
    }

    public void cancel() {
        if(!this.state.equals("CREATED"))
            throw new RuntimeException("이미 취소되었거나 취소할 수 없는 주문상태입니다.");

        this.state = "CANCELED";
    }
}
