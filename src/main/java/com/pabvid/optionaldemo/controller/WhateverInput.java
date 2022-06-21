package com.pabvid.optionaldemo.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Optional;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WhateverInput {
        Optional<String> name;
        Optional<String> icon;
}
