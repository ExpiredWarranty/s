package com.booksaw.betterTeams.team;

import java.text.DecimalFormat;

import com.booksaw.betterTeams.team.storage.team.StoredTeamValue;

public class MoneyComponent extends DoubleTeamComponent {

	public static String getFormattedDouble(double amount) {
		DecimalFormat df = new DecimalFormat("0.00");
		df.setGroupingUsed(true);
		df.setGroupingSize(3);
		return df.format(amount);
	}
	
	@Override
	public StoredTeamValue getSectionHeading() {
		return StoredTeamValue.MONEY;
	}

	public String getStringFormatting() {
		return getFormattedDouble(get());
	}

}
