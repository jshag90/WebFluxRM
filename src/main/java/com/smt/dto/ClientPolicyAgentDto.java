package com.smt.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClientPolicyAgentDto {
	
	private String processKillOption;
	
	private Integer processKillCount;
	
	private String isAcceptDelClient;
	
	private String isShowLog;
	
	private Integer logShowTime;
	
	private String logTitle;
	
	private String logContent;
	
	private String isShowTryIcon;
	
	private Integer whiteListVersion;
	
	private String ServerHealthCheck;
	
	private String isCollectMode;
	
	private Integer collectDays;
	
	private Integer clientIntegrityCycle;

	private Integer chkClientUpdateFileCycle;
	
	private String isServerIntegrity;
	
	private Integer pendingTimeout;
	
	private String isLeak;
	
	private List<String> powershellCmds;
	
}
