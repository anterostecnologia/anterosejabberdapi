package br.com.anteros.ejabberd.api.hla;

import java.util.Arrays;
import java.util.Collection;

import br.com.anteros.ejabberd.api.AnterosEjabberdApi;
import br.com.anteros.ejabberd.api.Request;
import br.com.anteros.ejabberd.api.RequestFailedException;
import br.com.anteros.ejabberd.api.requests.*;
import br.com.anteros.ejabberd.api.results.Info;
import br.com.anteros.ejabberd.api.results.Last;

public class Ejabberd {

    private final AnterosEjabberdApi api;


    public Ejabberd(AnterosEjabberdApi api) {
        this.api = api;
    }

    public Collection<String> getConnectedUsers() throws RequestFailedException {
        return executeAndReturnAsStringCollection(new ConnectedUsers());
    }

    private Collection<String> executeAndReturnAsStringCollection(Request request) throws RequestFailedException {
        return Arrays.asList(api.execute(request, String[].class));
    }

    public Collection<String> getRegisteredUsers(String host) throws RequestFailedException {
        return executeAndReturnAsStringCollection(new RegisteredUsers(host));
    }

    public Collection<String> getRegisteredVhosts() throws RequestFailedException {
        return executeAndReturnAsStringCollection(new RegisteredVhosts());
    }

    public void register(String username, String host, String password) throws RequestFailedException {
        api.executeWithSuccessOrThrow(new Register(username, host, password));
    }

    public void unregister(String username, String host) throws RequestFailedException {
        api.executeWithSuccessOrThrow(new Unregister(username,host));
    }

    public boolean checkAccount(String username, String host) throws RequestFailedException {
        return api.execute(new CheckAccount(username, host));
    }

    public boolean checkPassword(String username, String host, String password) throws RequestFailedException {
        return api.execute(new CheckPassword(username, host, password));
    }

    public void changePassword(String username, String host, String newPassword) throws RequestFailedException {
        api.executeWithSuccessOrThrow(new ChangePassword(username, host, newPassword));
    }

    public boolean createSharedRosterGroup(String host, String group, String name) throws RequestFailedException {
        return api.execute(new SrgCreate(host, group, name));
    }

    public boolean deleteSharedRosterGroup(String host, String group) throws RequestFailedException {
        return api.execute(new SrgDelete(host, group));
    }

    public Collection<Info> getSharedRosterGroupInfo(String host, String group) throws RequestFailedException {
        return Arrays.asList(api.execute(new SrgGetInfo(host, group), Info[].class));
    }
    
    public Collection<String> getSharedRosterGroupMembers(String host, String group) throws RequestFailedException {
        return Arrays.asList(api.execute(new SrgGetMembers(host, group), String[].class));
    }

    public boolean addUserToShareRosterGroup(String host, String group, String user, String grouphost) throws RequestFailedException {
        return api.execute(new SrgUserAdd(host, group, user, grouphost));
    }

    public Collection<String> getUserResources(String username, String host) throws RequestFailedException {
        return executeAndReturnAsStringCollection(new UserResources(username, host));
    }

    public boolean sendChatMessage(String from, String to, String subject, String body) throws RequestFailedException {
        return api.execute(new SendMessage(from, to, subject, body));
    }
    public boolean setVCard(String user, String host, String name, String content) throws RequestFailedException {
        return api.execute(new SetVcard(user, host, name, content));
    }

    public Last getLast(String username, String host) throws RequestFailedException {
        return api.execute(new GetLast(username, host), Last.class);
    }

    public boolean reloadConfig() throws RequestFailedException {
        return api.execute(new ReloadConfig());
    }
}
