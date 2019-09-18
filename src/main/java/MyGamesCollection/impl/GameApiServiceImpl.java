package MyGamesCollection.impl;

import MyGamesCollection.*;
import io.swagger.model.Game;

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
public class GameApiServiceImpl implements GameApi {
    /**
     * Add a new game to the db
     *
     */
    public Response addGame(Game body) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Deletes a game
     *
     */
    public Response deleteGame(Long gameId, String apiKey) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Gets all games owned by logged in user
     *
     */
    public Response getAllGames() {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Find game by ID
     *
     * Returns a single game
     *
     */
    public Response getGameById(Long gameId) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    /**
     * Updates a pet in the store with form data
     *
     */
    public Response updatePetWithForm(Long gameId, String name, String status) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}

