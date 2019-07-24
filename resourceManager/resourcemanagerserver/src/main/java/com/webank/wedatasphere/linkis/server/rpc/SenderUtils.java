/*
package com.webank.wedatasphere.linkis.server.rpc;

import com.webank.wedatasphere.linkis.common.ServiceInstance;
import com.webank.wedatasphere.linkis.rpc.Sender;
import com.webank.wedatasphere.linkis.rpc.sender.SpringMVCRPCSender;

/**
 * Created by shanhuang on 9/11/18.
 */

public class SenderUtils {

    public static ServiceInstance getModuleInstance(Sender sender) {
        SpringMVCRPCSender springMVCRPCSender = (SpringMVCRPCSender) sender;
        RPCIRule rule = (RPCIRule) springMVCRPCSender.createLoadBalancerRule();
        return rule.moduleInstance();
    }
}
*/
