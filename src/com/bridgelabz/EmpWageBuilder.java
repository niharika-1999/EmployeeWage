package com.bridgelabz;

public class EmpWageBuilder {
	
		 //Constants
		 public static final int IS_FULL_TIME=2;
		 public static final int IS_PART_TIME=1;
		 private final String Company;
		 private final int EmpRatePerHour;
		 private final int NumOfWorkingDays;
		 private final int MaxHoursPerMonth;
		 
		 public EmpWageBuilder(String Company,int EmpRatePerHour, int NumOfWorkingDays,int MaxHoursPerMonth)
		 {
			 this.Company=Company;
			 this.EmpRatePerHour=EmpRatePerHour;
			 this.NumOfWorkingDays=NumOfWorkingDays;
			 this.MaxHoursPerMonth=MaxHoursPerMonth;
		 }
		 
		 public static void main(String[] args) {
			 EmpWageBuilder DMart=new EmpWageBuilder("DMart",20,2,10); 
		 //Variables
		 int EmpHrs=0,totalWorkingDays=0,totalEmpHrs=0;
		 //Computation
		
		 while(totalEmpHrs<=DMart.MaxHoursPerMonth && totalWorkingDays<=DMart.NumOfWorkingDays) {
			 totalWorkingDays++;
			 int EmpCheck =(int) Math.floor(Math.random()*10)%3;
		     switch(EmpCheck) {
		 
		     case IS_FULL_TIME:
			   EmpHrs=8;
			   break;
			 case IS_PART_TIME:
			   EmpHrs=4;
			   break;
			 default:
			   EmpHrs=0;
			 }
		     totalEmpHrs+=EmpHrs;
             System.out.println("Day#:"+totalWorkingDays+ "EmpHrs:"+EmpHrs);
		 }
             int totalEmpWage=totalEmpHrs*DMart.EmpRatePerHour;
			 System.out.println("TotalEmpWage for Company:"+DMart.Company+ " is:"+totalEmpWage);
			 
					 
   }

  }

