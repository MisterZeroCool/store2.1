package ru.alex.service;

import ru.alex.persist.model.PictureData;
import ru.alex.persist.model.Product;

import java.util.Optional;

public interface PictureService {

    Optional<String> getPictureContentTypeById(long id);

    Optional<byte[]> getPictureDataById(long id);

    PictureData createPictureData(byte[] picture);

    Optional<Product> getProductByPictureId(long id);

    // TODO перенести сюда функционал получения списка картинок

    // TODO перенести сюда функционал для удаления картинок
    void removePicture(long id);
}
