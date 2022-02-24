package com.oracle.TeamFresh.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCmpstnListDto {
	
	private String compensation_no;
	private String causer_name;
	private String dman_name;
	private String discontent_reason;
	private String compensation_price;
	private String client_name;
	private String creation_date;
}
