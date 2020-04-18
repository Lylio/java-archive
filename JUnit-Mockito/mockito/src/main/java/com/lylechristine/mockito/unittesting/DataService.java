package com.lylechristine.mockito.unittesting;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
    public int[] getAllData() {
        // Some dummy data
        // This should in reality talk to some database to get all the data
        return new int[] {1,2,3,4,5};
    }
}

