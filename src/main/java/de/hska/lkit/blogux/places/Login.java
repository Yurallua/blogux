package de.hska.lkit.blogux.places;

import de.hska.lkit.blogux.util.UserExistsConstraint;

public class Login {

  @UserExistsConstraint
  private String name;
  
  private String pwd;
  private String pwdConfirm;
  private String content;
  private boolean islogin;

  /**
   * @author atimchenko
   *
   */
  public Login(){
    setIslogin(true);
  }

  public boolean getIslogin() {
    return islogin;
  }

  public void setIslogin(boolean isLogin) {
    this.islogin = isLogin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwdConfirm(String pwdConfirm) {
    this.pwdConfirm = pwdConfirm;
  }

  public String getPwdConfirm() {
    return pwdConfirm;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
