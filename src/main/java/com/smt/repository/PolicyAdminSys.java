package com.smt.repository;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ds_policy_admin_sys")
@Getter
@Setter
public class PolicyAdminSys {

	@Id
	private Long idx;
	
	@Column("is_collect_mode")
	private String isCollectMode;
	
	@Column("collect_days")
	private Integer collect_days;
	
	//기존 : all_backup_option
	@Column("server_health_check")
	private String serverHealthCheck;
	
	@Column("is_create_db_account")
	private String isCreateDbAccount;
	
	@Column("is_excute_db_backup")
	private String isExcuteDbBackup;
	
	@Column("backup_file_days")
	private Integer backupFileDays;
	
	@Column("log_file_days")
	private Integer logFileDays;

	@Column("log_days")
	private Integer logDays;

	@Column("white_list_version")
	private Integer whiteListVersion;
	
	@Column("ip_block" )
	private String ipBlock;

	@Column( "is_integrity" )
	private String isIntegrity;

	@Column("chk_integrity_cycle" )
	private Integer chkIntegrityCycle;
	
	@Column("chk_client_update_file_cycle")
	private Integer chkClientUpdateFileCycle;
	
	@Column("manual_path")
	private String manualPath;
	
	@Column("agent_installer_path")
	private String agentInstallerPath;
	
	@Column("pending_time_out")
	private Integer pendingTimeout;
	
	@Column("is_show_vt" )
	private String isShowVT;
	
}
