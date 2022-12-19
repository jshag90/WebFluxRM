package com.smt.repository;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ds_client")
@Getter
@Setter
public class Client {

    @Id
    private Long clientIdx;

    @Column("com_name")
    private String comName;

    @Column("account_name")
    private String accountName;

    @Column("client_version")
    private String clientVersion;

    @Column("local_ip")
    private String localIp;

    @Column("local_ip2long")
    private Long localIp2Long;

    @Column("remote_ip")
    private String remoteIp;

    @Column("remote_ip2long")
    private Long remoteIp2Long;

    @Column("major")
    private Integer major;

    @Column("minor")
    private Integer minor;

    @Column("bit")
    private Integer bit;

    @Column("ubr")
    private Integer ubr;

    @Column("build")
    private Integer build;

    @Column("create_time")
    private Date createTime;

    @Column("access_time")
    private Date accessTime;

    @Column("active")
    private String active;

    @Column("uid")
    private String uid;

    @Column("sid")
    private String sid;

    @Column("mac")
    private String mac;

}
