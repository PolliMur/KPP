package com.web.kpp.DTO;

import com.web.kpp.entity.TriangleIdentification;

import java.util.List;

public class TriangleListDto {
    private List<TriangleIdentification> list;
    private int sum;
    private int max;
    private int min;

    public TriangleListDto(List<TriangleIdentification> list, int sum, int max, int min) {
        this.list = list;
        this.sum = sum;
        this.max = max;
        this.min = min;
    }

    public List<TriangleIdentification> getList() {
        return list;
    }

    public int getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
