package com.ziv.interceptingFilter.c;

import com.ziv.interceptingFilter.i.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>(16);

    private Target target;

    public void addFilter(Filter filter){
        this.filters.add(filter);
    }

    public void execute(String request){
        // request按顺序依次通过filter
        for (Filter filter:filters){
            filter.execute(request);
        }
        // 真正处理请求的就是这个类了
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
