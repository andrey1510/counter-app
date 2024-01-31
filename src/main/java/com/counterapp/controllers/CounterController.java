package com.counterapp.controllers;

import com.counterapp.services.CounterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class CounterController {

    private final CounterService counterService;

    @PostMapping("symbols-counter")
    @Operation(description = "Вычислить по заданной строке частоту встречи символов в нисходящем порядке.")
    public ResponseEntity<String> countSymbols(
            @RequestBody
            @Schema(description = "Заданная строка с символами", example = "aaabbcc")
            String inputString) {

        String result = counterService.countSymbols(inputString);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}



