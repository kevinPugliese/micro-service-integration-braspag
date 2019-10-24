package com.payment.integration.controllers.dto;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class CartDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty(message="Preenchimento obrigatório")
    private String cartCode;

    public String getCartCode() {
        return cartCode;
    }

    public void setCartCode(String cartCode) {
        this.cartCode = cartCode;
    }
}
