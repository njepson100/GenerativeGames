package org.nathroggames.campaign_generator;

import java.util.List;

public class SOBCampaignBuilder implements ICampaignBuilder {

	CampaignGenerator cg = new CampaignGenerator();
	public String createCampaign(String campaignName, String campaignStart, List<String> campaignPoints) {
		return cg.generateCampaign(campaignName, campaignStart, campaignPoints);
	}

	public String modifyCampaign(String campaignName, List<String> campaignPoints) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getCampaignEffects(String campaignName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getCampaignNPCs(String campaignName) {
		// TODO Auto-generated method stub
		return null;
	}

}
