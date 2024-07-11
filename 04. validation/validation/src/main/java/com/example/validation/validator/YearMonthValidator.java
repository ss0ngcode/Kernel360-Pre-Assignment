package com.example.validation.validator;

import com.example.validation.annotation.YearMonth;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    private String pattern;

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // "2023-01-01T13:00:00" yyyy-MM-ddTHH:mm:ss
        // "2023-01"을 검증해야 함

        var reValue = value + "01";         // 기본 value(yyyyMM)
        var rePattern = pattern + "dd";     // 패턴을 yyyyMM에서 yyyyMMdd로 변경

        try {
            // 위에 적어놓은 rePattern, reValue를 가지고 파싱
            LocalDate date = LocalDate.parse(reValue, DateTimeFormatter.ofPattern(rePattern));
            System.out.println(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
