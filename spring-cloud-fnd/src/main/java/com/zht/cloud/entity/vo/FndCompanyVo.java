package com.zht.cloud.entity.vo;

import com.zht.cloud.entity.FndAccountInfo;
import com.zht.cloud.entity.FndAddressInfo;
import com.zht.cloud.entity.FndCompany;
import com.zht.cloud.entity.FndContactInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 张洪涛
 * @create 2020-06-05 13:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FndCompanyVo {
    private FndCompany fndCompany;
    private List<FndAccountInfo> accountInfos;
    private List<FndAddressInfo> addressInfos;
    private List<FndContactInfo> contactInfos;
}
