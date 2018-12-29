package com.hsx.wx.cp.config;

import java.util.List;

import com.hsx.wx.cp.utils.JsonUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "wechat.cp")
public class WxCpProperties {
  /**
   * 设置微信企业号的corpId
   */
  private String corpId;

  private List<AppConfig> appConfigs;

  @Getter
  @Setter
  public static class AppConfig {
    /**
     * 设置微信企业应用的AgentId
     */
    private Integer agentId;

    /**
     * 设置微信企业应用的Secret
     */
    private String secret;

    /**
     * 设置微信企业号的token
     */
    private String token;

    /**
     * 设置微信企业号的EncodingAESKey
     */
    private String aesKey;

  }

  @Override
  public String toString() {
    return JsonUtils.toJson(this);
  }
}
