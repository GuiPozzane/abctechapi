package br.com.fiap.abctechapi.application;

import br.com.fiap.abctechapi.application.dto.OrderDto;
import br.com.fiap.abctechapi.application.dto.OrderLocationDto;
import br.com.fiap.abctechapi.application.impl.AssistanceApplicationImpl;
import br.com.fiap.abctechapi.application.impl.OrderApplicationImpl;
import br.com.fiap.abctechapi.entity.Assistance;
import br.com.fiap.abctechapi.entity.Order;
import br.com.fiap.abctechapi.service.AssistanceService;
import br.com.fiap.abctechapi.service.OrderService;
import org.h2.util.DateTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class OrderApplicationTest {
    private OrderApplication orderApplication;
    @MockBean
    private OrderService orderService;


    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        orderApplication = new OrderApplicationImpl(orderService);
    }

    //cenario buscando assistances
    @Test
    public void create_order_success() throws Exception {
        OrderLocationDto orderLocationStartDto = new OrderLocationDto(1D,1D, new Date());
        OrderLocationDto orderLocationEndDto = new OrderLocationDto(2D,2D, new Date());
        OrderDto orderDto = new OrderDto(1L, List.of(1L),orderLocationStartDto,orderLocationEndDto);

        Assertions.assertDoesNotThrow(()->orderApplication.createOrder(orderDto));
        Mockito.verify(orderService, Mockito.times(1)).saveOrder(Mockito.any(Order.class),Mockito.any(List.class));
    }
}
