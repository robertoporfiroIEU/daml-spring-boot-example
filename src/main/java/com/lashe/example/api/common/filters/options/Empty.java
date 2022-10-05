package com.lashe.example.api.common.filters.options;

import com.lashe.example.api.common.filters.SimpleFilterOptions;
import org.springframework.data.relational.core.query.Criteria;

public class Empty<T> implements SimpleFilterOptions<T> {
    public Criteria toCriteria(String columnName, T filter, T filterTo) { return Criteria.empty(); }
}
