package com.lcvc.bysj.ticketsystem.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.lcvc.bysj.ticketsystem.entity.Admin;
//import com.tg.car.api.platform.model.application.entity.AppAccountEntity;
//import com.tg.car.api.platform.model.system.entity.AccountEntity;
import org.springframework.stereotype.Service;


/**
 * token验证
 * @author wfb
 */
@Service
public class TokenService {

    /**
     * token--后台管理
     * @param adminEntity
     * @return
     */
//    public String getToken(Admin adminEntity) {
//        String token= JWT.create().withAudience(adminEntity.getId())// 将 user id 保存到 token 里面
//                .sign(Algorithm.HMAC256(adminEntity.getTokenRandom()));// 以 UUID+随机数 作为 token 的密钥
//        return token;
//    }

    /**
     * token--app
     * @param appAccountEntity
     * @return
     */
    /*public String getToken(AppAccountEntity appAccountEntity) {
        String token = JWT.create().withAudience(appAccountEntity.getId())// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(appAccountEntity.getTokenRandom()));// 以 UUID 作为 token 的密钥
        return token;
    }*/

}