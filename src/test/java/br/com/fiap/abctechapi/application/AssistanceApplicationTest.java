package br.com.fiap.abctechapi.application;

import br.com.fiap.abctechapi.application.impl.AssistanceApplicationImpl;
import br.com.fiap.abctechapi.entity.Assistance;
import br.com.fiap.abctechapi.entity.Order;
import br.com.fiap.abctechapi.repository.AssistanceRepository;
import br.com.fiap.abctechapi.service.AssistanceService;
import br.com.fiap.abctechapi.service.impl.AssistanceServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class AssistanceApplicationTest {
    private AssistanceApplication assistanceApplication;
    @MockBean
    private AssistanceService assistanceService;


    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        assistanceApplication = new AssistanceApplicationImpl(assistanceService);
        Mockito.when(assistanceService.getAssists())
                .thenReturn(List.of(new Assistance(1L,"Troca de aparelho","Troca de aparelho decodificador de sinal")));
    }

    //cenario buscando assistances
    @Test
    public void create_order_success(){
        Order newOrder = new Order();
        newOrder.setOperatorId(1234L);

        Assertions.assertEquals(assistanceApplication.getAssists().size(),1);
    }

}
