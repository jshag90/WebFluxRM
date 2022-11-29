package com.smt.repository;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;

@Table("ds_policy_client")
@Getter
@Setter
public class PolicyClient {

	@Id
	private Long idx;
	
	@Column("max_license_cnt")
	private Integer maxLicenseCnt;
	
	@Column("active_license_date")
	private Integer activeLicenseDate;
	
	@Column("expire_license_date")
	private LocalDateTime expireLicenseDate;
	
	@Column("process_kill_option")
	private String processKillOption;
	
	@Column("process_kill_count")
	private Integer processKillCount;
	
	@Column("is_accept_del_client")
	private String isAcceptDelClient;
	
	@Column("is_show_log")
	private String isShowLog;
	
	@Column("log_show_time")
	private Integer logShowTime;
	
	@Column("log_title")
	private String logTitle;
	
	@Column("log_content")
	private String logContent;
	
	@Column("is_show_try_icon")
	private String isShowTryIcon;
	
	@Column("client_integrity_cycle")
	private Integer clientIntegrityCycle;
	
	@Column("is_leak")
	private String isLeak;
	
}
