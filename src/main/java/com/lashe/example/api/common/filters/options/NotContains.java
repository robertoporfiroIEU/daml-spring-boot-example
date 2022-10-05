package com.lashe.example.api.common.filters.options;

import com.lashe.example.api.common.filters.SimpleFilterOptions;
import org.springframework.data.relational.core.query.Criteria;

public class NotContains implements SimpleFilterOptions<String> {
    public Criteria toCriteria(String columnName, String filter, String filterTo) {
        return Criteria.where(columnName).notLike("%" + filter + "%");
    }
}
