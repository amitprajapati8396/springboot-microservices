package com.user.service.beans;

import com.user.service.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseTemplate {
   private User user;
   private  Department department;
}
