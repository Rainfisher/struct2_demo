package com.obsidian.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Alex Chou <xi.zhou at obsidian>
 */
public class LoginAction extends ActionSupport {

    private int username;

    private int password;

    @Override
    public String execute() throws Exception {
        System.out.println("username" + username);
        System.out.println("password" + password);
        if (getUsername() != 1 && getPass_word() != 2) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public int getPass_word() {
        return password;
    }

    public void setPass_word(int password) {
        this.password = password;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

}
