package com.dj.practise.pojos;


import lombok.Data;


@Data
public class ContentObject {
    private String content;
    private int count;
}


/*



[
{
    "content": "some content in response",
    "count": 10
},
{
    "content": "some content in response",
    "count": 20
},
{
    "content": "some content in response",
    "count": 5
},
{
    "content": "some content in response",
    "count": 15
},
]



 */