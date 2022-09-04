package com.abasecode.opencode.base.toolkit.oss;

import com.abasecode.opencode.base.toolkit.oss.entity.OssStsParam;
import com.abasecode.opencode.base.toolkit.oss.entity.StsToken;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.sts.model.v20150401.AssumeRoleRequest;
import com.aliyuncs.sts.model.v20150401.AssumeRoleResponse;

/**
 * @author Jon
 * e-mail: ijonso123@gmail.com
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://github.com/abasecode">project github</a>
 * url: <a href="https://abasecode.com">AbaseCode.com</a>
 */
public class OssHandler {
    /**
     * Get OSS STS token
     *
     * @param ossParam
     * @return STS token
     */
    public StsToken getSTSToken(OssStsParam ossParam) {
        StsToken stsToken = new StsToken();
        try {
            DefaultProfile.addEndpoint("", "Sts", ossParam.getEndpoint());
            IClientProfile profile = DefaultProfile.getProfile("", ossParam.getAccessKeyId(), ossParam.getAccessKeySecret());
            DefaultAcsClient client = new DefaultAcsClient(profile);
            final AssumeRoleRequest request = new AssumeRoleRequest();
            request.setRoleArn(ossParam.getRoleArn());
            request.setRoleSessionName(ossParam.getRoleSessionName());
            request.setPolicy(ossParam.getPolicy());
            request.setDurationSeconds(ossParam.getExpiration());
            final AssumeRoleResponse response = client.getAcsResponse(request);
            stsToken.setExpiration(response.getCredentials().getExpiration());
            stsToken.setAccessKeyId(response.getCredentials().getAccessKeyId());
            stsToken.setAccessKeySecret(response.getCredentials().getAccessKeySecret());
            stsToken.setSecurityToken(response.getCredentials().getSecurityToken());
            stsToken.setRequestId(response.getRequestId());
        } catch (ClientException e) {
            System.out.println("Failed：" + e.getMessage());
        }
        return stsToken;
    }


}
