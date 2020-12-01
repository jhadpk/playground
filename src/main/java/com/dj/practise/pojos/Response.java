package com.dj.practise.pojos;

import lombok.Data;

import java.util.List;

@Data
public class Response {
    private List<ContentObject> contentObjectList;
}
