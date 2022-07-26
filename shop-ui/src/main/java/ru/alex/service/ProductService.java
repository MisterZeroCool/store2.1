package ru.alex.service;

import ru.alex.controllers.repr.ProductRepr;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface ProductService extends Serializable {

    Optional<ProductRepr> findById(Long id);

    List<List<ProductRepr>> findAllAndSplitProductsBy(int groupSize);
}
