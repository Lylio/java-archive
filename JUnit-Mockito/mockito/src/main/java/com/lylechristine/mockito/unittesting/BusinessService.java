package com.lylechristine.mockito.unittesting;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    private DataService dataService;

    public BusinessService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findLargestNumberFromData() {
        int[] allData = dataService.getAllData();
        int largestNumber = Integer.MIN_VALUE;

        for(int value : allData) {
            if (value > largestNumber) {
                largestNumber = value;
            }
        }
        return largestNumber;
    }
}

