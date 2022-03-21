package com.database.migration.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class ListProductDto implements Serializable {
    private Long id;
    private String name;
    private String price;
    @JsonProperty("category_name")
    private String categoryName;
}