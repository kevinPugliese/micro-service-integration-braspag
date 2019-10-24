package com.payment.integration.controllers;

import com.payment.integration.facades.BraspagFacade;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = BraspagController.class)
public class BraspagControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BraspagController braspagController;

    @MockBean
    private BraspagFacade braspagFacade;

    @Test
    public void getContextLoad() throws Exception {
        mockMvc.perform(post("/forums/42/register")
                .contentType("application/json"))
                .andExpect(status().isOk());

        assertTh
    }
}
