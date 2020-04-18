package com.lylechristine.mockito.unittesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BusinessServicesMockTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessService businessImpl;

    @Test
    public void findLargestNumberFromData() {
        when(dataServiceMock.getAllData()).thenReturn(new int[] {23, 17, 55});
        assertEquals(55, businessImpl.findLargestNumberFromData());
    }

    @Test
    public void findLargestNumberFromData_WithOneValue() {
        when(dataServiceMock.getAllData()).thenReturn((new int[] {19}));
        assertEquals(19, businessImpl.findLargestNumberFromData());
    }

    @Test
    public void findLargestNumberFromData_WithZeroValues() {
        when(dataServiceMock.getAllData()).thenReturn((new int[] {}));
        assertEquals(Integer.MIN_VALUE, businessImpl.findLargestNumberFromData());
    }
}

