package MyGamesCollection.impl;

import MyGamesCollection.*;
import io.swagger.model.User;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * MyGamesCollection
 *
 * <p>This is a server for \"MyGamesCollection\" a site for curating and visualizing your collection of video games. [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 */
public class UserApiServiceImpl implements UserApi {
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     */
    public Response createUser(User body) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     */
    public Response deleteUser(String username) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Get user by user name
     *
     */
    public Response getUserByName(String username) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Logs user into the system
     *
     */
    public Response loginUser(String username, String password) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Logs out current logged in user session
     *
     */
    public Response logoutUser() {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     */
    public Response updateUser(String username, User body) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}

