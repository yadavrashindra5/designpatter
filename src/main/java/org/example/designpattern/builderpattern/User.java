package org.example.designpattern.builderpattern;

public class User {
    private String userId;
    private String userName;
    private String emailId;

    private User(){
        //intialize
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    static class UserBuilder{
        private String userId;
        private String userName;
        private String emailId;

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }
}
