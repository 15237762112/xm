package com.zhiyou.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
   private String admin_id;
   private String accounts;
   private String password;
   private String admin_remark;
}
