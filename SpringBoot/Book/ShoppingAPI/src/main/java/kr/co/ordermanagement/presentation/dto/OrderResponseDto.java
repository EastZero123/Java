package kr.co.ordermanagement.presentation.dto;

import kr.co.ordermanagement.domain.order.Order;

import java.util.List;

public class OrderResponseDto {
    private Long id;
    private List<ProductDto> orderedProducts;
    private Integer totalPrice;
    private String state;

    public OrderResponseDto(Long id, List<ProductDto> orderedProducts, Integer totalPrice, String state) {
        this.id = id;
        this.orderedProducts = orderedProducts;
        this.totalPrice = totalPrice;
        this.state = state;
    }

    public static OrderResponseDto toDto(Order order) {
        List<ProductDto> orderedProductDtos = order.getOrderedProducts()
                .stream()
                .map(orderedProduct -> ProductDto.toDto(orderedProduct))
                .toList();

        OrderResponseDto orderResponseDto = new OrderResponseDto(
                order.getId(),
                orderedProductDtos,
                order.getTotalPrice(),
                order.getState()
        );

        return orderResponseDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductDto> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<ProductDto> orderedProducts) {
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
}
