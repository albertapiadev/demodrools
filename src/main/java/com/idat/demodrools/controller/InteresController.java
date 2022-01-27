package com.idat.demodrools.controller;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idat.demodrools.model.Modulo;

@RestController
public class InteresController {

	private final KieContainer kieContainer;
	public InteresController(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	
	@RequestMapping(value = "/getTasa", method = RequestMethod.GET, produces = "application/json")
	public Modulo getQuestions(@RequestParam(required = true) String banco,
								@RequestParam(required = true) Integer tiempo) {
		KieSession kieSession = kieContainer.newKieSession();
		Modulo interes = new Modulo(banco, tiempo);
		kieSession.insert(interes);
		kieSession.fireAllRules();
		kieSession.dispose();

		return interes;
	}
}