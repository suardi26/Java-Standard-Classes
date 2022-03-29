package com.practice;

import java.util.Objects;

public class ExObjects {
    private String product;

    public ExObjects(String product){

        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExObjects exObjects = (ExObjects) o;
        return Objects.equals(product, exObjects.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    @Override
    public String toString() {
        return "ExObjects{" +
                "product='" + product + '\'' +
                '}';
    }
}
