package org.nathroggames.campaign_generator;

import java.util.List;

import rita.*;

public class CampaignGenerator {
	
	public CampaignGenerator()
	{
		
	}
	public String generateCampaign(String campaignName, String campaignStart, List<String> campaignPoints)
	{
		String resultantCampaign = null;
		
		RiGrammar rg = new RiGrammar();
		rg.addRule("<start>", campaignStart, 1);
		resultantCampaign = rg.expand();
		return resultantCampaign;
	}
}
