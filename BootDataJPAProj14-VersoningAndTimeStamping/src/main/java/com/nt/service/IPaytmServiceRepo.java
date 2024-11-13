package com.nt.service;

import java.util.List;

import com.nt.entity.Paytm;

public interface IPaytmServiceRepo {
	
	public String AddUserRecords(Paytm list);
	
	public String WithdrawAmount(Long SoumNo,Long DesMno,double trasAmt);

}
