package ru.perm.v.calc.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.v.calc.dto.CalculatorDTO;
import ru.perm.v.calc.service.Calculator;

@RestController
@RequestMapping("/calc")
public class CalcCtrl {

	private final static Logger LOG = LoggerFactory.getLogger(CalcCtrl.class);

	@Value("${default-percent}")
	BigDecimal percent;

	@PostMapping
	public Calculator calc(
			@RequestBody @Valid CalculatorDTO calculatorDTO) {
		LOG.info(calculatorDTO.toString());
		Calculator calculator = new Calculator(LocalDate.now(), percent,
				calculatorDTO.getMonths(), calculatorDTO.getCredit());
		return calculator;
	}
}
