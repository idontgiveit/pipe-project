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

    @Test
    public void testRemove() {
        BusinessService service = new BusinessService();
        service.add(1L);
        Assertions.assertEquals(1, service.list().size());
        service.remove(1L);
        Assertions.assertEquals(0, service.list().size());
    }
}
