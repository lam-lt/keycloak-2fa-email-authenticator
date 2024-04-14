package org.viettelcloud.authentication.authenticators.conditional;

import org.keycloak.authentication.AuthenticationFlowContext;
import lombok.extern.jbosslog.JBossLog;

@JBossLog
public class EmailOTPConditionalUserConfiguredAuthenticator extends ViettelConditionalUserConfiguredAuthenticator{
    @Override
    public boolean matchCondition(AuthenticationFlowContext context) {
        log.info("EmailOTPConditionalUserConfiguredAuthenticator matchCondition");
        log.info("EmailOTP: " + super.emailOTP);
        return super.emailOTP;
    }
}
