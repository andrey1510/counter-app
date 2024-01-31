package com.counterapp.services;

import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CounterServiceImpl implements CounterService {

    @Override
    public String countSymbols(String inputData) {
        return convertToString(inputData.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)));
    }

    private static String convertToString(Map<Character, Long> symbolsCountMap) {
        return symbolsCountMap.entrySet().stream()
                .map(entry -> "\"" + entry.getKey() + "\": " + entry.getValue())
                .collect(Collectors.joining(", "));
    }

}
