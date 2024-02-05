package com.tpi.audiolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerCaseController {
	@GetMapping("/csrcase")
	public String greeting(@RequestParam(name = "caseId", required = true) String caseId, Model model) {
		model.addAttribute("caseId", caseId);
		return "csrcase";
	}
}
