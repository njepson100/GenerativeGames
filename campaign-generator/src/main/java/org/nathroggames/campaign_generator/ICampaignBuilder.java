package org.nathroggames.campaign_generator;

import java.util.List;

public interface ICampaignBuilder {
	
	public String createCampaign(String campaignName, String campaignStart, List<String> campaignPoints);
	public String modifyCampaign(String campaignName, List<String> campaignPoints);
	public List<String> getCampaignEffects(String campaignName);
	public List<String> getCampaignNPCs(String campaignName);
}
