package com.demo.interfacepractice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Navigation {
  private String direction;
  private String action;
}
