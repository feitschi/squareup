package at.feiertag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/square")
public class SquareController {

    @GET
    @Path("/{side}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateSquare(@PathParam("side") double side){
        double sqaure = side * side;

        return String.format("%.2f", sqaure);
    }
}
