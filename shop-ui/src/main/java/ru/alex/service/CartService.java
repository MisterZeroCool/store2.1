package ru.alex.service;

import ru.alex.controllers.repr.ProductRepr;
import ru.alex.service.model.LineItem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public interface CartService extends Serializable {

    void addProductQty(ProductRepr productRepr, String color, String material, int qty);

    void removeProductQty(ProductRepr productRepr, String color, String material, int qty);

    void removeProduct(ProductRepr productRepr, String color, String material);

    List<LineItem> getLineItems();

    BigDecimal getSubTotal();

    void updateCart(LineItem lineItem);
}
