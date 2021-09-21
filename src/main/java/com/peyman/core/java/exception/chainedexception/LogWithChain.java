package com.peyman.core.java.exception.chainedexception;


import com.peyman.core.java.exception.chainedexception.exceptions.FriendOfManagerUpsetException;
import com.peyman.core.java.exception.chainedexception.exceptions.ManagerUpsetException;
import com.peyman.core.java.exception.chainedexception.exceptions.NoLeaveGrantedException;
import com.peyman.core.java.exception.chainedexception.exceptions.TeamLeadUpsetException;

public class LogWithChain {

    public static void main(String[] args) throws Exception {
        getLeave();
    }

    private static void getLeave() throws NoLeaveGrantedException {
        try {
            howIsTeamLead();
        } catch (TeamLeadUpsetException e) {
            throw new NoLeaveGrantedException("Leave not sanctioned.", e);
        }
    }

    private static void howIsTeamLead() throws TeamLeadUpsetException {
        try {
            howIsManager();
        } catch (ManagerUpsetException e) {
            throw new TeamLeadUpsetException("Team lead is not in good mood", e);
        }
    }

    private static void howIsManager() throws ManagerUpsetException {
        try {
            howIsGirlFriendOfManager();
        } catch (FriendOfManagerUpsetException e) {
            throw new ManagerUpsetException("Manager is in bad mood", e);
        }
    }

    private static void howIsGirlFriendOfManager() throws FriendOfManagerUpsetException {
        throw new FriendOfManagerUpsetException("Friend of manager is in bad mood");
    }
}
