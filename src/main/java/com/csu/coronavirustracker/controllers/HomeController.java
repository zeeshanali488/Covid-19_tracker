package com.csu.coronavirustracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csu.coronavirustracker.models.LocationStats;
import com.csu.coronavirustracker.services.CoronaVirusDataService;

@Controller
public class HomeController {
	@Autowired
	CoronaVirusDataService coronaVirusDataService;

	@GetMapping("/coronaStats")
	public String home(Model model) {
		List<LocationStats> allStats = coronaVirusDataService.getAllStats(); 
		int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
		int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPreviousDay()).sum();
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", totalReportedCases);
		model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
		model.addAttribute("totalNewCases", totalNewCases);

		return "home";
		
	}
	
}

