package com.ibm.fullstack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillDtl {
private Long skillId;
private String name="";
private String toc="";
private String prerequeistes="";

}
