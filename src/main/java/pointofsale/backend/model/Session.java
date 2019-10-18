package pointofsale.backend.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Session extends  Additional{
    private static final long serialVersionUID = 1L;


    @OneToOne
    private MemberModel memberModel;

    @Column(name = "user_agent")
    private String userAgent;

    @Column(name = "ip_address")
    private String ipAddress;

    public MemberModel getMemberModel() {
        return memberModel;
    }

    public void setMemberModel(MemberModel memberModel) {
        this.memberModel = memberModel;
    }

    @Column(name = "login_time")
    private Integer loginTime;

    @Column(name = "logout_time")
    private Integer logoutTime;

    @Column(name = "last_used_token")
    private String lastUsedToken;

    @Column(name = "is_blocked")
    private Boolean isBlocked;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Integer logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getLastUsedToken() {
        return lastUsedToken;
    }

    public void setLastUsedToken(String lastUsedToken) {
        this.lastUsedToken = lastUsedToken;
    }

    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }
}
