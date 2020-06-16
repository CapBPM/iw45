package com.capbpm.drools.model;

import java.util.Date;
import java.util.List;

import com.davita.protocol.ScheduleDayType;
import com.davita.protocol.ScheduleMonthType;
import com.davita.protocol.ScheduleWeekType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class FacilityDrawSchedule implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public List<ScheduleDayType> daysOfWeek;
	public ScheduleWeekType weekofMonth;
	public ScheduleWeekType secondWeekOfMonth;
	public List<ScheduleMonthType> quarterlyMonths;
	public List<ScheduleMonthType> semiYearlyMonths;
	public ScheduleMonthType yearlyMonth;

	public List<ScheduleDayType> getDaysOfWeek(){
		return this.daysOfWeek;
	}

	public void setDaysOfWeek(List<ScheduleDayType> daysOfWeek){
		this.daysOfWeek = daysOfWeek;
	}

	public ScheduleWeekType getWeekofMonth(){
		return this.weekofMonth;
	}

	public void setWeekofMonth(ScheduleWeekType weekofMonth){
		this.weekofMonth = weekofMonth;
	}

	public ScheduleWeekType getSecondWeekOfMonth(){
		return this.secondWeekOfMonth;
	}

	public void setSecondWeekOfMonth(ScheduleWeekType secondWeekOfMonth){
		this.secondWeekOfMonth = secondWeekOfMonth;
	}

	public List<ScheduleMonthType> getQuarterlyMonths(){
		return this.quarterlyMonths;
	}

	public void setQuarterlyMonths(List<ScheduleMonthType> quarterlyMonths){
		this.quarterlyMonths = quarterlyMonths;
	}

	public List<ScheduleMonthType> getSemiYearlyMonths(){
		return this.semiYearlyMonths;
	}

	public void setSemiYearlyMonths(List<ScheduleMonthType> semiYearlyMonths){
		this.semiYearlyMonths = semiYearlyMonths;
	}

	public ScheduleMonthType getYearlyMonth(){
		return this.yearlyMonth;
	}

	public void setYearlyMonth(ScheduleMonthType yearlyMonth){
		this.yearlyMonth = yearlyMonth;
	}
}
