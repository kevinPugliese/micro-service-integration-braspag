package com.payment.integration.facades;

import com.payment.integration.services.dto.response.ResponseData;
import com.payment.integration.controllers.dto.CartDTO;

public interface BraspagFacadeInterface {

    ResponseData authorization(final CartDTO cartDTO);
}
