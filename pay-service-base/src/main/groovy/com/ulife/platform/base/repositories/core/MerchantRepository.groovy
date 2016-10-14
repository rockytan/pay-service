package com.ulife.platform.base.repositories.core

import com.ulife.platform.base.entities.core.Merchant
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by Rocky on 2016/10/14.
 */
interface MerchantRepository extends JpaRepository<Merchant,String>{

}