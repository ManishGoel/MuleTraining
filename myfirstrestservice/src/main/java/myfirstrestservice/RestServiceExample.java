package myfirstrestservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/schools")
public class RestServiceExample {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getSchoolDetails(@PathParam("id")String param) {
		StringBuilder sb = new StringBuilder();
		sb.append("School Details are   :::  ");
		if ("1".equals(param)) {
			sb.append("IMS Ghaziabad  ");
			sb.append("UP");
		} else if ("2".equals(param)) {
			sb.append("DAV Pune  ");
			sb.append("Maharashtra");
		} else {
			sb.delete(0, sb.length());
			sb.append("Go Back and Do your JOB");
		}
		
		return Response.ok(sb.toString()).build();
	}
}
