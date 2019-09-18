package MyGamesCollection;

import io.swagger.model.Game;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * MyGamesCollection
 *
 * <p>This is a server for \"MyGamesCollection\" a site for curating and visualizing your collection of video games. [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 */
@Path("/RaesparkGames/GamesCollection/1.0.0")
@Api(value = "/", description = "")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface GameApi  {

    /**
     * Add a new game to the db
     *
     */
    @POST
    @Path("/game")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a new game to the db", tags={ "game",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    public Response addGame(@Valid Game body);

    /**
     * Deletes a game
     *
     */
    @DELETE
    @Path("/game/{gameId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a game", tags={ "game",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    public Response deleteGame(@PathParam("gameId") Long gameId, @HeaderParam("api_key") String apiKey);

    /**
     * Gets all games owned by logged in user
     *
     */
    @GET
    @Path("/game")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Gets all games owned by logged in user", tags={ "game",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 401, message = "User not logged in") })
    public Response getAllGames();

    /**
     * Find game by ID
     *
     * Returns a single game
     *
     */
    @GET
    @Path("/game/{gameId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find game by ID", tags={ "game",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Game.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Game not found") })
    public Response getGameById(@PathParam("gameId") Long gameId);

    /**
     * Updates a pet in the store with form data
     *
     */
    @PUT
    @Path("/game/{gameId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Updates a pet in the store with form data", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    public Response updatePetWithForm(@PathParam("gameId") Long gameId, @Multipart(value = "name", required = false)  String name, @Multipart(value = "status", required = false)  String status);
}

