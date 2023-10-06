package ru.otus.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.service.BusinessService;

public class BusinessServiceTest {

    @Test
    public void testAdd() {
        BusinessService service = new BusinessService();
        service.add(1L);
        Assertions.assertEquals(1, service.list().size());
    }

}
