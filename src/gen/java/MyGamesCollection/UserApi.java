package MyGamesCollection;

import io.swagger.model.User;

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
public interface UserApi  {

    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     */
    @POST
    @Path("/user")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Create user", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public Response createUser(@Valid User body);

    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     */
    @DELETE
    @Path("/user/{username}")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Delete user", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public Response deleteUser(@PathParam("username") String username);

    /**
     * Get user by user name
     *
     */
    @GET
    @Path("/user/{username}")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Get user by user name", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public Response getUserByName(@PathParam("username") String username);

    /**
     * Logs user into the system
     *
     */
    @GET
    @Path("/user/login")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Logs user into the system", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    public Response loginUser(@QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password);

    /**
     * Logs out current logged in user session
     *
     */
    @GET
    @Path("/user/logout")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Logs out current logged in user session", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public Response logoutUser();

    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     */
    @PUT
    @Path("/user/{username}")
    @Produces({ "application/json", "application/xml" })
    @ApiOperation(value = "Updated user", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public Response updateUser(@PathParam("username") String username, @Valid User body);
}

